package com.nyimbozamani.nyimbozazamani.helper.menu;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\u0017B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eJ\u001e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/nyimbozamani/nyimbozazamani/helper/menu/SongMenuHelper2;", "Lorg/koin/core/KoinComponent;", "()V", "MENU_RES", "", "downloadManager", "Landroid/app/DownloadManager;", "downloadReference", "", "receiver", "Landroid/content/BroadcastReceiver;", "downloadFile", "", "url", "", "mimeType", "handleMenuClick", "", "activity", "Landroidx/fragment/app/FragmentActivity;", "song", "Lcom/nyimbozamani/nyimbozazamani/model/Song;", "menuItemId", "OnClickSongMenu", "app_debug"})
public final class SongMenuHelper2 implements org.koin.core.KoinComponent {
    public static final int MENU_RES = com.nyimbozamani.nyimbozazamani.R.menu.menu_item_song2;
    private static long downloadReference = 0L;
    private static android.app.DownloadManager downloadManager;
    private static final android.content.BroadcastReceiver receiver = null;
    public static final com.nyimbozamani.nyimbozazamani.helper.menu.SongMenuHelper2 INSTANCE = null;
    
    public final boolean handleMenuClick(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentActivity activity, @org.jetbrains.annotations.NotNull()
    com.nyimbozamani.nyimbozazamani.model.Song song, int menuItemId) {
        return false;
    }
    
    public final void downloadFile(@org.jetbrains.annotations.NotNull()
    java.lang.String url, @org.jetbrains.annotations.Nullable()
    java.lang.String mimeType) {
    }
    
    private SongMenuHelper2() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public org.koin.core.Koin getKoin() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00078VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u000bX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\r\u00a8\u0006\u0016"}, d2 = {"Lcom/nyimbozamani/nyimbozazamani/helper/menu/SongMenuHelper2$OnClickSongMenu;", "Landroid/view/View$OnClickListener;", "Landroid/widget/PopupMenu$OnMenuItemClickListener;", "activity", "Landroidx/fragment/app/FragmentActivity;", "(Landroidx/fragment/app/FragmentActivity;)V", "menuRes", "", "getMenuRes", "()I", "song", "Lcom/nyimbozamani/nyimbozazamani/model/Song;", "getSong", "()Lcom/nyimbozamani/nyimbozazamani/model/Song;", "onClick", "", "v", "Landroid/view/View;", "onMenuItemClick", "", "item", "Landroid/view/MenuItem;", "app_debug"})
    public static abstract class OnClickSongMenu implements android.view.View.OnClickListener, android.widget.PopupMenu.OnMenuItemClickListener {
        private final androidx.fragment.app.FragmentActivity activity = null;
        
        public int getMenuRes() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public abstract com.nyimbozamani.nyimbozazamani.model.Song getSong();
        
        @java.lang.Override()
        public void onClick(@org.jetbrains.annotations.NotNull()
        android.view.View v) {
        }
        
        @java.lang.Override()
        public boolean onMenuItemClick(@org.jetbrains.annotations.NotNull()
        android.view.MenuItem item) {
            return false;
        }
        
        public OnClickSongMenu(@org.jetbrains.annotations.NotNull()
        androidx.fragment.app.FragmentActivity activity) {
            super();
        }
    }
}