package com.nyimbozamani.nyimbozazamani.adapter.song;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0015B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0002\u0010\u000bJ\u0014\u0010\f\u001a\u00060\rR\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0014J\u001c\u0010\u0011\u001a\u00020\u00122\n\u0010\u0013\u001a\u00060\rR\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\bH\u0016\u00a8\u0006\u0016"}, d2 = {"Lcom/nyimbozamani/nyimbozazamani/adapter/song/ShuffleButtonSongAdapter;", "Lcom/nyimbozamani/nyimbozazamani/adapter/song/AbsOffsetSongAdapter;", "activity", "Landroidx/fragment/app/FragmentActivity;", "dataSet", "", "Lcom/nyimbozamani/nyimbozazamani/model/Song;", "itemLayoutRes", "", "ICabHolder", "Lcom/nyimbozamani/nyimbozazamani/interfaces/ICabHolder;", "(Landroidx/fragment/app/FragmentActivity;Ljava/util/List;ILcom/nyimbozamani/nyimbozazamani/interfaces/ICabHolder;)V", "createViewHolder", "Lcom/nyimbozamani/nyimbozazamani/adapter/song/SongAdapter$ViewHolder;", "Lcom/nyimbozamani/nyimbozazamani/adapter/song/SongAdapter;", "view", "Landroid/view/View;", "onBindViewHolder", "", "holder", "position", "ViewHolder", "app_debug"})
public final class ShuffleButtonSongAdapter extends com.nyimbozamani.nyimbozazamani.adapter.song.AbsOffsetSongAdapter {
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected com.nyimbozamani.nyimbozazamani.adapter.song.SongAdapter.ViewHolder createViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.nyimbozamani.nyimbozazamani.adapter.song.SongAdapter.ViewHolder holder, int position) {
    }
    
    public ShuffleButtonSongAdapter(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentActivity activity, @org.jetbrains.annotations.NotNull()
    java.util.List<com.nyimbozamani.nyimbozazamani.model.Song> dataSet, int itemLayoutRes, @org.jetbrains.annotations.Nullable()
    com.nyimbozamani.nyimbozazamani.interfaces.ICabHolder ICabHolder) {
        super(null, null, 0, null);
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004H\u0016R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t\u00a8\u0006\u000f"}, d2 = {"Lcom/nyimbozamani/nyimbozazamani/adapter/song/ShuffleButtonSongAdapter$ViewHolder;", "Lcom/nyimbozamani/nyimbozazamani/adapter/song/AbsOffsetSongAdapter$ViewHolder;", "Lcom/nyimbozamani/nyimbozazamani/adapter/song/AbsOffsetSongAdapter;", "itemView", "Landroid/view/View;", "(Lcom/nyimbozamani/nyimbozazamani/adapter/song/ShuffleButtonSongAdapter;Landroid/view/View;)V", "playAction", "Lcom/google/android/material/button/MaterialButton;", "getPlayAction", "()Lcom/google/android/material/button/MaterialButton;", "shuffleAction", "getShuffleAction", "onClick", "", "v", "app_debug"})
    public final class ViewHolder extends com.nyimbozamani.nyimbozazamani.adapter.song.AbsOffsetSongAdapter.ViewHolder {
        @org.jetbrains.annotations.Nullable()
        private final com.google.android.material.button.MaterialButton playAction = null;
        @org.jetbrains.annotations.Nullable()
        private final com.google.android.material.button.MaterialButton shuffleAction = null;
        
        @org.jetbrains.annotations.Nullable()
        public final com.google.android.material.button.MaterialButton getPlayAction() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.google.android.material.button.MaterialButton getShuffleAction() {
            return null;
        }
        
        @java.lang.Override()
        public void onClick(@org.jetbrains.annotations.Nullable()
        android.view.View v) {
        }
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
    }
}