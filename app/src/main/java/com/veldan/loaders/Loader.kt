package com.veldan.loaders

import androidx.annotation.RawRes
import androidx.core.view.isVisible
import com.airbnb.lottie.LottieDrawable
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

object Loader {

    private val coroutineAnimation = CoroutineScope(Dispatchers.Main)

    fun show(@RawRes animationId: Int) {
        coroutineAnimation.launch {
            binding.lottie.apply {
                isVisible = true
                setAnimation(animationId)
                repeatCount = LottieDrawable.INFINITE
                playAnimation()
            }
        }
    }

    fun hide() {
        coroutineAnimation.launch {
            binding.lottie.apply {
                isVisible = false
                cancelAnimation()
            }
        }
    }

}