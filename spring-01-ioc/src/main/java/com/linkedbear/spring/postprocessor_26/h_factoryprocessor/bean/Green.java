package com.linkedbear.spring.postprocessor_26.h_factoryprocessor.bean;

import org.springframework.stereotype.Component;

@Component
public class Green extends Color {

    @Override
    public String toString() {
        return "Green{" + "name='" + name + '\'' + "}";
    }
}
