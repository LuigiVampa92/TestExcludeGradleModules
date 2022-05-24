package com.luigivampa92.nestedfeature.impl

import android.util.Log
import com.google.ar.core.ArCoreApk
import com.luigivampa92.core.CoreConstants
import com.luigivampa92.nestedfeature.api.NestedFeatureLauncher

class NestedFeatureLauncherImpl : NestedFeatureLauncher {

    override fun launch() {
        val a = ArCoreApk.getInstance()
        Log.d(CoreConstants.LOG_TAG, "Nested feature - real implementation launched!")
    }
}