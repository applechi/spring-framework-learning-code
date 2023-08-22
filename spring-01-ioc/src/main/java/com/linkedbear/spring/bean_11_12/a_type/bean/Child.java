package com.linkedbear.spring.bean_11_12.a_type.bean;

public class Child {

    private String wantToy = "ball";

    public String getWantToy() {
        return wantToy;
    }

	public Child() {
		System.out.println("单例模式--IOC容器加载完就初始化了？");
	}

	@Override
    public String toString() {
        return "Child{" + "wantToy='" + wantToy + '\'' + '}';
    }
}
