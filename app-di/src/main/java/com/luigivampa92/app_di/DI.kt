package com.luigivampa92.app_di

import com.luigivampa92.core.FeatureApi
import com.luigivampa92.testfeature_api.TestFeatureApi
import com.luigivampa92.testfeature_impl.TestFeatureHolder

public object DI {

    @JvmStatic
    private val di: HashMap<Class<out FeatureApi>, FeatureApi> = hashMapOf()

    @JvmStatic
    @Volatile
    private var initiated: Boolean = false

    @JvmStatic
    private fun ensureInitDi() {
        if (!initiated) {
            synchronized(DI::class) {
                if (!initiated) {
                    di.clear()
                    initDependencies()
                    initiated = true
                }
            }
        }
    }

    private fun initDependencies() {
        di[TestFeatureApi::class.java] = TestFeatureHolder()
    }

    @JvmStatic
    fun <T> getFeature(featureApi: Class<out FeatureApi>): T? {
        ensureInitDi()
        val featureHolder: FeatureApi = di[featureApi] ?: return null
        val castedHolder = try {
            featureHolder as T
        } catch (e: Exception) {
            null
        }
        return castedHolder
    }
}