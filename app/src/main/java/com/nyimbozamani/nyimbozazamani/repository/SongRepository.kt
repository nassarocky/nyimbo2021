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

package com.nyimbozamani.nyimbozazamani.repository

import android.content.Context
import android.database.Cursor
import android.provider.MediaStore
import android.provider.MediaStore.Audio.AudioColumns
import android.provider.MediaStore.Audio.Media
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.ValueEventListener
import com.google.firebase.database.ktx.database
import com.google.firebase.database.ktx.getValue
import com.google.firebase.ktx.Firebase
import com.nyimbozamani.nyimbozazamani.Constants.IS_MUSIC
import com.nyimbozamani.nyimbozazamani.Constants.baseProjection
import com.nyimbozamani.nyimbozazamani.extensions.getInt
import com.nyimbozamani.nyimbozazamani.extensions.getLong
import com.nyimbozamani.nyimbozazamani.extensions.getString
import com.nyimbozamani.nyimbozazamani.extensions.getStringOrNull
import com.nyimbozamani.nyimbozazamani.model.Audio
import com.nyimbozamani.nyimbozazamani.model.Song
import com.nyimbozamani.nyimbozazamani.providers.BlacklistStore
import com.nyimbozamani.nyimbozazamani.util.PreferenceUtil
import java.util.*

/**
 * Created by hemanths on 10/08/17.
 */
interface SongRepository {

    fun songs(): List<Song>

    fun songs(cursor: Cursor?): List<Song>

    fun songs(query: String): List<Song>
    fun songsOnline(): List<Song>
    fun songsOnlineSearch(query: String): List<Song>
    fun songsByFilePath(filePath: String): List<Song>

    fun song(cursor: Cursor?): Song

    fun song(songId: Long): Song
}

class RealSongRepository(private val context: Context) : SongRepository {

    val database = Firebase.database
    val myRef = database.getReference("audios")

    override fun songs(): List<Song> {
        return songs(makeSongCursor(null, null))
    }

    override fun songs(cursor: Cursor?): List<Song> {
        val songs = arrayListOf<Song>()
        if (cursor != null && cursor.moveToFirst()) {
            do {
                songs.add(getSongFromCursorImpl(cursor))
            } while (cursor.moveToNext())
        }
        cursor?.close()
        return songs
    }


    override fun song(cursor: Cursor?): Song {
        val song: Song = if (cursor != null && cursor.moveToFirst()) {
            getSongFromCursorImpl(cursor)
        } else {
            Song.emptySong
        }
        cursor?.close()
        return song
    }

    override fun songs(query: String): List<Song> {

        return songs(makeSongCursor(AudioColumns.TITLE + " LIKE ?", arrayOf("%$query%")))
    }

    override fun songsOnline(): List<Song> {



        //lateinit var list: ArrayList<Song>
        var list = arrayListOf<Song>()
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
    override fun songsOnlineSearch(query: String): List<Song> {


        //lateinit var list: ArrayList<Song>
        var list = arrayListOf<Song>()
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
        var filterList=list.filter {
            it.title.contains(query)
        }
        return filterList
    }
    override fun song(songId: Long): Song {
        return song(makeSongCursor(AudioColumns._ID + "=?", arrayOf(songId.toString())))
    }

    override fun songsByFilePath(filePath: String): List<Song> {
        return songs(
            makeSongCursor(
                AudioColumns.DATA + "=?",
                arrayOf(filePath)
            )
        )
    }

    private fun getSongFromCursorImpl(
        cursor: Cursor
    ): Song {
        val id = cursor.getLong(AudioColumns._ID)
        val title = cursor.getString(AudioColumns.TITLE)
        val trackNumber = cursor.getInt(AudioColumns.TRACK)
        val year = cursor.getInt(AudioColumns.YEAR)
        val duration = cursor.getLong(AudioColumns.DURATION)
        val data = cursor.getString(AudioColumns.DATA)
        val dateModified = cursor.getLong(AudioColumns.DATE_MODIFIED)
        val albumId = cursor.getLong(AudioColumns.ALBUM_ID)
        val albumName = cursor.getStringOrNull(AudioColumns.ALBUM)
        val artistId = cursor.getLong(AudioColumns.ARTIST_ID)
        val artistName = cursor.getStringOrNull(AudioColumns.ARTIST)
        val composer = cursor.getStringOrNull(AudioColumns.COMPOSER)
        val albumArtist = cursor.getStringOrNull("album_artist")
        return Song(
            id,
            title,
            trackNumber,
            year,
            duration,
            data,
            dateModified,
            albumId,
            albumName ?: "",
            artistId,
            artistName ?: "",
            composer ?: "",
            albumArtist ?: ""
        )
    }

    @JvmOverloads
    fun makeSongCursor(

        selection: String?,
        selectionValues: Array<String>?,
        sortOrder: String = PreferenceUtil.songSortOrder
    ): Cursor? {
        var selectionFinal = selection
        var selectionValuesFinal = selectionValues
        selectionFinal = if (selection != null && selection.trim { it <= ' ' } != "") {
            "$IS_MUSIC AND $selectionFinal"
        } else {
            IS_MUSIC
        }

        // Blacklist
        val paths = BlacklistStore.getInstance(context).paths
        if (paths.isNotEmpty()) {
            selectionFinal = generateBlacklistSelection(selectionFinal, paths.size)
            selectionValuesFinal = addBlacklistSelectionValues(selectionValuesFinal, paths)
        }
        selectionFinal =
            selectionFinal + " AND " + Media.DURATION + ">= " + (PreferenceUtil.filterLength * 1000)

        val uri = if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.Q) {
            Media.getContentUri(MediaStore.VOLUME_EXTERNAL)
        } else {
            Media.EXTERNAL_CONTENT_URI
        }
        return try {
            context.contentResolver.query(
                uri,
                baseProjection,
                selectionFinal,
                selectionValuesFinal,
                sortOrder
            )
        } catch (ex: SecurityException) {
            return null
        }
    }

    private fun generateBlacklistSelection(
        selection: String?,
        pathCount: Int
    ): String {
        val newSelection = StringBuilder(
            if (selection != null && selection.trim { it <= ' ' } != "") "$selection AND " else "")
        newSelection.append(AudioColumns.DATA + " NOT LIKE ?")
        for (i in 0 until pathCount - 1) {
            newSelection.append(" AND " + AudioColumns.DATA + " NOT LIKE ?")
        }
        return newSelection.toString()
    }

    private fun addBlacklistSelectionValues(
        selectionValues: Array<String>?,
        paths: ArrayList<String>
    ): Array<String>? {
        var selectionValuesFinal = selectionValues
        if (selectionValuesFinal == null) {
            selectionValuesFinal = emptyArray()
        }
        val newSelectionValues = Array(selectionValuesFinal.size + paths.size) {
            "n = $it"
        }
        System.arraycopy(selectionValuesFinal, 0, newSelectionValues, 0, selectionValuesFinal.size)
        for (i in selectionValuesFinal.size until newSelectionValues.size) {
            newSelectionValues[i] = paths[i - selectionValuesFinal.size] + "%"
        }
        return newSelectionValues
    }
}
