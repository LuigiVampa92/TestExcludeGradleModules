package com.luigivampa92.excludemodules

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.luigivampa92.app_di.DI
import com.luigivampa92.core.CoreConstants
import com.luigivampa92.nestedfeature.api.NestedFeatureApi
import com.luigivampa92.standalonefeature.StandaloneFeature
import com.luigivampa92.testfeature_api.TestFeatureApi

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        runTestFeature()
        runNestedFeature()
        runStandaloneFeature()
    }

    private fun runTestFeature() {
        val testFeatureApi: TestFeatureApi? = DI.getFeature(TestFeatureApi::class.java)
        if (testFeatureApi != null) {
            val availabilityChecker = testFeatureApi.getAvailabilityChecker()
            val launcher = testFeatureApi.getFeatureLauncher()
            if (availabilityChecker.isEnabled()) {
                launcher.launch()
            } else {
                Log.d(CoreConstants.LOG_TAG, "Test feature reports that it is unavailable")
            }
        } else {
            Log.d(CoreConstants.LOG_TAG, "DI could not provide test feature api")
        }
    }

    private fun runNestedFeature() {
        val nestedFeatureApi: NestedFeatureApi? = DI.getFeature(NestedFeatureApi::class.java)
        if (nestedFeatureApi != null) {
            val availabilityChecker = nestedFeatureApi.getAvailabilityChecker()
            val launcher = nestedFeatureApi.getFeatureLauncher()
            if (availabilityChecker.isEnabled()) {
                launcher.launch()
            } else {
                Log.d(CoreConstants.LOG_TAG, "Nested feature reports that it is unavailable")
            }
        } else {
            Log.d(CoreConstants.LOG_TAG, "DI could not provide nested feature api")
        }
    }

    private fun runStandaloneFeature() {
        val standaloneFeature: StandaloneFeature? = DI.getFeature(StandaloneFeature::class.java)
        if (standaloneFeature != null) {
            val featureString = standaloneFeature.getStandaloneFeatureString()
            Log.d(CoreConstants.LOG_TAG, "Standalone feature provided string: $featureString")
        } else {
            Log.d(CoreConstants.LOG_TAG, "DI could not provide standalone feature api")
        }
    }
}