package com.nyimbozamani.nyimbozazamani.db;

import java.lang.System;

@androidx.room.Database(entities = {com.nyimbozamani.nyimbozazamani.db.PlaylistEntity.class, com.nyimbozamani.nyimbozazamani.db.SongEntity.class, com.nyimbozamani.nyimbozazamani.db.HistoryEntity.class, com.nyimbozamani.nyimbozazamani.db.PlayCountEntity.class, com.nyimbozamani.nyimbozazamani.db.BlackListStoreEntity.class, com.nyimbozamani.nyimbozazamani.db.LyricsEntity.class}, version = 23, exportSchema = false)
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\nH&J\b\u0010\u000b\u001a\u00020\fH&\u00a8\u0006\r"}, d2 = {"Lcom/nyimbozamani/nyimbozazamani/db/RetroDatabase;", "Landroidx/room/RoomDatabase;", "()V", "blackListStore", "Lcom/nyimbozamani/nyimbozazamani/db/BlackListStoreDao;", "historyDao", "Lcom/nyimbozamani/nyimbozazamani/db/HistoryDao;", "lyricsDao", "Lcom/nyimbozamani/nyimbozazamani/db/LyricsDao;", "playCountDao", "Lcom/nyimbozamani/nyimbozazamani/db/PlayCountDao;", "playlistDao", "Lcom/nyimbozamani/nyimbozazamani/db/PlaylistDao;", "app_debug"})
public abstract class RetroDatabase extends androidx.room.RoomDatabase {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.nyimbozamani.nyimbozazamani.db.PlaylistDao playlistDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.nyimbozamani.nyimbozazamani.db.BlackListStoreDao blackListStore();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.nyimbozamani.nyimbozazamani.db.PlayCountDao playCountDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.nyimbozamani.nyimbozazamani.db.HistoryDao historyDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.nyimbozamani.nyimbozazamani.db.LyricsDao lyricsDao();
    
    public RetroDatabase() {
        super();
    }
}