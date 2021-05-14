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
package com.nyimbozamani.nyimbozazamani.dialogs

import android.app.Dialog
import android.os.Bundle
import androidx.core.text.HtmlCompat
import androidx.fragment.app.DialogFragment
import com.nyimbozamani.nyimbozazamani.EXTRA_SONG
import com.nyimbozamani.nyimbozazamani.R
import com.nyimbozamani.nyimbozazamani.extensions.colorButtons
import com.nyimbozamani.nyimbozazamani.extensions.extraNotNull
import com.nyimbozamani.nyimbozazamani.extensions.materialDialog
import com.nyimbozamani.nyimbozazamani.fragments.LibraryViewModel
import com.nyimbozamani.nyimbozazamani.helper.MusicPlayerRemote
import com.nyimbozamani.nyimbozazamani.model.Song
import com.nyimbozamani.nyimbozazamani.util.MusicUtil
import org.koin.androidx.viewmodel.ext.android.sharedViewModel

class DeleteSongsDialog : DialogFragment() {
    private val libraryViewModel by sharedViewModel<LibraryViewModel>()

    companion object {
        fun create(song: Song): DeleteSongsDialog {
            val list = ArrayList<Song>()
            list.add(song)
            return create(list)
        }

        fun create(songs: List<Song>): DeleteSongsDialog {
            val dialog = DeleteSongsDialog()
            val args = Bundle()
            args.putParcelableArrayList(EXTRA_SONG, ArrayList(songs))
            dialog.arguments = args
            return dialog
        }
    }

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val songs = extraNotNull<List<Song>>(EXTRA_SONG).value
        val pair = if (songs.size > 1) {
            Pair(
                R.string.delete_songs_title,
                HtmlCompat.fromHtml(
                    String.format(getString(R.string.delete_x_songs), songs.size),
                    HtmlCompat.FROM_HTML_MODE_LEGACY
                )
            )
        } else {
            Pair(
                R.string.delete_song_title,
                HtmlCompat.fromHtml(
                    String.format(getString(R.string.delete_song_x), songs[0].title),
                    HtmlCompat.FROM_HTML_MODE_LEGACY
                )
            )
        }

        return materialDialog(pair.first)
            .setMessage(pair.second)
            .setCancelable(false)
            .setPositiveButton(R.string.action_delete) { _, _ ->
                if (songs.isNotEmpty() and (songs.size == 1) and MusicPlayerRemote.isPlaying(songs.first())) {
                    MusicPlayerRemote.playNextSong()
                }
                MusicUtil.deleteTracks(requireActivity(), songs)
                libraryViewModel.deleteTracks(songs)
            }
            .create()
            .colorButtons()
    }
}
