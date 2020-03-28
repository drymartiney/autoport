package com.chen.autoport.init;

import com.chen.autoport.service.impl.AsyncTaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 * Anthor: chen
 * Date: 2020/3/28
 * Time: 15:40
 */
@Component
public class InitProject implements ApplicationRunner {
    @Autowired
    private AsyncTaskService asyncTaskService;
    @Override
    public void run(ApplicationArguments args) throws Exception {
        asyncTaskService.executeAsyncTask(1);
    }
}
