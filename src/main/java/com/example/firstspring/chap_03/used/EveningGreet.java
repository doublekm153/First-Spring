package com.example.firstspring.chap_03.used;
import org.springframework.stereotype.Component;
/*
* Greet 구현 클래스
* 저녁인사하기
*/
@Component
public class EveningGreet implements Greet{
    @Override
    public void greeting() {
        System.out.println("좋은 저녁입니다.");
    }
}
