package com.marcuschiu.example.spring.boot.mastercodesnippet._sandbox;

import org.springframework.beans.BeanUtils;

import java.util.Objects;

public class SandboxMain {
    public SandboxMain() {
    }

    public static void main(String[] args) {
//        Pojo1 pojo1 = new Pojo1(1, "hello");
//        Pojo2 pojo2 = new Pojo2();
//        BeanUtils.copyProperties(pojo1, pojo2);
//        System.out.println(pojo2.getI());
//        System.out.println(pojo2.getStrr());

        System.out.println(Objects.equals(null, null));

    }

    public void test(String t) {
        t = "sfsf";
    }

    public void m(int param) {
        new Thread(new Runnable() {
            public void run() {
                System.err.println(param);
            }
        }).start();
//        param = 5;
    }
}
