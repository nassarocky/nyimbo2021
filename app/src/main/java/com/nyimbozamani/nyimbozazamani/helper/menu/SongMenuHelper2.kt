/*
 * Copyright (c) 2020 Hemanth Savarla.
 *
 * Licensed under the GNU General Public License v3
 *
 * This is free software: you can redistribute it and/or modify it
 * under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU General Public License for more details.
 *
 */
package com.nyimbozamani.nyimbozazamani.helper.menu

import android.app.DownloadManager
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.net.Uri
import android.os.Environment
import android.view.MenuItem
import android.view.View
import android.webkit.URLUtil
import android.widget.PopupMenu
import androidx.core.os.bundleOf
import androidx.fragment.app.FragmentActivity
import androidx.navigation.findNavController
import com.nyimbozamani.nyimbozazamani.App
import com.nyimbozamani.nyimbozazamani.EXTRA_ALBUM_ID
import com.nyimbozamani.nyimbozazamani.EXTRA_ARTIST_ID
import com.nyimbozamani.nyimbozazamani.R
import com.nyimbozamani.nyimbozazamani.activities.tageditor.AbsTagEditorActivity
import com.nyimbozamani.nyimbozazamani.activities.tageditor.SongTagEditorActivity
import com.nyimbozamani.nyimbozazamani.dialogs.AddToPlaylistDialog
import com.nyimbozamani.nyimbozazamani.dialogs.DeleteSongsDialog
import com.nyimbozamani.nyimbozazamani.dialogs.SongDetailDialog
import com.nyimbozamani.nyimbozazamani.helper.MusicPlayerRemote
import com.nyimbozamani.nyimbozazamani.interfaces.IPaletteColorHolder
import com.nyimbozamani.nyimbozazamani.model.Song
import com.nyimbozamani.nyimbozazamani.repository.RealRepository
import com.nyimbozamani.nyimbozazamani.util.MusicUtil
import com.nyimbozamani.nyimbozazamani.util.RingtoneManager
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import org.koin.core.KoinComponent
import org.koin.core.get
import java.io.File

object SongMenuHelper2 : KoinComponent {
    const val MENU_RES = R.menu.menu_item_song2
    private var downloadReference: Long = 0
    private lateinit var downloadManager: DownloadManager
    fun handleMenuClick(activity: FragmentActivity, song: Song, menuItemId: Int): Boolean {
        when (menuItemId) {
            R.id.download -> {
  downloadFile(song.data,"audio")
            }
            R.id.share -> {
                activity.startActivity(
                        Intent.createChooser(
                                MusicUtil.createShareSongFileIntent(song, activity),
                                null
                        )
                )
                return true
            }

        }
        return false
    }

    abstract class OnClickSongMenu(private val activity: FragmentActivity) :
            View.OnClickListener, PopupMenu.OnMenuItemClickListener {

        open val menuRes: Int
            get() = MENU_RES

        abstract val song: Song

        override fun onClick(v: View) {
            val popupMenu = PopupMenu(activity, v)
            popupMenu.inflate(menuRes)
            popupMenu.setOnMenuItemClickListener(this)
            popupMenu.show()
        }

        override fun onMenuItemClick(item: MenuItem): Boolean {
            return handleMenuClick(activity, song, item.itemId)
        }
    }

    private val receiver = object : BroadcastReceiver() {
        override fun onReceive(context: Context, intent: Intent) {
            val action = intent.action
            if (action == DownloadManager.ACTION_DOWNLOAD_COMPLETE) {
                val downloadId = intent.getLongExtra(DownloadManager.EXTRA_DOWNLOAD_ID, -1)
                if (downloadId != downloadReference) {
                    context.unregisterReceiver(this)
                    return
                }
                val query = DownloadManager.Query()
                query.setFilterById(downloadReference)
                val cursor = downloadManager.query(query)
                cursor?.let {
                    if (cursor.moveToFirst()) {
                        val columnIndex = cursor.getColumnIndex(DownloadManager.COLUMN_STATUS)
                        if (DownloadManager.STATUS_SUCCESSFUL == cursor.getInt(columnIndex)) {
                            var localFile = cursor.getString(cursor.getColumnIndex(DownloadManager.COLUMN_LOCAL_URI))

                            if (localFile.contains("file:///")) {
                                localFile = localFile.removePrefix("file:///").substringBeforeLast(File.separator)
                            }
                        //    context.toast(context.resources.getString(R.string.saved, localFile), Toast.LENGTH_LONG)

                        } else if (DownloadManager.STATUS_FAILED == cursor.getInt(columnIndex)) {
                         //   val message = context.resources.getString(R.string.error_download, cursor.getString(cursor.getColumnIndex(DownloadManager.COLUMN_REASON)))
                          //  context.toast(message, Toast.LENGTH_LONG)
                        }
                    }
                    cursor.close()
                }

                context.unregisterReceiver(this)

            }
        }
    }
    fun downloadFile(url: String, mimeType: String? = null) {

        val guessFileName = URLUtil.guessFileName(url, null, mimeType)

     //   Timber.d("mimeType -> $mimeType guessFileName -> $guessFileName created by url -> $url")

        val context = App.getContext()

        downloadManager = context.getSystemService(Context.DOWNLOAD_SERVICE) as DownloadManager

        val downloadUri = Uri.parse(url)

        val request = DownloadManager.Request(downloadUri)
        request.apply {
            setAllowedNetworkTypes(DownloadManager.Request.NETWORK_MOBILE or DownloadManager.Request.NETWORK_WIFI)
            //setAllowedOverRoaming(true)
            setTitle(guessFileName)
            setDescription(guessFileName)
            setVisibleInDownloadsUi(true)
            allowScanningByMediaScanner()
            setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED)

            //request.setDestinationUri(Uri.fromFile(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES)))
            setDestinationInExternalPublicDir(Environment.DIRECTORY_MUSIC, guessFileName)

            context.registerReceiver(receiver, IntentFilter(DownloadManager.ACTION_DOWNLOAD_COMPLETE))

            downloadReference = downloadManager.enqueue(this)
        }
    }

}
