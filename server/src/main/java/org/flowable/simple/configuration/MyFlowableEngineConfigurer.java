package org.flowable.simple.configuration;

import java.util.Collections;

import org.flowable.simple.listener.MyListener;
import org.flowable.spring.SpringProcessEngineConfiguration;
import org.flowable.spring.boot.EngineConfigurationConfigurer;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyFlowableEngineConfigurer implements EngineConfigurationConfigurer<SpringProcessEngineConfiguration> {

    public void configure(SpringProcessEngineConfiguration processEngineConfiguration) {
        // advanced configuration
        processEngineConfiguration.setEventListeners(Collections.singletonList(new MyListener()));
    }

}
