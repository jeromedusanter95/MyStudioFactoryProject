package com.jeromedusanter.mystudiofactorytest.ui.utils

import android.widget.ImageView
import android.widget.TextView
import androidx.annotation.StringRes
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions
import com.bumptech.glide.request.RequestOptions
import com.jeromedusanter.mystudiofactorytest.R

@BindingAdapter("app:url")
fun loadImage(view: ImageView, url: String) {
    if (url.isNotEmpty()) {
        Glide.with(view.context)
            .load(url)
            .apply(RequestOptions().transform(RoundedCorners(view.context.dp2px(32f).toInt())))
            .transition(DrawableTransitionOptions.withCrossFade())
            .placeholder(createCircularProgressDrawable(view))
            .error(R.drawable.ic_baseline_error_24)
            .timeout(30000)
            .into(view)
    }
}

@BindingAdapter("app:textRes")
fun setTextByResId(view: TextView, @StringRes resId: Int) {
    view.setText(resId)
}