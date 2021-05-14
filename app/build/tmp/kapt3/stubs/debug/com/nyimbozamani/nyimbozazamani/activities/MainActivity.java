package com.nyimbozamani.nyimbozazamani.activities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0002\u0018\u0000 -2\u00020\u00012\u00020\u0002:\u0001-B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0013\u001a\u00020\u0014H\u0014J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0012\u0010\u0019\u001a\u00020\u00162\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0014J\b\u0010\u001c\u001a\u00020\u0016H\u0014J\b\u0010\u001d\u001a\u00020\u0016H\u0016J\u001c\u0010\u001e\u001a\u00020\u00162\b\u0010\u001f\u001a\u0004\u0018\u00010 2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\b\u0010#\u001a\u00020$H\u0016J \u0010%\u001a\u00020&2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\'\u001a\u00020\"2\u0006\u0010(\u001a\u00020\"H\u0002J\b\u0010)\u001a\u00020\u0016H\u0002J\b\u0010*\u001a\u00020\u0016H\u0002J\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\n0,R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006."}, d2 = {"Lcom/nyimbozamani/nyimbozazamani/activities/MainActivity;", "Lcom/nyimbozamani/nyimbozazamani/activities/base/AbsSlidingMusicPanelActivity;", "Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;", "()V", "database", "Lcom/google/firebase/database/FirebaseDatabase;", "getDatabase", "()Lcom/google/firebase/database/FirebaseDatabase;", "list", "Ljava/util/ArrayList;", "Lcom/nyimbozamani/nyimbozazamani/model/Song;", "getList", "()Ljava/util/ArrayList;", "setList", "(Ljava/util/ArrayList;)V", "myRef", "Lcom/google/firebase/database/DatabaseReference;", "getMyRef", "()Lcom/google/firebase/database/DatabaseReference;", "createContentView", "Landroid/view/View;", "handlePlaybackIntent", "", "intent", "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "onServiceConnected", "onSharedPreferenceChanged", "sharedPreferences", "Landroid/content/SharedPreferences;", "key", "", "onSupportNavigateUp", "", "parseLongFromIntent", "", "longKey", "stringKey", "setupNavigationController", "showPromotionalDialog", "songsOnline", "", "Companion", "app_debug"})
public final class MainActivity extends com.nyimbozamani.nyimbozazamani.activities.base.AbsSlidingMusicPanelActivity implements android.content.SharedPreferences.OnSharedPreferenceChangeListener {
    @org.jetbrains.annotations.NotNull()
    private final com.google.firebase.database.FirebaseDatabase database = null;
    @org.jetbrains.annotations.NotNull()
    private final com.google.firebase.database.DatabaseReference myRef = null;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.nyimbozamani.nyimbozazamani.model.Song> list;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TAG = "MainActivity";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXPAND_PANEL = "expand_panel";
    public static final int APP_UPDATE_REQUEST_CODE = 9002;
    public static final com.nyimbozamani.nyimbozazamani.activities.MainActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.firebase.database.FirebaseDatabase getDatabase() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.firebase.database.DatabaseReference getMyRef() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.nyimbozamani.nyimbozazamani.model.Song> getList() {
        return null;
    }
    
    public final void setList(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.nyimbozamani.nyimbozazamani.model.Song> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected android.view.View createContentView() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void showPromotionalDialog() {
    }
    
    private final void setupNavigationController() {
    }
    
    @java.lang.Override()
    public boolean onSupportNavigateUp() {
        return false;
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    @java.lang.Override()
    public void onSharedPreferenceChanged(@org.jetbrains.annotations.Nullable()
    android.content.SharedPreferences sharedPreferences, @org.jetbrains.annotations.Nullable()
    java.lang.String key) {
    }
    
    @java.lang.Override()
    public void onServiceConnected() {
    }
    
    private final void handlePlaybackIntent(android.content.Intent intent) {
    }
    
    private final long parseLongFromIntent(android.content.Intent intent, java.lang.String longKey, java.lang.String stringKey) {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.nyimbozamani.nyimbozazamani.model.Song> songsOnline() {
        return null;
    }
    
    public MainActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/nyimbozamani/nyimbozazamani/activities/MainActivity$Companion;", "", "()V", "APP_UPDATE_REQUEST_CODE", "", "EXPAND_PANEL", "", "TAG", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}