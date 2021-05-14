package com.nyimbozamani.nyimbozazamani.interfaces

import com.nyimbozamani.nyimbozazamani.model.Album
import com.nyimbozamani.nyimbozazamani.model.Artist
import com.nyimbozamani.nyimbozazamani.model.Genre

interface IHomeClickListener {
    fun onAlbumClick(album: Album)

    fun onArtistClick(artist: Artist)

    fun onGenreClick(genre: Genre)
}