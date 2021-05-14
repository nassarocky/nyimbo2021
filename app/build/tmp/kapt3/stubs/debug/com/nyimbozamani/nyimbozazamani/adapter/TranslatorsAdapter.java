package com.nyimbozamani.nyimbozazamani.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0011B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J\u001c\u0010\t\u001a\u00020\n2\n\u0010\u000b\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\f\u001a\u00020\bH\u0016J\u001c\u0010\r\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\bH\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/nyimbozamani/nyimbozazamani/adapter/TranslatorsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/nyimbozamani/nyimbozazamani/adapter/TranslatorsAdapter$ViewHolder;", "contributors", "", "Lcom/nyimbozamani/nyimbozazamani/model/Contributor;", "(Ljava/util/List;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "app_debug"})
public final class TranslatorsAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.nyimbozamani.nyimbozazamani.adapter.TranslatorsAdapter.ViewHolder> {
    private java.util.List<com.nyimbozamani.nyimbozazamani.model.Contributor> contributors;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.nyimbozamani.nyimbozazamani.adapter.TranslatorsAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.nyimbozamani.nyimbozazamani.adapter.TranslatorsAdapter.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public TranslatorsAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<com.nyimbozamani.nyimbozazamani.model.Contributor> contributors) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0015\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0000\u00a2\u0006\u0002\b\u0013R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f\u00a8\u0006\u0014"}, d2 = {"Lcom/nyimbozamani/nyimbozazamani/adapter/TranslatorsAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/nyimbozamani/nyimbozazamani/adapter/TranslatorsAdapter;Landroid/view/View;)V", "image", "Lcom/nyimbozamani/nyimbozazamani/views/RetroShapeableImageView;", "getImage", "()Lcom/nyimbozamani/nyimbozazamani/views/RetroShapeableImageView;", "text", "Landroid/widget/TextView;", "getText", "()Landroid/widget/TextView;", "title", "getTitle", "bindData", "", "contributor", "Lcom/nyimbozamani/nyimbozazamani/model/Contributor;", "bindData$app_debug", "app_debug"})
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView title = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView text = null;
        @org.jetbrains.annotations.NotNull()
        private final com.nyimbozamani.nyimbozazamani.views.RetroShapeableImageView image = null;
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTitle() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getText() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.nyimbozamani.nyimbozazamani.views.RetroShapeableImageView getImage() {
            return null;
        }
        
        public final void bindData$app_debug(@org.jetbrains.annotations.NotNull()
        com.nyimbozamani.nyimbozazamani.model.Contributor contributor) {
        }
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
    }
}