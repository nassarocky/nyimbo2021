package com.nyimbozamani.nyimbozazamani.interfaces;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lcom/nyimbozamani/nyimbozazamani/interfaces/IPlaylistClickListener;", "", "onPlaylistClick", "", "playlistWithSongs", "Lcom/nyimbozamani/nyimbozazamani/db/PlaylistWithSongs;", "view", "Landroid/view/View;", "app_debug"})
public abstract interface IPlaylistClickListener {
    
    public abstract void onPlaylistClick(@org.jetbrains.annotations.NotNull()
    com.nyimbozamani.nyimbozazamani.db.PlaylistWithSongs playlistWithSongs, @org.jetbrains.annotations.NotNull()
    android.view.View view);
}