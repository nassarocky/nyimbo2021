package com.nyimbozamani.nyimbozazamani.model.smartplaylist

import com.nyimbozamani.nyimbozazamani.App
import com.nyimbozamani.nyimbozazamani.R
import com.nyimbozamani.nyimbozazamani.model.Song
import kotlinx.android.parcel.Parcelize

@Parcelize
class TopTracksPlaylist : AbsSmartPlaylist(
    name = App.getContext().getString(R.string.my_top_tracks),
    iconRes = R.drawable.ic_trending_up
) {
    override fun songs(): List<Song> {
        return topPlayedRepository.topTracks()
    }
}