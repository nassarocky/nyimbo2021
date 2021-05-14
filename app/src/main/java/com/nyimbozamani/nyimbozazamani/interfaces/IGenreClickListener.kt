package com.nyimbozamani.nyimbozazamani.interfaces

import android.view.View
import com.nyimbozamani.nyimbozazamani.model.Genre

interface IGenreClickListener {
    fun onClickGenre(genre: Genre, view: View)
}