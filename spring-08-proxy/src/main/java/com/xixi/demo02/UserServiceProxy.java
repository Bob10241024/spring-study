package com.xixi.demo02;

/**
 * 3、代理对象
 */
public class UserServiceProxy implements UserService{
    private UserServiceImpl userService;

    public void setUserService(UserServiceImpl userService) {
        this.userService = userService;
    }

    @Override
    public void add() {
        log("add");
        userService.add();
    }

    @Override
    public void delete() {
        log("delete");
        userService.delete();
    }

    @Override
    public void update() {
        log("update");
        userService.update();
    }

    @Override
    public void query() {
        log("query");
        userService.query();
    }

    //自定义日志方法
    public void log(String msg){
        System.out.println("[Debug] 使用了一个" + msg + "方法");
    }
}
