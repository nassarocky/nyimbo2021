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
package com.nyimbozamani.nyimbozazamani.activities

import android.content.Intent
import android.content.SharedPreferences
import android.content.SharedPreferences.OnSharedPreferenceChangeListener
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import android.view.View
import androidx.lifecycle.lifecycleScope
import androidx.navigation.ui.NavigationUI
import com.google.android.gms.ads.MobileAds

import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.ValueEventListener
import com.google.firebase.database.ktx.database
import com.google.firebase.database.ktx.getValue
import com.google.firebase.ktx.Firebase
import com.nyimbozamani.nyimbozazamani.ADAPTIVE_COLOR_APP
import com.nyimbozamani.nyimbozazamani.ALBUM_COVER_STYLE
import com.nyimbozamani.nyimbozazamani.ALBUM_COVER_TRANSFORM
import com.nyimbozamani.nyimbozazamani.BANNER_IMAGE_PATH
import com.nyimbozamani.nyimbozazamani.BLACK_THEME
import com.nyimbozamani.nyimbozazamani.CAROUSEL_EFFECT
import com.nyimbozamani.nyimbozazamani.CIRCULAR_ALBUM_ART
import com.nyimbozamani.nyimbozazamani.DESATURATED_COLOR
import com.nyimbozamani.nyimbozazamani.EXTRA_SONG_INFO
import com.nyimbozamani.nyimbozazamani.GENERAL_THEME
import com.nyimbozamani.nyimbozazamani.HOME_ARTIST_GRID_STYLE
import com.nyimbozamani.nyimbozazamani.KEEP_SCREEN_ON
import com.nyimbozamani.nyimbozazamani.LANGUAGE_NAME
import com.nyimbozamani.nyimbozazamani.LIBRARY_CATEGORIES
import com.nyimbozamani.nyimbozazamani.NOW_PLAYING_SCREEN_ID
import com.nyimbozamani.nyimbozazamani.PROFILE_IMAGE_PATH
import com.nyimbozamani.nyimbozazamani.R
import com.nyimbozamani.nyimbozazamani.ROUND_CORNERS
import com.nyimbozamani.nyimbozazamani.TAB_TEXT_MODE
import com.nyimbozamani.nyimbozazamani.TOGGLE_ADD_CONTROLS
import com.nyimbozamani.nyimbozazamani.TOGGLE_FULL_SCREEN
import com.nyimbozamani.nyimbozazamani.TOGGLE_GENRE
import com.nyimbozamani.nyimbozazamani.TOGGLE_HOME_BANNER
import com.nyimbozamani.nyimbozazamani.TOGGLE_SEPARATE_LINE
import com.nyimbozamani.nyimbozazamani.TOGGLE_VOLUME
import com.nyimbozamani.nyimbozazamani.USER_NAME
import com.nyimbozamani.nyimbozazamani.activities.base.AbsSlidingMusicPanelActivity
import com.nyimbozamani.nyimbozazamani.extensions.findNavController
import com.nyimbozamani.nyimbozazamani.helper.MusicPlayerRemote
import com.nyimbozamani.nyimbozazamani.helper.SearchQueryHelper.getSongs
import com.nyimbozamani.nyimbozazamani.model.Audio
import com.nyimbozamani.nyimbozazamani.model.CategoryInfo
import com.nyimbozamani.nyimbozazamani.model.Song
import com.nyimbozamani.nyimbozazamani.repository.PlaylistSongsLoader
import com.nyimbozamani.nyimbozazamani.service.MusicService
import com.nyimbozamani.nyimbozazamani.util.AppRater
import com.nyimbozamani.nyimbozazamani.util.PreferenceUtil
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.launch
import org.koin.android.ext.android.get

class MainActivity : AbsSlidingMusicPanelActivity(), OnSharedPreferenceChangeListener {
    companion object {
        const val TAG = "MainActivity"
        const val EXPAND_PANEL = "expand_panel"
        const val APP_UPDATE_REQUEST_CODE = 9002
    }

    val database = Firebase.database
    val myRef = database.getReference("audios")

    var list = arrayListOf<Song>()
    override fun createContentView(): View {
        return wrapSlidingMusicPanel()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        myRef.keepSynced(true)
        songsOnline()
        setDrawUnderStatusBar()
        super.onCreate(savedInstanceState)
        setStatusbarColorAuto()
        setNavigationbarColorAuto()
        setLightNavigationBar(true)
        setTaskDescriptionColorAuto()
        hideStatusBar()
        AppRater.appLaunched(this)
        updateTabs()
      MobileAds.initialize(this) {}


        // NavigationUI.setupWithNavController(getBottomNavigationView(), findNavController(R.id.fragment_container))
        setupNavigationController()
        if (!hasPermissions()) {
            findNavController(R.id.fragment_container).navigate(R.id.permissionFragment)
        }

        showPromotionalDialog()
    }

    private fun showPromotionalDialog() {

    }

    private fun setupNavigationController() {
        val navController = findNavController(R.id.fragment_container)
        val navInflater = navController.navInflater
        val navGraph = navInflater.inflate(R.navigation.main_graph)

        val categoryInfo: CategoryInfo = PreferenceUtil.libraryCategory.first { it.visible }
        if (categoryInfo.visible) {
            navGraph.startDestination = categoryInfo.category.id
        }
        navController.graph = navGraph
        NavigationUI.setupWithNavController(getBottomNavigationView(), navController)
    }

    override fun onSupportNavigateUp(): Boolean =
        findNavController(R.id.fragment_container).navigateUp()

