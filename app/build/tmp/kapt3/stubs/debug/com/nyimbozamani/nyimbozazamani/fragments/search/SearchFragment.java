package com.nyimbozamani.nyimbozazamani.fragments.search;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\u0018\u0000 \'2\u00020\u00012\u00020\u0002:\u0001\'B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0012\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J*\u0010\u0011\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0015H\u0016J\u0012\u0010\u0018\u001a\u00020\u000e2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0002J\b\u0010\u001b\u001a\u00020\u000eH\u0016J*\u0010\u001c\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0015H\u0016J\u001a\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\u0010\u0010!\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u0005H\u0002J\b\u0010\"\u001a\u00020\u000eH\u0002J\u0016\u0010#\u001a\u00020\u000e2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\b0%H\u0002J\b\u0010&\u001a\u00020\u000eH\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006("}, d2 = {"Lcom/nyimbozamani/nyimbozazamani/fragments/search/SearchFragment;", "Lcom/nyimbozamani/nyimbozazamani/fragments/base/AbsMainActivityFragment;", "Landroid/text/TextWatcher;", "()V", "query", "", "results", "", "", "getResults", "()Ljava/util/List;", "searchAdapter", "Lcom/nyimbozamani/nyimbozazamani/adapter/SearchAdapter;", "afterTextChanged", "", "newText", "Landroid/text/Editable;", "beforeTextChanged", "s", "", "start", "", "count", "after", "hideKeyboard", "view", "Landroid/view/View;", "onDestroyView", "onTextChanged", "before", "onViewCreated", "savedInstanceState", "Landroid/os/Bundle;", "search", "setupRecyclerView", "showData", "data", "", "startMicSearch", "Companion", "app_debug"})
public final class SearchFragment extends com.nyimbozamani.nyimbozazamani.fragments.base.AbsMainActivityFragment implements android.text.TextWatcher {
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.Object> results = null;
    private com.nyimbozamani.nyimbozazamani.adapter.SearchAdapter searchAdapter;
    private java.lang.String query;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String QUERY = "query";
    public static final int REQ_CODE_SPEECH_INPUT = 9001;
    public static final com.nyimbozamani.nyimbozazamani.fragments.search.SearchFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Object> getResults() {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void showData(java.util.List<? extends java.lang.Object> data) {
    }
    
    private final void setupRecyclerView() {
    }
    
    @java.lang.Override()
    public void afterTextChanged(@org.jetbrains.annotations.Nullable()
    android.text.Editable newText) {
    }
    
    @java.lang.Override()
    public void beforeTextChanged(@org.jetbrains.annotations.Nullable()
    java.lang.CharSequence s, int start, int count, int after) {
    }
    
    @java.lang.Override()
    public void onTextChanged(@org.jetbrains.annotations.Nullable()
    java.lang.CharSequence s, int start, int before, int count) {
    }
    
    private final void search(java.lang.String query) {
    }
    
    private final void startMicSearch() {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    private final void hideKeyboard(android.view.View view) {
    }
    
    public SearchFragment() {
        super(0);
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/nyimbozamani/nyimbozazamani/fragments/search/SearchFragment$Companion;", "", "()V", "QUERY", "", "REQ_CODE_SPEECH_INPUT", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}