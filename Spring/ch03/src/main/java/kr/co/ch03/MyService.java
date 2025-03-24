package kr.co.ch03;

import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class MyService {

    public void insert(){
        System.out.println("핵심기능 - insert()");

    }
    public void select() {
        Scanner scanner = new Scanner(System.in); // Scanner 객체 생성
        System.out.print("ID 입력: ");
        String id = scanner.nextLine(); // 사용자 입력을 문자열로 가져옴

        if (id.equals("a101")) {
            System.out.println("1234");
        }

        scanner.close(); // Scanner 닫기
    }

    public void update(){
        System.out.println("핵심기능 - update()");
    }

    public void delete(){
        System.out.println("핵심기능 - delete()");
    }


}
