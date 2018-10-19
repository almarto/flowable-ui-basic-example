package org.flowable.simple.configuration;

import org.flowable.engine.ProcessEngine;
import org.flowable.engine.test.FlowableRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Inaki Huete
 */
@Configuration
public class TestConfiguration {

    @Bean
    public FlowableRule flowableProcessRule(ProcessEngine processEngine) {
        return new FlowableRule(processEngine);
    }

}
