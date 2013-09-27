package de.fhopf.togglz;

import org.togglz.core.Feature;
import org.togglz.core.manager.TogglzConfig;
import org.togglz.core.repository.StateRepository;
import org.togglz.core.repository.file.FileBasedStateRepository;
import org.togglz.core.user.UserProvider;
import org.togglz.servlet.user.ServletUserProvider;
import java.io.File;

public class ToggledFeatureConfiguration implements TogglzConfig {

    public Class<? extends Feature> getFeatureClass() {
        return ToggledFeature.class;
    }

    public StateRepository getStateRepository() {
        return new FileBasedStateRepository(new File("/tmp/features.properties"));
    }

    public UserProvider getUserProvider() {
        return new ServletUserProvider("ADMIN_ROLE");
    }
}
