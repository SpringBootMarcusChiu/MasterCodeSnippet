package com.marcuschiu.example.spring.boot.mastercodesnippet._sandbox;

import org.springframework.beans.BeanUtils;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Objects;
import java.util.function.Supplier;

public class SandboxMain {
    public SandboxMain() {
    }

    public static void main(String[] args) {

        String obj = factory(String::new);
        System.out.println(obj);

        String obj2 = factory("fffdff"::toString);
        System.out.println(obj2);

        Supplier<String> f = String::new;
        System.out.println(f.get());
    }

    public static String factory(Supplier<?> s) {

        String developer = (String) s.get();
        if (developer == null || "".equals(developer)) {
            developer = "default";
        }

        return developer;

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
