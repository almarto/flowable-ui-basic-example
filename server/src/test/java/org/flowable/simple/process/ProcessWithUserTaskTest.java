package org.flowable.simple.process;

import org.flowable.engine.RuntimeService;
import org.flowable.engine.TaskService;
import org.flowable.engine.runtime.ProcessInstance;
import org.flowable.engine.test.Deployment;
import org.flowable.engine.test.FlowableRule;
import org.flowable.task.api.Task;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @author Inaki Huete
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class ProcessWithUserTaskTest {

    private static final Logger log = LoggerFactory.getLogger(ProcessWithUserTaskTest.class);

    @Rule
    @Autowired
    public FlowableRule flowableRule;

    @Test
    @Deployment
    public void processWithUserTask() {
        RuntimeService runtimeService = flowableRule.getRuntimeService();


        runtimeService.startProcessInstanceByKey("process_with_usertask");

        List<ProcessInstance> processInstances = runtimeService.createProcessInstanceQuery().
                active()
                .list();
        Assert.assertEquals(1, processInstances.size());

        TaskService taskService = flowableRule.getTaskService();
        List<Task> tasks = taskService.createTaskQuery()
                .list();
        Assert.assertEquals(1, tasks.size());


    }


}
