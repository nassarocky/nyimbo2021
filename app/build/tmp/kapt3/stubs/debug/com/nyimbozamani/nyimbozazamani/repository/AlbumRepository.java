package com.nyimbozamani.nyimbozazamani.repository;

import java.lang.System;

/**
 * Created by hemanths on 11/08/17.
 */
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007H&J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\u0006\u0010\b\u001a\u00020\tH&\u00a8\u0006\n"}, d2 = {"Lcom/nyimbozamani/nyimbozazamani/repository/AlbumRepository;", "", "album", "Lcom/nyimbozamani/nyimbozazamani/model/Album;", "albumId", "", "albums", "", "query", "", "app_debug"})
public abstract interface AlbumRepository {
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.nyimbozamani.nyimbozazamani.model.Album> albums();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.nyimbozamani.nyimbozazamani.model.Album> albums(@org.jetbrains.annotations.NotNull()
    java.lang.String query);
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.nyimbozamani.nyimbozazamani.model.Album album(long albumId);
}