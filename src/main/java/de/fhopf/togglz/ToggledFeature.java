package de.fhopf.togglz;

import org.togglz.core.Feature;
import org.togglz.core.context.FeatureContext;

public enum ToggledFeature implements Feature {
    
    TEXT,
    MORE_TEXT;

    public boolean isActive() {
        return FeatureContext.getFeatureManager().isActive(this);
    }
}
