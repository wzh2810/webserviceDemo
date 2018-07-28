package com.wz.service.test;


import com.wz.service.UserServiceImpl;
import com.wz.service.UserServiceImplService;

public class Demo {

    public static void main(String[] args) {

        UserServiceImplService service = new UserServiceImplService();

        UserServiceImpl userService =  service.getUserServiceImplPort();

        System.out.println(userService.getUsers());
    }
}
