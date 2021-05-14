package com.nyimbozamani.nyimbozazamani.model.smartplaylist

import com.nyimbozamani.nyimbozazamani.App
import com.nyimbozamani.nyimbozazamani.R
import com.nyimbozamani.nyimbozazamani.model.Song
import kotlinx.android.parcel.Parcelize

@Parcelize
class ShuffleAllPlaylist : AbsSmartPlaylist(
    name = App.getContext().getString(R.string.action_shuffle_all),
    iconRes = R.drawable.ic_shuffle
) {
    override fun songs(): List<Song> {
        return songRepository.songs()
    }
}