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
package com.nyimbozamani.nyimbozazamani.fragments.player.flat

import android.animation.ObjectAnimator
import android.graphics.PorterDuff
import android.os.Bundle
import android.view.View
import android.view.animation.DecelerateInterpolator
import android.view.animation.LinearInterpolator
import android.widget.SeekBar
import code.name.monkey.appthemehelper.ThemeStore
import code.name.monkey.appthemehelper.util.ATHUtil
import code.name.monkey.appthemehelper.util.ColorUtil
import code.name.monkey.appthemehelper.util.MaterialValueHelper
import code.name.monkey.appthemehelper.util.TintHelper
import com.nyimbozamani.nyimbozazamani.R
import com.nyimbozamani.nyimbozazamani.extensions.applyColor
import com.nyimbozamani.nyimbozazamani.extensions.hide
import com.nyimbozamani.nyimbozazamani.extensions.ripAlpha
import com.nyimbozamani.nyimbozazamani.extensions.show
import com.nyimbozamani.nyimbozazamani.fragments.base.AbsPlayerControlsFragment
import com.nyimbozamani.nyimbozazamani.helper.MusicPlayerRemote
import com.nyimbozamani.nyimbozazamani.helper.MusicProgressViewUpdateHelper
import com.nyimbozamani.nyimbozazamani.helper.MusicProgressViewUpdateHelper.Callback
import com.nyimbozamani.nyimbozazamani.helper.PlayPauseButtonOnClickHandler
import com.nyimbozamani.nyimbozazamani.misc.SimpleOnSeekbarChangeListener
import com.nyimbozamani.nyimbozazamani.service.MusicService
import com.nyimbozamani.nyimbozazamani.util.MusicUtil
import com.nyimbozamani.nyimbozazamani.util.PreferenceUtil
import com.nyimbozamani.nyimbozazamani.util.color.MediaNotificationProcessor
import kotlinx.android.synthetic.main.fragment_flat_player_playback_controls.*

