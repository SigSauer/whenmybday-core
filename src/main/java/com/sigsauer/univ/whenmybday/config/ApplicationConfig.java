package com.sigsauer.univ.whenmybday.config;

import com.sigsauer.univ.whenmybday.config.binder.ApplicationBinder;
import org.glassfish.jersey.server.ResourceConfig;

public class ApplicationConfig extends ResourceConfig {

    public ApplicationConfig() {
        packages("com.sigsauer.univ.whenmybday.controller");
//        register(new AuthenticationFilter());
        register(new ApplicationBinder());
    }

}
