package com.hw.springannotation.ext;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.EventListener;
import org.springframework.context.event.SourceFilteringListener;
import org.springframework.stereotype.Service;

/**
 * @Description TODO
 * @Author hw
 * @Date 2018/12/17 17:20
 * @Version 1.0
 */
@Service
public class UserService {

    @EventListener(classes = ApplicationEvent.class)
    public void listen(ApplicationEvent applicationEvent) {
        System.out.println("UserService 监听到的事件.. " + applicationEvent);
    }
}

