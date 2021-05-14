package com.nyimbozamani.nyimbozazamani.model

import org.jaudiotagger.tag.FieldKey

class LoadingInfo(
    val filePaths: List<String>?,
    val fieldKeyValueMap: Map<FieldKey, String>?,
    val artworkInfo: ArtworkInfo?
)