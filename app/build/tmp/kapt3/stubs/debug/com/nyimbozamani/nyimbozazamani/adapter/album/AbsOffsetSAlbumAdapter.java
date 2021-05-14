package com.nyimbozamani.nyimbozazamani.adapter.album;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000 \u001a2\u00020\u0001:\u0002\u001a\u001bB/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0002\u0010\u000bJ\u0014\u0010\f\u001a\u00060\rR\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u000fH\u0014J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0011\u001a\u00020\bH\u0014J\b\u0010\u0012\u001a\u00020\bH\u0016J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\bH\u0016J\u0010\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\bH\u0016J\u001c\u0010\u0016\u001a\u00060\rR\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\bH\u0016\u00a8\u0006\u001c"}, d2 = {"Lcom/nyimbozamani/nyimbozazamani/adapter/album/AbsOffsetSAlbumAdapter;", "Lcom/nyimbozamani/nyimbozazamani/adapter/albums/AlbumAdapter;", "activity", "Landroidx/fragment/app/FragmentActivity;", "dataSet", "", "Lcom/nyimbozamani/nyimbozazamani/model/Song;", "itemLayoutRes", "", "ICabHolder", "Lcom/nyimbozamani/nyimbozazamani/interfaces/ICabHolder;", "(Landroidx/fragment/app/FragmentActivity;Ljava/util/List;ILcom/nyimbozamani/nyimbozazamani/interfaces/ICabHolder;)V", "createViewHolder", "Lcom/nyimbozamani/nyimbozazamani/adapter/albums/AlbumAdapter$ViewHolder;", "view", "Landroid/view/View;", "getIdentifier", "position", "getItemCount", "getItemId", "", "getItemViewType", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "Companion", "ViewHolder", "app_debug"})
public abstract class AbsOffsetSAlbumAdapter extends com.nyimbozamani.nyimbozazamani.adapter.albums.AlbumAdapter {
    public static final int OFFSET_ITEM = 0;
    public static final int SONG = 1;
    public static final com.nyimbozamani.nyimbozazamani.adapter.album.AbsOffsetSAlbumAdapter.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.nyimbozamani.nyimbozazamani.adapter.albums.AlbumAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected com.nyimbozamani.nyimbozazamani.adapter.albums.AlbumAdapter.ViewHolder createViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
        return null;
    }
    
    @java.lang.Override()
    public long getItemId(int position) {
        return 0L;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    protected com.nyimbozamani.nyimbozazamani.model.Song getIdentifier(int position) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public int getItemViewType(int position) {
        return 0;
    }
    
    public AbsOffsetSAlbumAdapter(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentActivity activity, @org.jetbrains.annotations.NotNull()
    java.util.List<com.nyimbozamani.nyimbozazamani.model.Song> dataSet, @androidx.annotation.LayoutRes()
    int itemLayoutRes, @org.jetbrains.annotations.Nullable()
    com.nyimbozamani.nyimbozazamani.interfaces.ICabHolder ICabHolder) {
        super(null, null, 0, null, false);
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0096\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0004H\u0016J\u0012\u0010\r\u001a\u00020\u000e2\b\u0010\f\u001a\u0004\u0018\u00010\u0004H\u0016R\u0014\u0010\u0006\u001a\u00020\u00078TX\u0094\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\t\u00a8\u0006\u000f"}, d2 = {"Lcom/nyimbozamani/nyimbozazamani/adapter/album/AbsOffsetSAlbumAdapter$ViewHolder;", "Lcom/nyimbozamani/nyimbozazamani/adapter/albums/AlbumAdapter$ViewHolder;", "Lcom/nyimbozamani/nyimbozazamani/adapter/albums/AlbumAdapter;", "itemView", "Landroid/view/View;", "(Lcom/nyimbozamani/nyimbozazamani/adapter/album/AbsOffsetSAlbumAdapter;Landroid/view/View;)V", "song", "Lcom/nyimbozamani/nyimbozazamani/model/Song;", "getSong", "()Lcom/nyimbozamani/nyimbozazamani/model/Song;", "onClick", "", "v", "onLongClick", "", "app_debug"})
    public class ViewHolder extends com.nyimbozamani.nyimbozazamani.adapter.albums.AlbumAdapter.ViewHolder {
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        protected com.nyimbozamani.nyimbozazamani.model.Song getSong() {
            return null;
        }
        
        @java.lang.Override()
        public void onClick(@org.jetbrains.annotations.Nullable()
        android.view.View v) {
        }
        
        @java.lang.Override()
        public boolean onLongClick(@org.jetbrains.annotations.Nullable()
        android.view.View v) {
            return false;
        }
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/nyimbozamani/nyimbozazamani/adapter/album/AbsOffsetSAlbumAdapter$Companion;", "", "()V", "OFFSET_ITEM", "", "SONG", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}