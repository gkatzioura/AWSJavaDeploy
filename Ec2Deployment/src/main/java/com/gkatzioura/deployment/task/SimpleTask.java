package com.gkatzioura.deployment.task;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Created by gkatzioura on 12/16/16.
 */
@Component
public class SimpleTask {

    private static final Logger LOGGER = LoggerFactory.getLogger(SimpleTask.class);

    @Scheduled(fixedRate = 5000)
    public void reportCurrentTime() {
        LOGGER.info("This is a simple task on ec2");
    }

}

