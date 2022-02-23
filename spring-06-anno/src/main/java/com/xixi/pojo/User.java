package com.xixi.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @Component 组件
 *      等价于 <bean id="user" class="com.xixi.pojo.User"/>
 */


@Component
@Scope("prototype")
public class User {


    public String name;

    //相当于<property name="name" value="Estela"/>
    @Value("Estela")
    public void setName(String name) {
        this.name = name;
    }
}
