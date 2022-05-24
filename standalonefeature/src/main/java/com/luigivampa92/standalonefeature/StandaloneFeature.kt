package com.luigivampa92.standalonefeature

import com.google.common.util.concurrent.AtomicDoubleArray
import com.luigivampa92.core.FeatureApi

class StandaloneFeature : FeatureApi {

    fun getStandaloneFeatureString(): String {
        val g = AtomicDoubleArray(123)
        return "I am real standalone feature"
    }

}