package com.example.firstspring;

import com.example.firstspring.chap_03.used.Greet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


//스프링 부트 기둥 클래스
@SpringBootApplication

public class FirstSpringApplication {
    /*
    * main 메소드
    * @param args
    */
    public static void main(String[] args) {
        SpringApplication.run(FirstSpringApplication.class, args)
                .getBean(FirstSpringApplication.class).execute();
    }
//    주입하는 곳(인터페이스)
    @Autowired
    Greet greet;

//    실행 메소드
    private void execute() {
        greet.greeting();
    }
}