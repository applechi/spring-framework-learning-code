package com.linkedbear.spring.basic_di_08_10.c_value_spel.bean;

public class Green {

//    @Value("#{'copy of ' + blue.name}")
    private String name;

//    @Value("#{blue.order + 1}")
    private Integer order;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    @Override
    public String toString() {
        return "Green{" + "name='" + name + '\'' + ", order=" + order + '}';
    }
}
