/*
 * Copyright (c) 2019 Hemanth Savarala.
 *
 * Licensed under the GNU General Public License v3
 *
 * This is free software: you can redistribute it and/or modify it under
 * the terms of the GNU General Public License as published by
 *  the Free Software Foundation either version 3 of the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU General Public License for more details.
 */
package com.nyimbozamani.nyimbozazamani.model

import android.os.Parcelable
import com.nyimbozamani.nyimbozazamani.db.HistoryEntity
import com.nyimbozamani.nyimbozazamani.db.SongEntity
import kotlinx.android.parcel.Parcelize

// update equals and hashcode if fields changes
@Parcelize
open class Song(
    open var id: Long,
    open var title: String,
    open var trackNumber: Int,
    open var year: Int,
    open var duration: Long,
    open var data: String,
    open var dateModified: Long,
    open var albumId: Long,
    open var albumName: String,
    open var artistId: Long,
    open var artistName: String,
    open var composer: String?,
    open var albumArtist: String?
) : Parcelable {


    // need to override manually because is open and cannot be a data class
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Song

        if (id != other.id) return false
        if (title != other.title) return false
        if (trackNumber != other.trackNumber) return false
        if (year != other.year) return false
        if (duration != other.duration) return false
        if (data != other.data) return false
        if (dateModified != other.dateModified) return false
        if (albumId != other.albumId) return false
        if (albumName != other.albumName) return false
        if (artistId != other.artistId) return false
        if (artistName != other.artistName) return false
        if (composer != other.composer) return false
        if (albumArtist != other.albumArtist) return false

        return true
    }

    override fun hashCode(): Int {
        var result = id.hashCode()
        result = 31 * result + title.hashCode()
        result = 31 * result + trackNumber
        result = 31 * result + year
        result = 31 * result + duration.hashCode()
        result = 31 * result + data.hashCode()
        result = 31 * result + dateModified.hashCode()
        result = 31 * result + albumId.hashCode()
        result = 31 * result + albumName.hashCode()
        result = 31 * result + artistId.hashCode()
        result = 31 * result + artistName.hashCode()
        result = 31 * result + (composer?.hashCode() ?: 0)
        result = 31 * result + (albumArtist?.hashCode() ?: 0)
        return result
    }


    companion object {

        @JvmStatic
        var emptySong = Song(
            id = -1,
            title = "",
            trackNumber = -1,
            year = -1,
            duration = -1,
            data = "",
            dateModified = -1,
            albumId = -1,
            albumName = "",
            artistId = -1,
            artistName = "",
            composer = "",
            albumArtist = ""
        )
    }
}