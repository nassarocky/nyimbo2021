package com.nyimbozamani.nyimbozazamani.model.smartplaylist

import com.nyimbozamani.nyimbozazamani.App
import com.nyimbozamani.nyimbozazamani.R
import com.nyimbozamani.nyimbozazamani.model.Song
import kotlinx.android.parcel.Parcelize

@Parcelize
class NotPlayedPlaylist : AbsSmartPlaylist(
    name = App.getContext().getString(R.string.not_recently_played),
    iconRes = R.drawable.ic_watch_later
) {
    override fun songs(): List<Song> {
        return topPlayedRepository.notRecentlyPlayedTracks()
    }
}