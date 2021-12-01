package com.veldan.loaders

import com.airbnb.lottie.LottieDrawable
import com.badlogic.gdx.ApplicationAdapter
import com.badlogic.gdx.Gdx
import com.badlogic.gdx.graphics.Color
import com.badlogic.gdx.utils.ScreenUtils
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class LibGDXGame : ApplicationAdapter() {

    private var index = 0
    private val animations = listOf(
        R.raw.animation_1,
        R.raw.animation_2,
        R.raw.animation_3,
        R.raw.animation_4,
        R.raw.animation_5,
        R.raw.animation_6,
        R.raw.animation_7,
        R.raw.animation_8,
        R.raw.animation_9,
        R.raw.animation_10,
        R.raw.animation_11,
        R.raw.animation_12,
        R.raw.animation_13,
        R.raw.animation_14,
    )

    override fun render() {
        ScreenUtils.clear(Color.PURPLE)

        if (Gdx.input.justTouched()) {
            CoroutineScope(Dispatchers.Main).launch {
                binding.lottie.apply {
                    setAnimation(animations[index])
                    repeatCount = LottieDrawable.INFINITE
                    playAnimation()
                }

                if (index == animations.size - 1) index = 0
                else index++
            }
        }
    }

}