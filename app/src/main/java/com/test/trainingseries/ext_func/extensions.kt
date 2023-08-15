package com.test.trainingseries.ext_func

import android.widget.ImageView
import coil.decode.VideoFrameDecoder
import coil.load

fun ImageView.loadVideoUrl(url: String) = this.apply {
    load(url) {
        decoderFactory { result, options, _ ->
            VideoFrameDecoder(
                result.source,
                options
            )
        }
    }
    scaleType = ImageView.ScaleType.CENTER_CROP
}