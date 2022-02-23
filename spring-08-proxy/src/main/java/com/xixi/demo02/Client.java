package com.xixi.demo02;

/**
 * 4、客户端访问代理角色
 */
public class Client {
    public static void main(String[] args) {
        // 先创建了一个真实对象
        UserServiceImpl userService = new UserServiceImpl();
        // 后创建了一个代理对象
        UserServiceProxy proxy = new UserServiceProxy();
        // 通过set()方法，将真实对象（的各种能力）给到了代理对象中，于是乎代理对象便有了真实对象的能力（方法）
        proxy.setUserService(userService);
        // 代理对象使用真实对象的超能力（方法）
        proxy.query();
    }
}
