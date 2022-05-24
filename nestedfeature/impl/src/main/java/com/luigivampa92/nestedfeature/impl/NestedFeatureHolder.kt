package com.luigivampa92.nestedfeature.impl

import com.luigivampa92.nestedfeature.api.NestedFeatureApi

class NestedFeatureHolder : NestedFeatureApi {

    override fun getAvailabilityChecker() = NestedFeatureAvailabilityCheckerImpl()

    override fun getFeatureLauncher() = NestedFeatureLauncherImpl()

}