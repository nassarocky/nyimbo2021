package com.nyimbozamani.nyimbozazamani.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J3\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0012H\u0002\u00a2\u0006\u0002\u0010\u0013J\u001a\u0010\u0014\u001a\u00020\u000f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J3\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u000f2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\b\b\u0002\u0010\u001d\u001a\u00020\u000fH\u0007\u00a2\u0006\u0002\u0010\u001eJ\u0012\u0010\u001f\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\u0010\u0010\u001f\u001a\u00020\u00192\u0006\u0010 \u001a\u00020!H\u0016J\u000e\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00190#H\u0016J\u0018\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00190#2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\u0016\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00190#2\u0006\u0010$\u001a\u00020\u000fH\u0016J\u0016\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00190#2\u0006\u0010&\u001a\u00020\u000fH\u0016J\u000e\u0010\'\u001a\b\u0012\u0004\u0012\u00020\u00190#H\u0016J\u0016\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00190#2\u0006\u0010$\u001a\u00020\u000fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006)"}, d2 = {"Lcom/nyimbozamani/nyimbozazamani/repository/RealSongRepository;", "Lcom/nyimbozamani/nyimbozazamani/repository/SongRepository;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "database", "Lcom/google/firebase/database/FirebaseDatabase;", "getDatabase", "()Lcom/google/firebase/database/FirebaseDatabase;", "myRef", "Lcom/google/firebase/database/DatabaseReference;", "getMyRef", "()Lcom/google/firebase/database/DatabaseReference;", "addBlacklistSelectionValues", "", "", "selectionValues", "paths", "Ljava/util/ArrayList;", "([Ljava/lang/String;Ljava/util/ArrayList;)[Ljava/lang/String;", "generateBlacklistSelection", "selection", "pathCount", "", "getSongFromCursorImpl", "Lcom/nyimbozamani/nyimbozazamani/model/Song;", "cursor", "Landroid/database/Cursor;", "makeSongCursor", "sortOrder", "(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;", "song", "songId", "", "songs", "", "query", "songsByFilePath", "filePath", "songsOnline", "songsOnlineSearch", "app_debug"})
public final class RealSongRepository implements com.nyimbozamani.nyimbozazamani.repository.SongRepository {
    @org.jetbrains.annotations.NotNull()
    private final com.google.firebase.database.FirebaseDatabase database = null;
    @org.jetbrains.annotations.NotNull()
    private final com.google.firebase.database.DatabaseReference myRef = null;
    private final android.content.Context context = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.firebase.database.FirebaseDatabase getDatabase() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.firebase.database.DatabaseReference getMyRef() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.nyimbozamani.nyimbozazamani.model.Song> songs() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.nyimbozamani.nyimbozazamani.model.Song> songs(@org.jetbrains.annotations.Nullable()
    android.database.Cursor cursor) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.nyimbozamani.nyimbozazamani.model.Song song(@org.jetbrains.annotations.Nullable()
    android.database.Cursor cursor) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.nyimbozamani.nyimbozazamani.model.Song> songs(@org.jetbrains.annotations.NotNull()
    java.lang.String query) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.nyimbozamani.nyimbozazamani.model.Song> songsOnline() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.nyimbozamani.nyimbozazamani.model.Song> songsOnlineSearch(@org.jetbrains.annotations.NotNull()
    java.lang.String query) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.nyimbozamani.nyimbozazamani.model.Song song(long songId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.nyimbozamani.nyimbozazamani.model.Song> songsByFilePath(@org.jetbrains.annotations.NotNull()
    java.lang.String filePath) {
        return null;
    }
    
    private final com.nyimbozamani.nyimbozazamani.model.Song getSongFromCursorImpl(android.database.Cursor cursor) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.database.Cursor makeSongCursor(@org.jetbrains.annotations.Nullable()
    java.lang.String selection, @org.jetbrains.annotations.Nullable()
    java.lang.String[] selectionValues, @org.jetbrains.annotations.NotNull()
    java.lang.String sortOrder) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.database.Cursor makeSongCursor(@org.jetbrains.annotations.Nullable()
    java.lang.String selection, @org.jetbrains.annotations.Nullable()
    java.lang.String[] selectionValues) {
        return null;
    }
    
    private final java.lang.String generateBlacklistSelection(java.lang.String selection, int pathCount) {
        return null;
    }
    
    private final java.lang.String[] addBlacklistSelectionValues(java.lang.String[] selectionValues, java.util.ArrayList<java.lang.String> paths) {
        return null;
    }
    
    public RealSongRepository(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
}