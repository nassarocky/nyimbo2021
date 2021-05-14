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
package com.nyimbozamani.nyimbozazamani.fragments.genres

import android.os.Bundle
import android.view.View
import androidx.core.os.bundleOf
import androidx.lifecycle.Observer
import androidx.navigation.fragment.FragmentNavigatorExtras
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.nyimbozamani.nyimbozazamani.EXTRA_GENRE
import com.nyimbozamani.nyimbozazamani.R
import com.nyimbozamani.nyimbozazamani.adapter.GenreAdapter
import com.nyimbozamani.nyimbozazamani.fragments.base.AbsRecyclerViewFragment
import com.nyimbozamani.nyimbozazamani.interfaces.IGenreClickListener
import com.nyimbozamani.nyimbozazamani.model.Genre

class GenresFragment : AbsRecyclerViewFragment<GenreAdapter, LinearLayoutManager>(),
    IGenreClickListener {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        libraryViewModel.getGenre().observe(viewLifecycleOwner, Observer {
            if (it.isNotEmpty())
                adapter?.swapDataSet(it)
            else
                adapter?.swapDataSet(listOf())
        })
    }

    override fun createLayoutManager(): LinearLayoutManager {
        return LinearLayoutManager(activity)
    }

    override fun createAdapter(): GenreAdapter {
        val dataSet = if (adapter == null) ArrayList() else adapter!!.dataSet
        return GenreAdapter(requireActivity(), dataSet, R.layout.item_list_no_image, this)
    }

    override val emptyMessage: Int
        get() = R.string.no_genres

    companion object {
        @JvmField
        val TAG: String = GenresFragment::class.java.simpleName

        @JvmStatic
        fun newInstance(): GenresFragment {
            return GenresFragment()
        }
    }

    override fun onClickGenre(genre: Genre, view: View) {
        findNavController().navigate(
            R.id.genreDetailsFragment,
            bundleOf(EXTRA_GENRE to genre),
            null,
            FragmentNavigatorExtras(
                view to "genre"
            )
        )
    }
}
