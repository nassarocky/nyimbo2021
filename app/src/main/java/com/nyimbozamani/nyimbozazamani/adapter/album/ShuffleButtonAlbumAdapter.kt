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
package com.nyimbozamani.nyimbozazamani.adapter.album

import android.view.View
import androidx.fragment.app.FragmentActivity
import code.name.monkey.appthemehelper.ThemeStore
import com.nyimbozamani.nyimbozazamani.R
import com.nyimbozamani.nyimbozazamani.extensions.applyColor
import com.nyimbozamani.nyimbozazamani.extensions.applyOutlineColor
import com.nyimbozamani.nyimbozazamani.helper.MusicPlayerRemote
import com.nyimbozamani.nyimbozazamani.interfaces.ICabHolder
import com.nyimbozamani.nyimbozazamani.model.Song
import com.google.android.material.button.MaterialButton
import com.nyimbozamani.nyimbozazamani.adapter.albums.AlbumAdapter

class ShuffleButtonAlbumAdapter(
        activity: FragmentActivity,
        dataSet: MutableList<Song>,
        itemLayoutRes: Int,
        ICabHolder: ICabHolder?
) : AbsOffsetSAlbumAdapter(activity, dataSet, itemLayoutRes, ICabHolder) {

    override fun createViewHolder(view: View): AlbumAdapter.ViewHolder {
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: AlbumAdapter.ViewHolder, position: Int) {
        if (holder.itemViewType == OFFSET_ITEM) {
            val color = ThemeStore.accentColor(activity)
            val viewHolder = holder as ViewHolder
            viewHolder.playAction?.let {
                it.setOnClickListener {
                    MusicPlayerRemote.openQueue(dataSet, 0, true)
                }
                it.applyOutlineColor(color)
            }
            viewHolder.shuffleAction?.let {
                it.setOnClickListener {
                    MusicPlayerRemote.openAndShuffleQueue(dataSet, true)
                }
                it.applyColor(color)
            }
        } else {
            super.onBindViewHolder(holder, position - 1)
        }
    }

    inner class ViewHolder(itemView: View) : AbsOffsetSAlbumAdapter.ViewHolder(itemView) {
        val playAction: MaterialButton? = itemView.findViewById(R.id.playAction)
        val shuffleAction: MaterialButton? = itemView.findViewById(R.id.shuffleAction)

        override fun onClick(v: View?) {
            if (itemViewType == OFFSET_ITEM) {
                MusicPlayerRemote.openAndShuffleQueue(dataSet, true)
                return
            }
            super.onClick(v)
        }
    }
}
