package com.marcuschiu.example.spring.boot.mastercodesnippet.configuration;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class MyAsyncService {

    /**
     * @Async - spawns a new thread to execute the method body.
     * the threads are created and managed by a bean named "myThreadPoolTaskExecutor"
     */
    @Async("myThreadPoolTaskExecutor")
    public void test() {
        System.out.println("Execute method with Executor - " + Thread.currentThread().getName());
    }

}
