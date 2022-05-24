package com.luigivampa92.nestedfeature.api

import com.luigivampa92.core.FeatureApi

interface NestedFeatureApi : FeatureApi {

    fun getAvailabilityChecker(): NestedFeatureAvailabilityChecker

    fun getFeatureLauncher(): NestedFeatureLauncher

}