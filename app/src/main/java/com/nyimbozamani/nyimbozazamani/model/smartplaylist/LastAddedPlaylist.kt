package com.nyimbozamani.nyimbozazamani.model.smartplaylist

import com.nyimbozamani.nyimbozazamani.App
import com.nyimbozamani.nyimbozazamani.R
import com.nyimbozamani.nyimbozazamani.model.Song
import kotlinx.android.parcel.Parcelize

@Parcelize
class LastAddedPlaylist : AbsSmartPlaylist(
    name = App.getContext().getString(R.string.last_added),
    iconRes = R.drawable.ic_library_add
) {
    override fun songs(): List<Song> {
        return lastAddedRepository.recentSongs()
    }
}