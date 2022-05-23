package com.luigivampa92.testfeature_impl

import android.util.Log
import com.luigivampa92.core.CoreConstants
import com.luigivampa92.testfeature_api.TestFeatureLauncher

class TestFeatureLauncherImpl : TestFeatureLauncher {

    override fun launch() {
        Log.d(CoreConstants.LOG_TAG, "Feature launched!")
    }
}