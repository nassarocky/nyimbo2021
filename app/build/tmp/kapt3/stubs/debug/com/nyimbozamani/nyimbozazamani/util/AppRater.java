package com.nyimbozamani.nyimbozazamani.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u0018\u0010\u000f\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0018\u0010\u0012\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u0011H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/nyimbozamani/nyimbozazamani/util/AppRater;", "", "()V", "APP_RATING", "", "DATE_FIRST_LAUNCH", "DAYS_UNTIL_PROMPT", "", "DO_NOT_SHOW_AGAIN", "LAUNCHES_UNTIL_PROMPT", "LAUNCH_COUNT", "appLaunched", "", "context", "Landroid/app/Activity;", "showPlayStoreReviewDialog", "editor", "Landroid/content/SharedPreferences$Editor;", "showRateDialog", "Landroid/content/Context;", "app_debug"})
public final class AppRater {
    private static final java.lang.String DO_NOT_SHOW_AGAIN = "do_not_show_again";
    private static final java.lang.String APP_RATING = "app_rating";
    private static final java.lang.String LAUNCH_COUNT = "launch_count";
    private static final java.lang.String DATE_FIRST_LAUNCH = "date_first_launch";
    private static final int DAYS_UNTIL_PROMPT = 3;
    private static final int LAUNCHES_UNTIL_PROMPT = 5;
    public static final com.nyimbozamani.nyimbozazamani.util.AppRater INSTANCE = null;
    
    public static final void appLaunched(@org.jetbrains.annotations.NotNull()
    android.app.Activity context) {
    }
    
    private final void showPlayStoreReviewDialog(android.app.Activity context, android.content.SharedPreferences.Editor editor) {
    }
    
    private final void showRateDialog(android.content.Context context, android.content.SharedPreferences.Editor editor) {
    }
    
    private AppRater() {
        super();
    }
}