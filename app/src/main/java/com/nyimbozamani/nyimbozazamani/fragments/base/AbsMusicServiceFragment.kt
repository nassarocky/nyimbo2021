/*
 * Copyright (c) 2020 Hemanth Savarla.
 *
 * Licensed under the GNU General Public License v3
 *
 * This is free software: you can redistribute it and/or modify it
 * under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU General Public License for more details.
 *
 */
package com.nyimbozamani.nyimbozazamani.fragments.base

import android.content.Context
import android.net.Uri
import android.os.Bundle
import android.os.CountDownTimer
import android.util.Log
import android.view.View
import android.webkit.MimeTypeMap
import androidx.annotation.LayoutRes
import androidx.fragment.app.Fragment
import androidx.navigation.navOptions
import com.google.android.gms.ads.AdError
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.FullScreenContentCallback
import com.google.android.gms.ads.LoadAdError
import com.google.android.gms.ads.interstitial.InterstitialAd
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback
import com.nyimbozamani.nyimbozazamani.R
import com.nyimbozamani.nyimbozazamani.activities.base.AbsMusicServiceActivity
import com.nyimbozamani.nyimbozazamani.interfaces.IMusicServiceEventListener
import com.nyimbozamani.nyimbozazamani.model.Song
import com.nyimbozamani.nyimbozazamani.util.RetroUtil
import java.io.File
import java.net.URLEncoder
import java.util.*
import org.jaudiotagger.audio.AudioFileIO

/**
 * Created by hemanths on 18/08/17.
 */

open class AbsMusicServiceFragment(@LayoutRes layout: Int) : Fragment(layout),
    IMusicServiceEventListener {

    val navOptions by lazy {
        navOptions {
            launchSingleTop = false
            anim {
                enter = R.anim.retro_fragment_open_enter
                exit = R.anim.retro_fragment_open_exit
                popEnter = R.anim.retro_fragment_close_enter
                popExit = R.anim.retro_fragment_close_exit
            }
        }
    }
    private var mInterstitialAd: InterstitialAd? = null
    var serviceActivity: AbsMusicServiceActivity? = null
        private set

    override fun onAttach(context: Context) {
        super.onAttach(context)
        try {
            serviceActivity = context as AbsMusicServiceActivity?


            var adRequest = AdRequest.Builder().build()

            InterstitialAd.load(context,"ca-app-pub-3940256099942544/1033173712", adRequest, object : InterstitialAdLoadCallback() {
                override fun onAdFailedToLoad(adError: LoadAdError) {
                //    Log.d(TAG, adError?.message)
                    mInterstitialAd = null
                }


                override fun onAdLoaded(interstitialAd: InterstitialAd) {
                    //   Log.d(TAG, 'Ad was loaded.')
                    mInterstitialAd = interstitialAd
                }
            })

            mInterstitialAd?.fullScreenContentCallback = object: FullScreenContentCallback() {
                override fun onAdDismissedFullScreenContent() {
                    //Log.d(TAG, 'Ad was dismissed.')
                }

                override fun onAdFailedToShowFullScreenContent(adError: AdError?) {
                    //   Log.d(TAG, 'Ad failed to show.')
                }

                override fun onAdShowedFullScreenContent() {
                    //Log.d(TAG, 'Ad showed fullscreen content.')
                    mInterstitialAd = null;
                }
            }

            val timer = object: CountDownTimer(20000, 1000) {
                override fun onTick(millisUntilFinished: Long) {}

                override fun onFinish() {

                    if (mInterstitialAd != null) {
                        mInterstitialAd?.show(context)
                    } else {
                        Log.d("TAG", "The interstitial ad wasn't ready yet.")
                    }
                }
            }
            timer.start()











        } catch (e: ClassCastException) {
            throw RuntimeException(context.javaClass.simpleName + " must be an instance of " + AbsMusicServiceActivity::class.java.simpleName)
        }
    }

    override fun onDetach() {
        super.onDetach()
        serviceActivity = null
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        serviceActivity?.addMusicServiceEventListener(this)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        serviceActivity?.removeMusicServiceEventListener(this)
    }

    override fun onPlayingMetaChanged() {
    }

    override fun onServiceConnected() {
    }

    override fun onServiceDisconnected() {
    }

    override fun onQueueChanged() {
    }

    override fun onPlayStateChanged() {
    }

    override fun onRepeatModeChanged() {
    }

    override fun onShuffleModeChanged() {
    }

    override fun onMediaStoreChanged() {
    }

    fun getSongInfo(song: Song): String {
        val file = File(song.data)
        if (file.exists()) {
            return try {
                val audioHeader = AudioFileIO.read(File(song.data)).audioHeader
                val string: StringBuilder = StringBuilder()
                val uriFile = Uri.fromFile(file)
                string.append(getMimeType(uriFile.toString())).append(" • ")
                string.append(audioHeader.bitRate).append(" kb/s").append(" • ")
                string.append(RetroUtil.frequencyCount(audioHeader.sampleRate.toInt()))
                    .append(" kHz")
                string.toString()
            } catch (er: Exception) {
                " - "
            }
        }
        return "-"
    }

    private fun getMimeType(url: String): String? {
        var type: String? = MimeTypeMap.getFileExtensionFromUrl(
            URLEncoder.encode(url, "utf-8")
        ).toUpperCase(Locale.getDefault())
        if (type == null) {
            type = url.substring(url.lastIndexOf(".") + 1)
        }
        return type
    }
}
