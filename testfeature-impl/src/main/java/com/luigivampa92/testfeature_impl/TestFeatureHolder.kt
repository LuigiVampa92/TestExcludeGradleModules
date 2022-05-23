package com.luigivampa92.testfeature_impl

import com.luigivampa92.testfeature_api.TestFeatureApi
import com.luigivampa92.testfeature_api.TestFeatureAvailabilityChecker
import com.luigivampa92.testfeature_api.TestFeatureLauncher

class TestFeatureHolder : TestFeatureApi {

    override fun getAvailabilityChecker(): TestFeatureAvailabilityChecker {
        return TestFeatureAvailabilityCheckerImpl()
    }

    override fun getFeatureLauncher(): TestFeatureLauncher {
        return TestFeatureLauncherImpl()
    }
}