class FlatPlaybackControlsFragment :
    AbsPlayerControlsFragment(R.layout.fragment_flat_player_playback_controls), Callback {

    private var lastPlaybackControlsColor: Int = 0
    private var lastDisabledPlaybackControlsColor: Int = 0
    private lateinit var progressViewUpdateHelper: MusicProgressViewUpdateHelper

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        progressViewUpdateHelper = MusicProgressViewUpdateHelper(this)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setUpMusicControllers()
        title.isSelected = true
        text.isSelected = true
    }

    override fun onResume() {
        super.onResume()
        progressViewUpdateHelper.start()
    }

    override fun onPause() {
        super.onPause()
        progressViewUpdateHelper.stop()
    }

    public override fun show() {
        playPauseButton!!.animate()
            .scaleX(1f)
            .scaleY(1f)
            .setInterpolator(DecelerateInterpolator())
            .start()
    }

    public override fun hide() {
        playPauseButton!!.apply {
            scaleX = 0f
            scaleY = 0f
            rotation = 0f
        }
    }

    override fun setColor(color: MediaNotificationProcessor) {
        if (ATHUtil.isWindowBackgroundDark(requireContext())) {
            lastPlaybackControlsColor =
                MaterialValueHelper.getSecondaryTextColor(requireContext(), false)
            lastDisabledPlaybackControlsColor =
                MaterialValueHelper.getSecondaryDisabledTextColor(requireContext(), false)
        } else {
            lastPlaybackControlsColor =
                MaterialValueHelper.getPrimaryTextColor(requireContext(), true)
            lastDisabledPlaybackControlsColor =
                MaterialValueHelper.getPrimaryDisabledTextColor(requireContext(), true)
        }

        val colorFinal = if (PreferenceUtil.isAdaptiveColor) {
            color.primaryTextColor
        } else {
            ThemeStore.accentColor(requireContext()).ripAlpha()
        }

        updateTextColors(colorFinal)
        volumeFragment?.setTintable(colorFinal)
        progressSlider.applyColor(colorFinal)
        updateRepeatState()
        updateShuffleState()
    }

    private fun updateTextColors(color: Int) {
        val isDark = ColorUtil.isColorLight(color)
        val darkColor = ColorUtil.darkenColor(color)
        val colorPrimary = MaterialValueHelper.getPrimaryTextColor(context, isDark)
        val colorSecondary =
            MaterialValueHelper.getSecondaryTextColor(context, ColorUtil.isColorLight(darkColor))

        TintHelper.setTintAuto(playPauseButton, colorPrimary, false)
        TintHelper.setTintAuto(playPauseButton, color, true)

        title.setBackgroundColor(color)
        title.setTextColor(colorPrimary)
        text.setBackgroundColor(darkColor)
        text.setTextColor(colorSecondary)
        songInfo.setBackgroundColor(darkColor)
        songInfo.setTextColor(colorSecondary)
    }

    override fun onServiceConnected() {
        updatePlayPauseDrawableState()
        updateRepeatState()
        updateShuffleState()
        updateSong()
    }

    override fun onPlayingMetaChanged() {
        super.onPlayingMetaChanged()
        updateSong()
    }

    override fun onPlayStateChanged() {
        updatePlayPauseDrawableState()
    }

    private fun setUpPlayPauseFab() {
        playPauseButton.setOnClickListener(PlayPauseButtonOnClickHandler())
    }

    private fun updatePlayPauseDrawableState() {
        if (MusicPlayerRemote.isPlaying) {
            playPauseButton.setImageResource(R.drawable.ic_pause)
        } else {
            playPauseButton.setImageResource(R.drawable.ic_play_arrow_white_32dp)
        }
    }

    private fun setUpMusicControllers() {
        setUpPlayPauseFab()
        setUpRepeatButton()
        setUpShuffleButton()
        setUpProgressSlider()
    }

    private fun updateSong() {
        val song = MusicPlayerRemote.currentSong
        title.text = song.title
        text.text = song.artistName
        if (PreferenceUtil.isSongInfo) {
            songInfo.text = getSongInfo(song)
            songInfo.show()
        } else {
            songInfo.hide()
        }
    }

    override fun onRepeatModeChanged() {
        updateRepeatState()
    }

    override fun onShuffleModeChanged() {
        updateShuffleState()
    }

    private fun setUpRepeatButton() {
        repeatButton.setOnClickListener { MusicPlayerRemote.cycleRepeatMode() }
    }

    override fun updateRepeatState() {
        when (MusicPlayerRemote.repeatMode) {
            MusicService.REPEAT_MODE_NONE -> {
                repeatButton.setImageResource(R.drawable.ic_repeat)
                repeatButton.setColorFilter(
                    lastDisabledPlaybackControlsColor,
                    PorterDuff.Mode.SRC_IN
                )
            }
            MusicService.REPEAT_MODE_ALL -> {
                repeatButton.setImageResource(R.drawable.ic_repeat)
                repeatButton.setColorFilter(lastPlaybackControlsColor, PorterDuff.Mode.SRC_IN)
            }
            MusicService.REPEAT_MODE_THIS -> {
                repeatButton.setImageResource(R.drawable.ic_repeat_one)
                repeatButton.setColorFilter(lastPlaybackControlsColor, PorterDuff.Mode.SRC_IN)
            }
        }
    }

    private fun setUpShuffleButton() {
        shuffleButton.setOnClickListener { MusicPlayerRemote.toggleShuffleMode() }
    }

    override fun updateShuffleState() {
        when (MusicPlayerRemote.shuffleMode) {
            MusicService.SHUFFLE_MODE_SHUFFLE -> shuffleButton.setColorFilter(
                lastPlaybackControlsColor,
                PorterDuff.Mode.SRC_IN
            )
            else -> shuffleButton.setColorFilter(
                lastDisabledPlaybackControlsColor,
                PorterDuff.Mode.SRC_IN
            )
        }
    }

    override fun setUpProgressSlider() {
        progressSlider.setOnSeekBarChangeListener(object : SimpleOnSeekbarChangeListener() {
            override fun onProgressChanged(seekBar: SeekBar, progress: Int, fromUser: Boolean) {
                if (fromUser) {
                    MusicPlayerRemote.seekTo(progress)
                    onUpdateProgressViews(
                        MusicPlayerRemote.songProgressMillis,
                        MusicPlayerRemote.songDurationMillis
                    )
                }
            }
        })
    }

    override fun onUpdateProgressViews(progress: Int, total: Int) {
        progressSlider.max = total

        val animator = ObjectAnimator.ofInt(progressSlider, "progress", progress)
        animator.duration = SLIDER_ANIMATION_TIME
        animator.interpolator = LinearInterpolator()
        animator.start()

        songTotalTime.text = MusicUtil.getReadableDurationString(total.toLong())
        songCurrentProgress.text = MusicUtil.getReadableDurationString(progress.toLong())
    }
}
