package com.nyimbozamani.nyimbozazamani.interfaces

import android.view.View
import com.nyimbozamani.nyimbozazamani.db.PlaylistWithSongs

interface IPlaylistClickListener {
    fun onPlaylistClick(playlistWithSongs: PlaylistWithSongs, view: View)
}