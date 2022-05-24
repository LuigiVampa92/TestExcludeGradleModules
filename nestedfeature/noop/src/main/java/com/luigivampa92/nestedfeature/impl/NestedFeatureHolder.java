package com.luigivampa92.nestedfeature.impl;

import com.luigivampa92.nestedfeature.api.NestedFeatureApi;
import com.luigivampa92.nestedfeature.api.NestedFeatureAvailabilityChecker;
import com.luigivampa92.nestedfeature.api.NestedFeatureLauncher;

public class NestedFeatureHolder implements NestedFeatureApi {

    @Override
    public NestedFeatureAvailabilityChecker getAvailabilityChecker() {
        return new NestedFeatureAvailabilityChecker() {
            @Override
            public boolean isEnabled() {
                return false;
            }
        };
    }

    @Override
    public NestedFeatureLauncher getFeatureLauncher() {
        return new NestedFeatureLauncher() {
            @Override
            public void launch() {
            }
        };
    }
}
