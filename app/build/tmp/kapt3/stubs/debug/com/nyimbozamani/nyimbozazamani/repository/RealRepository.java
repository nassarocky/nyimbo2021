package com.nyimbozamani.nyimbozazamani.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u00fc\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0002\b\u0010\u0018\u00002\u00020\u0001Be\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u00a2\u0006\u0002\u0010\u001aJ\u0019\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001fJ\u0017\u0010 \u001a\b\u0012\u0004\u0012\u00020\"0!H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010#J\u0010\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\'H\u0016J\u0019\u0010(\u001a\u00020%2\u0006\u0010&\u001a\u00020\'H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010)J\'\u0010*\u001a\b\u0012\u0004\u0012\u00020,0+2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020.H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00100J\u001a\u00101\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0!0+02H\u0016J\u0017\u00103\u001a\b\u0012\u0004\u0012\u00020\u001e0!H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010#J\u0019\u00104\u001a\u00020\"2\u0006\u00105\u001a\u00020\'H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010)J3\u00106\u001a\b\u0012\u0004\u0012\u0002070+2\u0006\u00108\u001a\u00020.2\b\u00109\u001a\u0004\u0018\u00010.2\b\u0010:\u001a\u0004\u0018\u00010.H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010;J\u001a\u0010<\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0!0+02H\u0016J\u0017\u0010=\u001a\b\u0012\u0004\u0012\u00020>0!H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010#J\u001f\u0010?\u001a\b\u0012\u0004\u0012\u00020@0!2\u0006\u0010A\u001a\u00020.H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010BJ\u001f\u0010C\u001a\b\u0012\u0004\u0012\u00020D0!2\u0006\u0010E\u001a\u00020\'H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010)J\u0017\u0010F\u001a\b\u0012\u0004\u0012\u00020G0!H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010#J\u0019\u0010H\u001a\u00020\'2\u0006\u0010I\u001a\u00020@H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010JJ\u001f\u0010K\u001a\u00020\u001c2\f\u0010L\u001a\b\u0012\u0004\u0012\u00020@0!H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010MJ\u001f\u0010N\u001a\u00020\u001c2\f\u0010L\u001a\b\u0012\u0004\u0012\u00020@0!H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010MJ\u0019\u0010O\u001a\u00020\u001c2\u0006\u0010P\u001a\u00020DH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010QJ\u001f\u0010R\u001a\u00020\u001c2\f\u0010S\u001a\b\u0012\u0004\u0012\u00020\u001e0!H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010MJ\u001f\u0010T\u001a\u00020\u001c2\f\u0010S\u001a\b\u0012\u0004\u0012\u00020U0!H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010MJ\u0011\u0010V\u001a\u00020@H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010#J\u0011\u0010W\u001a\u00020XH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010#J\u0017\u0010Y\u001a\b\u0012\u0004\u0012\u00020U0!H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010#J\u0014\u0010Z\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020U0!0[H\u0016J\u0017\u0010\\\u001a\b\u0012\u0004\u0012\u00020%0!H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010#J\u0017\u0010]\u001a\b\u0012\u0004\u0012\u00020\"0!H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010#J\u0017\u0010^\u001a\b\u0012\u0004\u0012\u00020_0!H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010#J\u0017\u0010`\u001a\b\u0012\u0004\u0012\u00020a0!H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010#J\u0017\u0010b\u001a\b\u0012\u0004\u0012\u00020c0!H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010#J\u0017\u0010d\u001a\b\u0012\u0004\u0012\u00020@0!H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010#J\u001a\u0010e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020_0!0+02H\u0016J\u0011\u0010f\u001a\u00020XH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010#J\u001f\u0010g\u001a\b\u0012\u0004\u0012\u00020\u001e0!2\u0006\u0010h\u001a\u00020\'H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010)J\u001f\u0010i\u001a\b\u0012\u0004\u0012\u00020\u001e0!2\u0006\u0010j\u001a\u00020aH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010kJ\u000e\u0010l\u001a\b\u0012\u0004\u0012\u00020m0!H\u0016J\u0017\u0010n\u001a\b\u0012\u0004\u0012\u00020X0!H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010#J#\u0010o\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020X0!0+02H\u0097@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010#J\u0019\u0010p\u001a\u00020\u001c2\u0006\u0010P\u001a\u00020DH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010QJ\u001f\u0010q\u001a\u00020\u001c2\f\u0010S\u001a\b\u0012\u0004\u0012\u00020U0!H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010MJ\u001f\u0010r\u001a\b\u0012\u0004\u0012\u00020U0!2\u0006\u0010s\u001a\u00020UH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010tJ\u0014\u0010u\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0!0[H\u0016J\u0017\u0010v\u001a\b\u0012\u0004\u0012\u00020D0!H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010#J\u0019\u0010j\u001a\u00020a2\u0006\u0010w\u001a\u00020\'H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010)J\u001f\u0010x\u001a\b\u0012\u0004\u0012\u00020\u001e0!2\u0006\u0010y\u001a\u00020cH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010zJ\u001c\u0010x\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020U0!0[2\u0006\u0010{\u001a\u00020\'H\u0016J\u0011\u0010L\u001a\u00020XH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010#J\u001a\u0010|\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020a0!0+02H\u0016J\u0017\u0010}\u001a\b\u0012\u0004\u0012\u00020%0!H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010#J\u0011\u0010~\u001a\u00020XH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010#J\u0017\u0010\u007f\u001a\b\u0012\u0004\u0012\u00020\"0!H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010#J\u0012\u0010\u0080\u0001\u001a\u00020XH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010#J\u0018\u0010\u0081\u0001\u001a\b\u0012\u0004\u0012\u00020\u001e0!H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010#J\u001a\u0010\u0082\u0001\u001a\u00020\u001c2\u0006\u0010s\u001a\u00020UH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010tJ#\u0010\u0083\u0001\u001a\u00020\u001c2\u0006\u0010w\u001a\u00020\'2\u0006\u00108\u001a\u00020.H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0003\u0010\u0084\u0001J%\u0010\u0085\u0001\u001a\n\u0012\u0005\u0012\u00030\u0087\u00010\u0086\u00012\t\u0010\u0088\u0001\u001a\u0004\u0018\u00010.H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010BJ!\u0010\u0089\u0001\u001a\b\u0012\u0004\u0012\u00020%0!2\u0007\u0010\u0088\u0001\u001a\u00020.H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010BJ!\u0010\u008a\u0001\u001a\b\u0012\u0004\u0012\u00020\"0!2\u0007\u0010\u0088\u0001\u001a\u00020.H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010BJ!\u0010\u008b\u0001\u001a\b\u0012\u0004\u0012\u00020\u001e0!2\u0007\u0010\u0088\u0001\u001a\u00020.H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010BJ\u001c\u0010\u008c\u0001\u001a\u0004\u0018\u00010m2\u0006\u0010\u001d\u001a\u00020\u001eH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001fJ\u001b\u0010\u008d\u0001\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0!0+02H\u0016J\u0018\u0010\u008e\u0001\u001a\b\u0012\u0004\u0012\u00020\u001e0!H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010#J\u0012\u0010\u008f\u0001\u001a\u00020XH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010#J\u0018\u0010\u0090\u0001\u001a\b\u0012\u0004\u0012\u00020%0!H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010#J\u0012\u0010\u0091\u0001\u001a\u00020XH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010#J\u0018\u0010\u0092\u0001\u001a\b\u0012\u0004\u0012\u00020\"0!H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010#J\u0012\u0010\u0093\u0001\u001a\u00020XH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010#J\u0018\u0010\u0094\u0001\u001a\b\u0012\u0004\u0012\u00020\u001e0!H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010#J\u001a\u0010\u0095\u0001\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001fJ\u001a\u0010\u0096\u0001\u001a\u00020\u001c2\u0006\u0010P\u001a\u00020DH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010QR\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0097\u0001"}, d2 = {"Lcom/nyimbozamani/nyimbozazamani/repository/RealRepository;", "Lcom/nyimbozamani/nyimbozazamani/repository/Repository;", "context", "Landroid/content/Context;", "lastFMService", "Lcom/nyimbozamani/nyimbozazamani/network/LastFMService;", "songRepository", "Lcom/nyimbozamani/nyimbozazamani/repository/SongRepository;", "albumRepository", "Lcom/nyimbozamani/nyimbozazamani/repository/AlbumRepository;", "artistRepository", "Lcom/nyimbozamani/nyimbozazamani/repository/ArtistRepository;", "genreRepository", "Lcom/nyimbozamani/nyimbozazamani/repository/GenreRepository;", "lastAddedRepository", "Lcom/nyimbozamani/nyimbozazamani/repository/LastAddedRepository;", "playlistRepository", "Lcom/nyimbozamani/nyimbozazamani/repository/PlaylistRepository;", "searchRepository", "Lcom/nyimbozamani/nyimbozazamani/repository/RealSearchRepository;", "topPlayedRepository", "Lcom/nyimbozamani/nyimbozazamani/repository/TopPlayedRepository;", "roomRepository", "Lcom/nyimbozamani/nyimbozazamani/repository/RoomRepository;", "localDataRepository", "Lcom/nyimbozamani/nyimbozazamani/repository/LocalDataRepository;", "(Landroid/content/Context;Lcom/nyimbozamani/nyimbozazamani/network/LastFMService;Lcom/nyimbozamani/nyimbozazamani/repository/SongRepository;Lcom/nyimbozamani/nyimbozazamani/repository/AlbumRepository;Lcom/nyimbozamani/nyimbozazamani/repository/ArtistRepository;Lcom/nyimbozamani/nyimbozazamani/repository/GenreRepository;Lcom/nyimbozamani/nyimbozazamani/repository/LastAddedRepository;Lcom/nyimbozamani/nyimbozazamani/repository/PlaylistRepository;Lcom/nyimbozamani/nyimbozazamani/repository/RealSearchRepository;Lcom/nyimbozamani/nyimbozazamani/repository/TopPlayedRepository;Lcom/nyimbozamani/nyimbozazamani/repository/RoomRepository;Lcom/nyimbozamani/nyimbozazamani/repository/LocalDataRepository;)V", "addSongToHistory", "", "currentSong", "Lcom/nyimbozamani/nyimbozazamani/model/Song;", "(Lcom/nyimbozamani/nyimbozazamani/model/Song;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "albumArtists", "", "Lcom/nyimbozamani/nyimbozazamani/model/Artist;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "albumById", "Lcom/nyimbozamani/nyimbozazamani/model/Album;", "albumId", "", "albumByIdAsync", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "albumInfo", "Lcom/nyimbozamani/nyimbozazamani/network/Result;", "Lcom/nyimbozamani/nyimbozazamani/network/model/LastFmAlbum;", "artist", "", "album", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "albumsFlow", "Lkotlinx/coroutines/flow/Flow;", "allSongs", "artistById", "artistId", "artistInfo", "Lcom/nyimbozamani/nyimbozazamani/network/model/LastFmArtist;", "name", "lang", "cache", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "artistsFlow", "blackListPaths", "Lcom/nyimbozamani/nyimbozazamani/db/BlackListStoreEntity;", "checkPlaylistExists", "Lcom/nyimbozamani/nyimbozazamani/db/PlaylistEntity;", "playlistName", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "checkSongExistInPlayCount", "Lcom/nyimbozamani/nyimbozazamani/db/PlayCountEntity;", "songId", "contributor", "Lcom/nyimbozamani/nyimbozazamani/model/Contributor;", "createPlaylist", "playlistEntity", "(Lcom/nyimbozamani/nyimbozazamani/db/PlaylistEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deletePlaylistSongs", "playlists", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteRoomPlaylist", "deleteSongInPlayCount", "playCountEntity", "(Lcom/nyimbozamani/nyimbozazamani/db/PlayCountEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteSongs", "songs", "deleteSongsInPlaylist", "Lcom/nyimbozamani/nyimbozazamani/db/SongEntity;", "favoritePlaylist", "favoritePlaylistHome", "Lcom/nyimbozamani/nyimbozazamani/model/Home;", "favoritePlaylistSongs", "favorites", "Landroidx/lifecycle/LiveData;", "fetchAlbums", "fetchArtists", "fetchGenres", "Lcom/nyimbozamani/nyimbozazamani/model/Genre;", "fetchLegacyPlaylist", "Lcom/nyimbozamani/nyimbozazamani/model/Playlist;", "fetchPlaylistWithSongs", "Lcom/nyimbozamani/nyimbozazamani/db/PlaylistWithSongs;", "fetchPlaylists", "genresFlow", "genresHome", "getGenre", "genreId", "getPlaylistSongs", "playlist", "(Lcom/nyimbozamani/nyimbozazamani/model/Playlist;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "historySong", "Lcom/nyimbozamani/nyimbozazamani/db/HistoryEntity;", "homeSections", "homeSectionsFlow", "insertSongInPlayCount", "insertSongs", "isFavoriteSong", "songEntity", "(Lcom/nyimbozamani/nyimbozazamani/db/SongEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "observableHistorySongs", "playCountSongs", "playlistId", "playlistSongs", "playlistWithSongs", "(Lcom/nyimbozamani/nyimbozazamani/db/PlaylistWithSongs;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "playListId", "playlistsFlow", "recentAlbums", "recentAlbumsHome", "recentArtists", "recentArtistsHome", "recentSongs", "removeSongFromPlaylist", "renameRoomPlaylist", "(JLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "search", "", "", "query", "searchAlbums", "searchArtists", "searchSongs", "songPresentInHistory", "songsFlow", "songsOnline", "suggestionsHome", "topAlbums", "topAlbumsHome", "topArtists", "topArtistsHome", "topPlayedSongs", "updateHistorySong", "updateSongInPlayCount", "app_debug"})
public final class RealRepository implements com.nyimbozamani.nyimbozazamani.repository.Repository {
    private final android.content.Context context = null;
    private final com.nyimbozamani.nyimbozazamani.network.LastFMService lastFMService = null;
    private final com.nyimbozamani.nyimbozazamani.repository.SongRepository songRepository = null;
    private final com.nyimbozamani.nyimbozazamani.repository.AlbumRepository albumRepository = null;
    private final com.nyimbozamani.nyimbozazamani.repository.ArtistRepository artistRepository = null;
    private final com.nyimbozamani.nyimbozazamani.repository.GenreRepository genreRepository = null;
    private final com.nyimbozamani.nyimbozazamani.repository.LastAddedRepository lastAddedRepository = null;
    private final com.nyimbozamani.nyimbozazamani.repository.PlaylistRepository playlistRepository = null;
    private final com.nyimbozamani.nyimbozazamani.repository.RealSearchRepository searchRepository = null;
    private final com.nyimbozamani.nyimbozazamani.repository.TopPlayedRepository topPlayedRepository = null;
    private final com.nyimbozamani.nyimbozazamani.repository.RoomRepository roomRepository = null;
    private final com.nyimbozamani.nyimbozazamani.repository.LocalDataRepository localDataRepository = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object deleteSongs(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.nyimbozamani.nyimbozazamani.model.Song> songs, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object contributor(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.nyimbozamani.nyimbozazamani.model.Contributor>> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object searchSongs(@org.jetbrains.annotations.NotNull()
    java.lang.String query, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<? extends com.nyimbozamani.nyimbozazamani.model.Song>> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object searchAlbums(@org.jetbrains.annotations.NotNull()
    java.lang.String query, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.nyimbozamani.nyimbozazamani.model.Album>> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object searchArtists(@org.jetbrains.annotations.NotNull()
    java.lang.String query, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.nyimbozamani.nyimbozazamani.model.Artist>> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object fetchAlbums(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.nyimbozamani.nyimbozazamani.model.Album>> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object albumByIdAsync(long albumId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.nyimbozamani.nyimbozazamani.model.Album> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.nyimbozamani.nyimbozazamani.model.Album albumById(long albumId) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object fetchArtists(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.nyimbozamani.nyimbozazamani.model.Artist>> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object albumArtists(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.nyimbozamani.nyimbozazamani.model.Artist>> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object artistById(long artistId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.nyimbozamani.nyimbozazamani.model.Artist> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object recentArtists(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.nyimbozamani.nyimbozazamani.model.Artist>> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object recentAlbums(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.nyimbozamani.nyimbozazamani.model.Album>> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object topArtists(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.nyimbozamani.nyimbozazamani.model.Artist>> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object topAlbums(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.nyimbozamani.nyimbozazamani.model.Album>> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object fetchLegacyPlaylist(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<? extends com.nyimbozamani.nyimbozazamani.model.Playlist>> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object fetchGenres(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.nyimbozamani.nyimbozazamani.model.Genre>> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object allSongs(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<? extends com.nyimbozamani.nyimbozazamani.model.Song>> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object songsOnline(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<? extends com.nyimbozamani.nyimbozazamani.model.Song>> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object search(@org.jetbrains.annotations.Nullable()
    java.lang.String query, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<java.lang.Object>> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getPlaylistSongs(@org.jetbrains.annotations.NotNull()
    com.nyimbozamani.nyimbozazamani.model.Playlist playlist, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<? extends com.nyimbozamani.nyimbozazamani.model.Song>> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getGenre(long genreId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<? extends com.nyimbozamani.nyimbozazamani.model.Song>> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object artistInfo(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    java.lang.String lang, @org.jetbrains.annotations.Nullable()
    java.lang.String cache, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.nyimbozamani.nyimbozazamani.network.Result<? extends com.nyimbozamani.nyimbozazamani.network.model.LastFmArtist>> p3) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object albumInfo(@org.jetbrains.annotations.NotNull()
    java.lang.String artist, @org.jetbrains.annotations.NotNull()
    java.lang.String album, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.nyimbozamani.nyimbozazamani.network.Result<? extends com.nyimbozamani.nyimbozazamani.network.model.LastFmAlbum>> p2) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @kotlinx.coroutines.ExperimentalCoroutinesApi()
    @java.lang.Override()
    public java.lang.Object homeSectionsFlow(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.nyimbozamani.nyimbozazamani.network.Result<? extends java.util.List<com.nyimbozamani.nyimbozazamani.model.Home>>>> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object homeSections(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.nyimbozamani.nyimbozazamani.model.Home>> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object playlist(long playlistId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.nyimbozamani.nyimbozazamani.model.Playlist> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object fetchPlaylistWithSongs(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.nyimbozamani.nyimbozazamani.db.PlaylistWithSongs>> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object playlistSongs(@org.jetbrains.annotations.NotNull()
    com.nyimbozamani.nyimbozazamani.db.PlaylistWithSongs playlistWithSongs, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<? extends com.nyimbozamani.nyimbozazamani.model.Song>> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<java.util.List<com.nyimbozamani.nyimbozazamani.db.SongEntity>> playlistSongs(long playListId) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object insertSongs(@org.jetbrains.annotations.NotNull()
    java.util.List<com.nyimbozamani.nyimbozazamani.db.SongEntity> songs, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object checkPlaylistExists(@org.jetbrains.annotations.NotNull()
    java.lang.String playlistName, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.nyimbozamani.nyimbozazamani.db.PlaylistEntity>> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object createPlaylist(@org.jetbrains.annotations.NotNull()
    com.nyimbozamani.nyimbozazamani.db.PlaylistEntity playlistEntity, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Long> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object fetchPlaylists(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.nyimbozamani.nyimbozazamani.db.PlaylistEntity>> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object deleteRoomPlaylist(@org.jetbrains.annotations.NotNull()
    java.util.List<com.nyimbozamani.nyimbozazamani.db.PlaylistEntity> playlists, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object renameRoomPlaylist(long playlistId, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p2) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object deleteSongsInPlaylist(@org.jetbrains.annotations.NotNull()
    java.util.List<com.nyimbozamani.nyimbozazamani.db.SongEntity> songs, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object removeSongFromPlaylist(@org.jetbrains.annotations.NotNull()
    com.nyimbozamani.nyimbozazamani.db.SongEntity songEntity, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object deletePlaylistSongs(@org.jetbrains.annotations.NotNull()
    java.util.List<com.nyimbozamani.nyimbozazamani.db.PlaylistEntity> playlists, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object favoritePlaylist(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.nyimbozamani.nyimbozazamani.db.PlaylistEntity> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object isFavoriteSong(@org.jetbrains.annotations.NotNull()
    com.nyimbozamani.nyimbozazamani.db.SongEntity songEntity, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.nyimbozamani.nyimbozazamani.db.SongEntity>> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object addSongToHistory(@org.jetbrains.annotations.NotNull()
    com.nyimbozamani.nyimbozazamani.model.Song currentSong, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object songPresentInHistory(@org.jetbrains.annotations.NotNull()
    com.nyimbozamani.nyimbozazamani.model.Song currentSong, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.nyimbozamani.nyimbozazamani.db.HistoryEntity> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object updateHistorySong(@org.jetbrains.annotations.NotNull()
    com.nyimbozamani.nyimbozazamani.model.Song currentSong, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object favoritePlaylistSongs(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.nyimbozamani.nyimbozazamani.db.SongEntity>> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object recentSongs(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<? extends com.nyimbozamani.nyimbozazamani.model.Song>> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object topPlayedSongs(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<? extends com.nyimbozamani.nyimbozazamani.model.Song>> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object insertSongInPlayCount(@org.jetbrains.annotations.NotNull()
    com.nyimbozamani.nyimbozazamani.db.PlayCountEntity playCountEntity, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object updateSongInPlayCount(@org.jetbrains.annotations.NotNull()
    com.nyimbozamani.nyimbozazamani.db.PlayCountEntity playCountEntity, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object deleteSongInPlayCount(@org.jetbrains.annotations.NotNull()
    com.nyimbozamani.nyimbozazamani.db.PlayCountEntity playCountEntity, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object checkSongExistInPlayCount(long songId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.nyimbozamani.nyimbozazamani.db.PlayCountEntity>> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object playCountSongs(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.nyimbozamani.nyimbozazamani.db.PlayCountEntity>> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object blackListPaths(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.nyimbozamani.nyimbozazamani.db.BlackListStoreEntity>> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<java.util.List<com.nyimbozamani.nyimbozazamani.model.Song>> observableHistorySongs() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.nyimbozamani.nyimbozazamani.db.HistoryEntity> historySong() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<java.util.List<com.nyimbozamani.nyimbozazamani.db.SongEntity>> favorites() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object suggestionsHome(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.nyimbozamani.nyimbozazamani.model.Home> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object genresHome(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.nyimbozamani.nyimbozazamani.model.Home> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object playlists(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.nyimbozamani.nyimbozazamani.model.Home> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object recentArtistsHome(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.nyimbozamani.nyimbozazamani.model.Home> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object recentAlbumsHome(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.nyimbozamani.nyimbozazamani.model.Home> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object topAlbumsHome(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.nyimbozamani.nyimbozazamani.model.Home> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object topArtistsHome(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.nyimbozamani.nyimbozazamani.model.Home> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object favoritePlaylistHome(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.nyimbozamani.nyimbozazamani.model.Home> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<com.nyimbozamani.nyimbozazamani.network.Result<java.util.List<com.nyimbozamani.nyimbozazamani.model.Song>>> songsFlow() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<com.nyimbozamani.nyimbozazamani.network.Result<java.util.List<com.nyimbozamani.nyimbozazamani.model.Album>>> albumsFlow() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<com.nyimbozamani.nyimbozazamani.network.Result<java.util.List<com.nyimbozamani.nyimbozazamani.model.Artist>>> artistsFlow() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<com.nyimbozamani.nyimbozazamani.network.Result<java.util.List<com.nyimbozamani.nyimbozazamani.model.Playlist>>> playlistsFlow() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<com.nyimbozamani.nyimbozazamani.network.Result<java.util.List<com.nyimbozamani.nyimbozazamani.model.Genre>>> genresFlow() {
        return null;
    }
    
    public RealRepository(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.nyimbozamani.nyimbozazamani.network.LastFMService lastFMService, @org.jetbrains.annotations.NotNull()
    com.nyimbozamani.nyimbozazamani.repository.SongRepository songRepository, @org.jetbrains.annotations.NotNull()
    com.nyimbozamani.nyimbozazamani.repository.AlbumRepository albumRepository, @org.jetbrains.annotations.NotNull()
    com.nyimbozamani.nyimbozazamani.repository.ArtistRepository artistRepository, @org.jetbrains.annotations.NotNull()
    com.nyimbozamani.nyimbozazamani.repository.GenreRepository genreRepository, @org.jetbrains.annotations.NotNull()
    com.nyimbozamani.nyimbozazamani.repository.LastAddedRepository lastAddedRepository, @org.jetbrains.annotations.NotNull()
    com.nyimbozamani.nyimbozazamani.repository.PlaylistRepository playlistRepository, @org.jetbrains.annotations.NotNull()
    com.nyimbozamani.nyimbozazamani.repository.RealSearchRepository searchRepository, @org.jetbrains.annotations.NotNull()
    com.nyimbozamani.nyimbozazamani.repository.TopPlayedRepository topPlayedRepository, @org.jetbrains.annotations.NotNull()
    com.nyimbozamani.nyimbozazamani.repository.RoomRepository roomRepository, @org.jetbrains.annotations.NotNull()
    com.nyimbozamani.nyimbozazamani.repository.LocalDataRepository localDataRepository) {
        super();
    }
}