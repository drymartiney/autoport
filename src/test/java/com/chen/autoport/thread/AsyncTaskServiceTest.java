package com.chen.autoport.thread;

import com.chen.autoport.service.impl.AsyncTaskService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Anthor: chen
 * Date: 2020/3/28
 * Time: 15:30
 */
@RunWith(SpringRunner.class)
@SpringBootTest
class AsyncTaskServiceTest {
    @Autowired
    private AsyncTaskService asyncTaskService;

    @Test
    public void threadTest(){
        asyncTaskService.executeAsyncTask(1);
    }

}