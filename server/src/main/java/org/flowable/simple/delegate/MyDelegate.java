package org.flowable.simple.delegate;

import org.flowable.engine.delegate.DelegateExecution;
import org.flowable.engine.delegate.JavaDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @author Inaki Huete
 */
@Component
public class MyDelegate implements JavaDelegate {

    private static final Logger log = LoggerFactory.getLogger(MyDelegate.class);

    @Override
    public void execute(DelegateExecution execution) {
        log.info("Executing MyDelegate logic");
    }

}
