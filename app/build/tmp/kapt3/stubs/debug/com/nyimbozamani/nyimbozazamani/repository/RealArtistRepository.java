package com.nyimbozamani.nyimbozazamani.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0002J\u001c\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\bH\u0002J\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/nyimbozamani/nyimbozazamani/repository/RealArtistRepository;", "Lcom/nyimbozamani/nyimbozazamani/repository/ArtistRepository;", "songRepository", "Lcom/nyimbozamani/nyimbozazamani/repository/RealSongRepository;", "albumRepository", "Lcom/nyimbozamani/nyimbozazamani/repository/RealAlbumRepository;", "(Lcom/nyimbozamani/nyimbozazamani/repository/RealSongRepository;Lcom/nyimbozamani/nyimbozazamani/repository/RealAlbumRepository;)V", "albumArtists", "", "Lcom/nyimbozamani/nyimbozazamani/model/Artist;", "artist", "artistId", "", "artists", "query", "", "getSongLoaderSortOrder", "splitIntoAlbumArtists", "albums", "Lcom/nyimbozamani/nyimbozazamani/model/Album;", "splitIntoArtists", "app_debug"})
public final class RealArtistRepository implements com.nyimbozamani.nyimbozazamani.repository.ArtistRepository {
    private final com.nyimbozamani.nyimbozazamani.repository.RealSongRepository songRepository = null;
    private final com.nyimbozamani.nyimbozazamani.repository.RealAlbumRepository albumRepository = null;
    
    private final java.lang.String getSongLoaderSortOrder() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.nyimbozamani.nyimbozazamani.model.Artist artist(long artistId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.nyimbozamani.nyimbozazamani.model.Artist> artists() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.nyimbozamani.nyimbozazamani.model.Artist> albumArtists() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.nyimbozamani.nyimbozazamani.model.Artist> artists(@org.jetbrains.annotations.NotNull()
    java.lang.String query) {
        return null;
    }
    
    private final java.util.List<com.nyimbozamani.nyimbozazamani.model.Artist> splitIntoAlbumArtists(java.util.List<com.nyimbozamani.nyimbozazamani.model.Album> albums) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.nyimbozamani.nyimbozazamani.model.Artist> splitIntoArtists(@org.jetbrains.annotations.NotNull()
    java.util.List<com.nyimbozamani.nyimbozazamani.model.Album> albums) {
        return null;
    }
    
    public RealArtistRepository(@org.jetbrains.annotations.NotNull()
    com.nyimbozamani.nyimbozazamani.repository.RealSongRepository songRepository, @org.jetbrains.annotations.NotNull()
    com.nyimbozamani.nyimbozazamani.repository.RealAlbumRepository albumRepository) {
        super();
    }
}