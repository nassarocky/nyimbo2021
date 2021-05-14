package com.nyimbozamani.nyimbozazamani.repository;

import java.lang.System;

/**
 * Created by hemanths on 16/08/17.
 */
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003H&J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003H&\u00a8\u0006\t"}, d2 = {"Lcom/nyimbozamani/nyimbozazamani/repository/LastAddedRepository;", "", "recentAlbums", "", "Lcom/nyimbozamani/nyimbozazamani/model/Album;", "recentArtists", "Lcom/nyimbozamani/nyimbozazamani/model/Artist;", "recentSongs", "Lcom/nyimbozamani/nyimbozazamani/model/Song;", "app_debug"})
public abstract interface LastAddedRepository {
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.nyimbozamani.nyimbozazamani.model.Song> recentSongs();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.nyimbozamani.nyimbozazamani.model.Album> recentAlbums();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.nyimbozamani.nyimbozazamani.model.Artist> recentArtists();
}