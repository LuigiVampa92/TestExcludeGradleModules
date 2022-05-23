package com.luigivampa92.testfeature_api

import com.luigivampa92.core.FeatureApi

interface TestFeatureApi : FeatureApi {

    fun getAvailabilityChecker(): TestFeatureAvailabilityChecker

    fun getFeatureLauncher(): TestFeatureLauncher

}