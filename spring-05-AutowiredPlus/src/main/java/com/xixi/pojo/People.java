package com.xixi.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class People {
    /**
     *  1、如果显示的定义了Autowired的required属性为false,说明这个对象可以为null,否则不允许为空
     *
     *  2、如果@Autowired自动装配的环境比较复杂,自动装配无法通过一个注解【@Autowired】完成的时候,我们
     * 可以使用@Qualifier(value = "XXX")去配置@Autowired的使用,指定一个唯一的bean对象注入！！！
     *
     *  3、小结：
     *      @Resource和@Autowired的区别：
     *          1、都是用来自动装配的，都可以放在属性字段上
     *          2、@Autowired ： 通过byType的方式实现，而且必须要求这个对象存在！【常用】
     *          3、@Resource ： 默认通过byname的方式实现，如果找不到名字，则通过byType实现！
     *              如果两个都找不到的情况下，就报错【常用】
     *          4、执行顺序不同 ： @Autowired 通过byType的方式实现；@Resource 通过byname的方式实现；
     */
    @Autowired(required = false)
    private Cat cat;
    @Autowired
    @Qualifier(value = "dog111")
    private Dog dog;
    private String name;

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "People{" +
                "cat=" + cat +
                ", dog=" + dog +
                ", name='" + name + '\'' +
                '}';
    }
}
