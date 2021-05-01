package com.jeromedusanter.mystudiofactorytest.ui.utils

import android.content.Context
import android.graphics.Color
import android.graphics.PorterDuff
import android.util.DisplayMetrics
import android.widget.ImageView
import androidx.annotation.Px
import androidx.swiperefreshlayout.widget.CircularProgressDrawable

fun createCircularProgressDrawable(view: ImageView): CircularProgressDrawable {
    val circularProgressDrawable = CircularProgressDrawable(view.context)
    circularProgressDrawable.strokeWidth = 5f
    circularProgressDrawable.centerRadius = 30f
    circularProgressDrawable.setColorFilter(
        Color.BLUE,
        PorterDuff.Mode.SRC_IN
    )
    circularProgressDrawable.start()
    return circularProgressDrawable
}

@Px
fun Context.dp2px(dp: Float): Float {
    val metrics = resources.displayMetrics
    return dp * (metrics.densityDpi.toFloat() / DisplayMetrics.DENSITY_DEFAULT)
}