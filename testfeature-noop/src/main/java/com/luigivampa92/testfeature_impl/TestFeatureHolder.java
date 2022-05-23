package com.luigivampa92.testfeature_impl;

//import androidx.annotation.NonNull;

import com.luigivampa92.testfeature_api.TestFeatureApi;
import com.luigivampa92.testfeature_api.TestFeatureAvailabilityChecker;
import com.luigivampa92.testfeature_api.TestFeatureLauncher;

public class TestFeatureHolder implements TestFeatureApi {

//    @NonNull
    @Override
    public TestFeatureAvailabilityChecker getAvailabilityChecker() {
        return new TestFeatureAvailabilityChecker() {
            @Override
            public boolean isEnabled() {
                return false;
            }
        };
    }

//    @NonNull
    @Override
    public TestFeatureLauncher getFeatureLauncher() {
        return new TestFeatureLauncher() {
            @Override
            public void launch() {}
        };
    }
}
