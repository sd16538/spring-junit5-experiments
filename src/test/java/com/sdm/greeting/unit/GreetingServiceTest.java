package com.sdm.greeting.unit;

import com.sdm.greeting.GreetingService;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class GreetingServiceTest {

    @Test
    public void greetingCounterShouldReturn1OnFirstCall() throws Exception {
        assertThat(new GreetingService().badlyNamedMethod(), is(1L));
    }
}