    override fun onResume() {
        super.onResume()
        PreferenceUtil.registerOnSharedPreferenceChangedListener(this)
        if (intent.hasExtra(EXPAND_PANEL) &&
            intent.getBooleanExtra(EXPAND_PANEL, false) &&
            PreferenceUtil.isExpandPanel
        ) {
            expandPanel()
            intent.removeExtra(EXPAND_PANEL)
        }
    }

    override fun onSharedPreferenceChanged(sharedPreferences: SharedPreferences?, key: String?) {
        if (key == GENERAL_THEME || key == BLACK_THEME || key == ADAPTIVE_COLOR_APP || key == USER_NAME || key == TOGGLE_FULL_SCREEN || key == TOGGLE_VOLUME || key == ROUND_CORNERS || key == CAROUSEL_EFFECT || key == NOW_PLAYING_SCREEN_ID || key == TOGGLE_GENRE || key == BANNER_IMAGE_PATH || key == PROFILE_IMAGE_PATH || key == CIRCULAR_ALBUM_ART || key == KEEP_SCREEN_ON || key == TOGGLE_SEPARATE_LINE || key == TOGGLE_HOME_BANNER || key == TOGGLE_ADD_CONTROLS || key == ALBUM_COVER_STYLE || key == HOME_ARTIST_GRID_STYLE || key == ALBUM_COVER_TRANSFORM || key == DESATURATED_COLOR || key == EXTRA_SONG_INFO || key == TAB_TEXT_MODE || key == LANGUAGE_NAME || key == LIBRARY_CATEGORIES
        ) {
            postRecreate()
        }
    }

    override fun onServiceConnected() {
        super.onServiceConnected()
        if (intent == null) {
            return
        }
        handlePlaybackIntent(intent)
    }

    private fun handlePlaybackIntent(intent: Intent) {
        lifecycleScope.launch(IO) {
            val uri: Uri? = intent.data
            val mimeType: String? = intent.type
            var handled = false
            if (intent.action != null &&
                intent.action == MediaStore.INTENT_ACTION_MEDIA_PLAY_FROM_SEARCH
            ) {
                val songs: List<Song> = getSongs(intent.extras!!)
                if (MusicPlayerRemote.shuffleMode == MusicService.SHUFFLE_MODE_SHUFFLE) {
                    MusicPlayerRemote.openAndShuffleQueue(songs, true)
                } else {
                    MusicPlayerRemote.openQueue(songs, 0, true)
                }
                handled = true
            }
            if (uri != null && uri.toString().isNotEmpty()) {
                MusicPlayerRemote.playFromUri(uri)
                handled = true
            } else if (MediaStore.Audio.Playlists.CONTENT_TYPE == mimeType) {
                val id = parseLongFromIntent(intent, "playlistId", "playlist")
                if (id >= 0L) {
                    val position: Int = intent.getIntExtra("position", 0)
                    val songs: List<Song> = PlaylistSongsLoader.getPlaylistSongList(get(), id)
                    MusicPlayerRemote.openQueue(songs, position, true)
                    handled = true
                }
            } else if (MediaStore.Audio.Albums.CONTENT_TYPE == mimeType) {
                val id = parseLongFromIntent(intent, "albumId", "album")
                if (id >= 0L) {
                    val position: Int = intent.getIntExtra("position", 0)
                    val songs = libraryViewModel.albumById(id).songs
                    MusicPlayerRemote.openQueue(
                        songs,
                        position,
                        true
                    )
                    handled = true
                }
            } else if (MediaStore.Audio.Artists.CONTENT_TYPE == mimeType) {
                val id = parseLongFromIntent(intent, "artistId", "artist")
                if (id >= 0L) {
                    val position: Int = intent.getIntExtra("position", 0)
                    val songs: List<Song> = libraryViewModel.artistById(id).songs
                    MusicPlayerRemote.openQueue(
                        songs,
                        position,
                        true
                    )
                    handled = true
                }
            }
            if (handled) {
                setIntent(Intent())
            }
        }
    }

    private fun parseLongFromIntent(
        intent: Intent,
        longKey: String,
        stringKey: String
    ): Long {
        var id = intent.getLongExtra(longKey, -1)
        if (id < 0) {
            val idString = intent.getStringExtra(stringKey)
            if (idString != null) {
                try {
                    id = idString.toLong()
                } catch (e: NumberFormatException) {
                    println(e.message)
                }
            }
        }
        return id
    }

     fun songsOnline(): List<Song> {



        //lateinit var list: ArrayList<Song>

        //  var dumbSong=Song(1,"dumbSong",1,2020,12,"dumb",System.currentTimeMillis(),2,"dumbArtist",2,"dumbArtist","dumbartist","dumbArtist")

        myRef.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot) {
                var i:Long=100
                var j:Int=101


                dataSnapshot.children.forEach { child ->
                    // Extract Message object from the DataSnapshot
                    var audio: Audio? = child.getValue<Audio>()

                    audio?.let {
                        var  song=Song(1,"dumbSong",1,2020,12,"dumb",System.currentTimeMillis(),2,"dumbArtist",2,"dumbArtist","dumbartist","dumbArtist")

                        song.id=i
                        song.title=it.name
                        song.trackNumber=j
                        song.year=2020
                        song.duration=120
                        song.data=it.downloadUrl
                        song.dateModified=System.currentTimeMillis()
                        song.albumId=i
                        song.albumName=it.artist
                        song.artistId=i
                        song.artistName=it.artist
                        song.composer=it.artist
                        song.albumArtist=it.artist
                        list.add(song)
                    }

                    i=i+1



                }

            }

            override fun onCancelled(databaseError: DatabaseError) {
                // Getting Post failed, log a message
                //  Log.w(TAG, "loadPost:onCancelled", databaseError.toException())
                // ...
            }


        })
        return list
    }

}
