package com.luigivampa92.nestedfeature.impl

import android.util.Log
import com.luigivampa92.core.CoreConstants
import com.luigivampa92.nestedfeature.api.NestedFeatureLauncher

class NestedFeatureLauncherImpl : NestedFeatureLauncher {

    override fun launch() {
        Log.d(CoreConstants.LOG_TAG, "Real nested feature implementation launched!")
    }
}