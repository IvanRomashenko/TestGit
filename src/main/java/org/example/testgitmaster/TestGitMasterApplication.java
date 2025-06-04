package org.example.testgitmaster;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestGitMasterApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestGitMasterApplication.class, args);


        System.out.println("Hello world!!!");

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }

}
