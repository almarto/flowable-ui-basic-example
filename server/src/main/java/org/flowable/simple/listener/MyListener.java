package org.flowable.simple.listener;

import org.flowable.common.engine.api.delegate.event.AbstractFlowableEventListener;
import org.flowable.common.engine.api.delegate.event.FlowableEngineEventType;
import org.flowable.common.engine.api.delegate.event.FlowableEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Inaki Huete
 */
public class MyListener extends AbstractFlowableEventListener {

    private static final Logger log = LoggerFactory.getLogger(MyListener.class);

    @Override
    public void onEvent(FlowableEvent flowableEvent) {
        if (flowableEvent.getType() == FlowableEngineEventType.PROCESS_STARTED) {
            log.info("A process has started");
        } else if (flowableEvent.getType() == FlowableEngineEventType.PROCESS_COMPLETED) {
            log.info("A process has completed");
        } else {
            log.info("Event received: " + flowableEvent.getType());
        }
    }

    @Override
    public boolean isFailOnException() {
        return false;
    }

}
