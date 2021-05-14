package com.nyimbozamani.nyimbozazamani.fragments.genres;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0015B\u0005\u00a2\u0006\u0002\u0010\u0005J\b\u0010\n\u001a\u00020\u0002H\u0014J\b\u0010\u000b\u001a\u00020\u0003H\u0014J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u001a\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016R\u0014\u0010\u0006\u001a\u00020\u00078TX\u0094\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\t\u00a8\u0006\u0016"}, d2 = {"Lcom/nyimbozamani/nyimbozazamani/fragments/genres/GenresFragment;", "Lcom/nyimbozamani/nyimbozazamani/fragments/base/AbsRecyclerViewFragment;", "Lcom/nyimbozamani/nyimbozazamani/adapter/GenreAdapter;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "Lcom/nyimbozamani/nyimbozazamani/interfaces/IGenreClickListener;", "()V", "emptyMessage", "", "getEmptyMessage", "()I", "createAdapter", "createLayoutManager", "onClickGenre", "", "genre", "Lcom/nyimbozamani/nyimbozazamani/model/Genre;", "view", "Landroid/view/View;", "onViewCreated", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "app_debug"})
public final class GenresFragment extends com.nyimbozamani.nyimbozazamani.fragments.base.AbsRecyclerViewFragment<com.nyimbozamani.nyimbozazamani.adapter.GenreAdapter, androidx.recyclerview.widget.LinearLayoutManager> implements com.nyimbozamani.nyimbozazamani.interfaces.IGenreClickListener {
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TAG = null;
    public static final com.nyimbozamani.nyimbozazamani.fragments.genres.GenresFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected androidx.recyclerview.widget.LinearLayoutManager createLayoutManager() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected com.nyimbozamani.nyimbozazamani.adapter.GenreAdapter createAdapter() {
        return null;
    }
    
    @java.lang.Override()
    protected int getEmptyMessage() {
        return 0;
    }
    
    @java.lang.Override()
    public void onClickGenre(@org.jetbrains.annotations.NotNull()
    com.nyimbozamani.nyimbozazamani.model.Genre genre, @org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    public GenresFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final com.nyimbozamani.nyimbozazamani.fragments.genres.GenresFragment newInstance() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0007R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/nyimbozamani/nyimbozazamani/fragments/genres/GenresFragment$Companion;", "", "()V", "TAG", "", "newInstance", "Lcom/nyimbozamani/nyimbozazamani/fragments/genres/GenresFragment;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.nyimbozamani.nyimbozazamani.fragments.genres.GenresFragment newInstance() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}