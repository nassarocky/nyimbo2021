package com.nyimbozamani.nyimbozazamani.model;

import java.lang.System;

/**
 * Created by hemanths on 3/4/19
 */
@kotlinx.android.parcel.Parcelize()
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b2\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0081\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0014J\u0013\u00109\u001a\u00020:2\b\u0010;\u001a\u0004\u0018\u00010<H\u0096\u0002J\b\u0010=\u001a\u00020\u0007H\u0016J\u0019\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020\u0007H\u00d6\u0001R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0005X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\f\u001a\u00020\u0003X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\r\u001a\u00020\u0005X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0016\"\u0004\b\u001e\u0010\u0018R\u001a\u0010\u000e\u001a\u00020\u0003X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u001a\"\u0004\b \u0010\u001cR\u001a\u0010\u000f\u001a\u00020\u0005X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0016\"\u0004\b\"\u0010\u0018R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0005X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0016\"\u0004\b$\u0010\u0018R\u001a\u0010\n\u001a\u00020\u0005X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0016\"\u0004\b&\u0010\u0018R\u001a\u0010\u000b\u001a\u00020\u0003X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010\u001a\"\u0004\b(\u0010\u001cR\u001a\u0010\t\u001a\u00020\u0003X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u001a\"\u0004\b*\u0010\u001cR\u001a\u0010\u0002\u001a\u00020\u0003X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u001a\"\u0004\b,\u0010\u001cR\u001a\u0010\u0011\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u001a\"\u0004\b.\u0010\u001cR\u001a\u0010\u0010\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u001a\"\u0004\b0\u0010\u001cR\u001a\u0010\u0004\u001a\u00020\u0005X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u0016\"\u0004\b2\u0010\u0018R\u001a\u0010\u0006\u001a\u00020\u0007X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u001a\u0010\b\u001a\u00020\u0007X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b7\u00104\"\u0004\b8\u00106\u00a8\u0006C"}, d2 = {"Lcom/nyimbozamani/nyimbozazamani/model/PlaylistSong;", "Lcom/nyimbozamani/nyimbozazamani/model/Song;", "id", "", "title", "", "trackNumber", "", "year", "duration", "data", "dateModified", "albumId", "albumName", "artistId", "artistName", "playlistId", "idInPlayList", "composer", "albumArtist", "(JLjava/lang/String;IIJLjava/lang/String;JJLjava/lang/String;JLjava/lang/String;JJLjava/lang/String;Ljava/lang/String;)V", "getAlbumArtist", "()Ljava/lang/String;", "setAlbumArtist", "(Ljava/lang/String;)V", "getAlbumId", "()J", "setAlbumId", "(J)V", "getAlbumName", "setAlbumName", "getArtistId", "setArtistId", "getArtistName", "setArtistName", "getComposer", "setComposer", "getData", "setData", "getDateModified", "setDateModified", "getDuration", "setDuration", "getId", "setId", "getIdInPlayList", "setIdInPlayList", "getPlaylistId", "setPlaylistId", "getTitle", "setTitle", "getTrackNumber", "()I", "setTrackNumber", "(I)V", "getYear", "setYear", "equals", "", "other", "", "hashCode", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_debug"})
public final class PlaylistSong extends com.nyimbozamani.nyimbozazamani.model.Song {
    private long id;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String title;
    private int trackNumber;
    private int year;
    private long duration;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String data;
    private long dateModified;
    private long albumId;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String albumName;
    private long artistId;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String artistName;
    private long playlistId;
    private long idInPlayList;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String composer;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String albumArtist;
    public static final android.os.Parcelable.Creator CREATOR = null;
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public long getId() {
        return 0L;
    }
    
    @java.lang.Override()
    public void setId(long p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getTitle() {
        return null;
    }
    
    @java.lang.Override()
    public void setTitle(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @java.lang.Override()
    public int getTrackNumber() {
        return 0;
    }
    
    @java.lang.Override()
    public void setTrackNumber(int p0) {
    }
    
    @java.lang.Override()
    public int getYear() {
        return 0;
    }
    
    @java.lang.Override()
    public void setYear(int p0) {
    }
    
    @java.lang.Override()
    public long getDuration() {
        return 0L;
    }
    
    @java.lang.Override()
    public void setDuration(long p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getData() {
        return null;
    }
    
    @java.lang.Override()
    public void setData(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @java.lang.Override()
    public long getDateModified() {
        return 0L;
    }
    
    @java.lang.Override()
    public void setDateModified(long p0) {
    }
    
    @java.lang.Override()
    public long getAlbumId() {
        return 0L;
    }
    
    @java.lang.Override()
    public void setAlbumId(long p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getAlbumName() {
        return null;
    }
    
    @java.lang.Override()
    public void setAlbumName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @java.lang.Override()
    public long getArtistId() {
        return 0L;
    }
    
    @java.lang.Override()
    public void setArtistId(long p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getArtistName() {
        return null;
    }
    
    @java.lang.Override()
    public void setArtistName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final long getPlaylistId() {
        return 0L;
    }
    
    public final void setPlaylistId(long p0) {
    }
    
    public final long getIdInPlayList() {
        return 0L;
    }
    
    public final void setIdInPlayList(long p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.String getComposer() {
        return null;
    }
    
    @java.lang.Override()
    public void setComposer(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.String getAlbumArtist() {
        return null;
    }
    
    @java.lang.Override()
    public void setAlbumArtist(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public PlaylistSong(long id, @org.jetbrains.annotations.NotNull()
    java.lang.String title, int trackNumber, int year, long duration, @org.jetbrains.annotations.NotNull()
    java.lang.String data, long dateModified, long albumId, @org.jetbrains.annotations.NotNull()
    java.lang.String albumName, long artistId, @org.jetbrains.annotations.NotNull()
    java.lang.String artistName, long playlistId, long idInPlayList, @org.jetbrains.annotations.Nullable()
    java.lang.String composer, @org.jetbrains.annotations.Nullable()
    java.lang.String albumArtist) {
        super(0L, null, 0, 0, 0L, null, 0L, 0L, null, 0L, null, null, null);
    }
    
    @java.lang.Override()
    public void writeToParcel(@org.jetbrains.annotations.NotNull()
    android.os.Parcel parcel, int flags) {
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 3)
    public static final class Creator implements android.os.Parcelable.Creator {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.Object[] newArray(int size) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.Object createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel in) {
            return null;
        }
    }
}