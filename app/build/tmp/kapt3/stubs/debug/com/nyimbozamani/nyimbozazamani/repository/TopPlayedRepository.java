package com.nyimbozamani.nyimbozazamani.repository;

import java.lang.System;

/**
 * Created by hemanths on 16/08/17.
 */
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003H&J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0003H&J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&\u00a8\u0006\u000b"}, d2 = {"Lcom/nyimbozamani/nyimbozazamani/repository/TopPlayedRepository;", "", "notRecentlyPlayedTracks", "", "Lcom/nyimbozamani/nyimbozazamani/model/Song;", "recentlyPlayedTracks", "topAlbums", "Lcom/nyimbozamani/nyimbozazamani/model/Album;", "topArtists", "Lcom/nyimbozamani/nyimbozazamani/model/Artist;", "topTracks", "app_debug"})
public abstract interface TopPlayedRepository {
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.nyimbozamani.nyimbozazamani.model.Song> recentlyPlayedTracks();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.nyimbozamani.nyimbozazamani.model.Song> topTracks();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.nyimbozamani.nyimbozazamani.model.Song> notRecentlyPlayedTracks();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.nyimbozamani.nyimbozazamani.model.Album> topAlbums();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.nyimbozamani.nyimbozazamani.model.Artist> topArtists();
}