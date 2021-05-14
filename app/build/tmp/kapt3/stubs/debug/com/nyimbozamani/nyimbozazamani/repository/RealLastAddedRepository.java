package com.nyimbozamani.nyimbozazamani.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\n\u0010\t\u001a\u0004\u0018\u00010\nH\u0002J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0016J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\fH\u0016J\u000e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\fH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/nyimbozamani/nyimbozazamani/repository/RealLastAddedRepository;", "Lcom/nyimbozamani/nyimbozazamani/repository/LastAddedRepository;", "songRepository", "Lcom/nyimbozamani/nyimbozazamani/repository/RealSongRepository;", "albumRepository", "Lcom/nyimbozamani/nyimbozazamani/repository/RealAlbumRepository;", "artistRepository", "Lcom/nyimbozamani/nyimbozazamani/repository/RealArtistRepository;", "(Lcom/nyimbozamani/nyimbozazamani/repository/RealSongRepository;Lcom/nyimbozamani/nyimbozazamani/repository/RealAlbumRepository;Lcom/nyimbozamani/nyimbozazamani/repository/RealArtistRepository;)V", "makeLastAddedCursor", "Landroid/database/Cursor;", "recentAlbums", "", "Lcom/nyimbozamani/nyimbozazamani/model/Album;", "recentArtists", "Lcom/nyimbozamani/nyimbozazamani/model/Artist;", "recentSongs", "Lcom/nyimbozamani/nyimbozazamani/model/Song;", "app_debug"})
public final class RealLastAddedRepository implements com.nyimbozamani.nyimbozazamani.repository.LastAddedRepository {
    private final com.nyimbozamani.nyimbozazamani.repository.RealSongRepository songRepository = null;
    private final com.nyimbozamani.nyimbozazamani.repository.RealAlbumRepository albumRepository = null;
    private final com.nyimbozamani.nyimbozazamani.repository.RealArtistRepository artistRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.nyimbozamani.nyimbozazamani.model.Song> recentSongs() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.nyimbozamani.nyimbozazamani.model.Album> recentAlbums() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.nyimbozamani.nyimbozazamani.model.Artist> recentArtists() {
        return null;
    }
    
    private final android.database.Cursor makeLastAddedCursor() {
        return null;
    }
    
    public RealLastAddedRepository(@org.jetbrains.annotations.NotNull()
    com.nyimbozamani.nyimbozazamani.repository.RealSongRepository songRepository, @org.jetbrains.annotations.NotNull()
    com.nyimbozamani.nyimbozazamani.repository.RealAlbumRepository albumRepository, @org.jetbrains.annotations.NotNull()
    com.nyimbozamani.nyimbozazamani.repository.RealArtistRepository artistRepository) {
        super();
    }
}