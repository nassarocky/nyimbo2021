package com.nyimbozamani.nyimbozazamani.model.smartplaylist

import com.nyimbozamani.nyimbozazamani.App
import com.nyimbozamani.nyimbozazamani.R
import com.nyimbozamani.nyimbozazamani.model.Song
import kotlinx.android.parcel.Parcelize
import org.koin.core.KoinComponent

@Parcelize
class HistoryPlaylist : AbsSmartPlaylist(
    name = App.getContext().getString(R.string.history),
    iconRes = R.drawable.ic_history
), KoinComponent {

    override fun songs(): List<Song> {
        return topPlayedRepository.recentlyPlayedTracks()
    }
}