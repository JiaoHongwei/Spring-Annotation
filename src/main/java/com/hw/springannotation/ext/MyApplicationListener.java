package com.hw.springannotation.ext;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @Description TODO
 * @Author hw
 * @Date 2018/12/17 16:25
 * @Version 1.0
 */
@Component
public class MyApplicationListener implements ApplicationListener {
    /**
     * Handle an application event.
     *
     * @param event the event to respond to
     */
    public void onApplicationEvent(ApplicationEvent event) {
        System.out.println("收到事件." + event);
    }
}
