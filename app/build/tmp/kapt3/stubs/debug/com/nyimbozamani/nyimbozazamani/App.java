package com.nyimbozamani.nyimbozazamani;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\r"}, d2 = {"Lcom/nyimbozamani/nyimbozazamani/App;", "Landroidx/multidex/MultiDexApplication;", "()V", "billingProcessor", "Lcom/anjlab/android/iab/v3/BillingProcessor;", "getBillingProcessor", "()Lcom/anjlab/android/iab/v3/BillingProcessor;", "setBillingProcessor", "(Lcom/anjlab/android/iab/v3/BillingProcessor;)V", "onCreate", "", "onTerminate", "Companion", "app_debug"})
public final class App extends androidx.multidex.MultiDexApplication {
    @org.jetbrains.annotations.NotNull()
    public com.anjlab.android.iab.v3.BillingProcessor billingProcessor;
    private static com.nyimbozamani.nyimbozazamani.App instance;
    public static final com.nyimbozamani.nyimbozazamani.App.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.anjlab.android.iab.v3.BillingProcessor getBillingProcessor() {
        return null;
    }
    
    public final void setBillingProcessor(@org.jetbrains.annotations.NotNull()
    com.anjlab.android.iab.v3.BillingProcessor p0) {
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    @java.lang.Override()
    public void onTerminate() {
    }
    
    public App() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\u0006\u001a\u00020\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/nyimbozamani/nyimbozazamani/App$Companion;", "", "()V", "instance", "Lcom/nyimbozamani/nyimbozazamani/App;", "getContext", "isProVersion", "", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.nyimbozamani.nyimbozazamani.App getContext() {
            return null;
        }
        
        public final boolean isProVersion() {
            return false;
        }
        
        private Companion() {
            super();
        }
    }
}