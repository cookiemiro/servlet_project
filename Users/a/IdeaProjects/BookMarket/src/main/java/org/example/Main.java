package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.print("당신의 이름을 입력하세요 : ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String name = br.readLine();

        System.out.print("연락처를 입력하세요 : ");
        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));

        String phone_number = br2.readLine();

        System.out.println();
        System.out.println("*****************************************************");
        System.out.println("               Welcome to Shopping Mall              ");
        System.out.println("               Welcome to Book Market!               ");
        System.out.println("*****************************************************");
        System.out.println("1. 고객 정보 확인하기       4. 바구니에 항목 추가하기");
        System.out.println("2. 장바구니 상품 목록 보기   5. 장바구니의 항목 수량 줄이기");
        System.out.println("3. 장바구니 비우기          4. 장바구니의 항목 삭제하기");
        System.out.println("7. 영수증 표시하기          8. 종료");
        System.out.println("*****************************************************");

        System.out.print("메뉴 번호를 선택해주세요 ");
        BufferedReader br3 = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br3.readLine());
        System.out.println();
        System.out.println(num + "번을 선택했습니다");
    }
}