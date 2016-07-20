package com.sdm.greeting;

import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicLong;

@Service
public class GreetingService {
    private final AtomicLong counter = new AtomicLong();

    public long badlyNamedMethod() {
        return counter.incrementAndGet();
    }
}
