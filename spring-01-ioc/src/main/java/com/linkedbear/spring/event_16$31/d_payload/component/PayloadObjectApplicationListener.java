package com.linkedbear.spring.event_16$31.d_payload.component;

import org.springframework.context.ApplicationListener;
import org.springframework.context.PayloadApplicationEvent;

public class PayloadObjectApplicationListener implements ApplicationListener<PayloadApplicationEvent> {

    @Override
    public void onApplicationEvent(PayloadApplicationEvent event) {
        System.out.println("监听到PayloadApplicationEvent ------> " + event.getPayload());
    }
}
