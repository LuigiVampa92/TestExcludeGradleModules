package com.luigivampa92.excludemodules

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.luigivampa92.app_di.DI
import com.luigivampa92.testfeature_api.TestFeatureApi

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        runTestFeature()
    }

    private fun runTestFeature() {
        val testFeatureApi: TestFeatureApi? = DI.getFeature(TestFeatureApi::class.java)
        if (testFeatureApi != null) {

            val availabilityChecker = testFeatureApi.getAvailabilityChecker()
            val launcher = testFeatureApi.getFeatureLauncher()
            if (availabilityChecker.isEnabled()) {
                launcher.launch()
            } else {
                Log.d("EXCLUDE_MODULES", "Feature reports that it is unavailable")
            }

        } else {
            Log.d("EXCLUDE_MODULES", "DI could not provide feature api")
        }
    }
}