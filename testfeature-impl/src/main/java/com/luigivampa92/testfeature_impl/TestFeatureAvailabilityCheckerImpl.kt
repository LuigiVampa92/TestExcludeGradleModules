package com.luigivampa92.testfeature_impl

import com.luigivampa92.testfeature_api.TestFeatureAvailabilityChecker

class TestFeatureAvailabilityCheckerImpl : TestFeatureAvailabilityChecker {

    override fun isEnabled(): Boolean {
        return true
    }
}