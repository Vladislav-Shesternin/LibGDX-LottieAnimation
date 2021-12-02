package com.veldan.loaders

import com.badlogic.gdx.ApplicationAdapter
import com.badlogic.gdx.Gdx
import com.badlogic.gdx.graphics.Color
import com.badlogic.gdx.utils.ScreenUtils

class LibGDXGame : ApplicationAdapter() {

    var a = true

    override fun render() {
        ScreenUtils.clear(Color.PURPLE)

        if (Gdx.input.justTouched()) {
            a = if (a) {
                Gdx.app.log("VLAD", "show")
                Loader.show(R.raw.animation_1)
                false
            } else {
                Gdx.app.log("VLAD", "hide")
                Loader.hide()
                true
            }

        }
    }

}