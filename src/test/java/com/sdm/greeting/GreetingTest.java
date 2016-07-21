package com.sdm.greeting;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = GreetingSpringBootApplication.class)
public class GreetingTest {

    @Autowired
    private GreetingService greetingService;

    @Test
    @Disabled
    void applicationContextInjectedIntoMethod(ApplicationContext applicationContext) {
        assertNotNull(applicationContext, "ApplicationContext should have been injected by Spring");
        assertEquals(this.greetingService, applicationContext.getBean("greetingService", GreetingService.class));
    }
}
