package lv2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //리스트생성
        List<MenuItem> menuItems = new ArrayList<>();
        //리스트에 매뉴 넣기
        menuItems.add(new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));
        //스캐너 생성
        Scanner scanner = new Scanner(System.in);
        //반복문 활용하여 매뉴 출력
        while(true) {
            System.out.println("[ SHAKESHACK MENU ]");
            for (int i = 0; i < menuItems.size(); i++) {
                MenuItem item = menuItems.get(i);
                System.out.printf("%d. %-15s | W %.1f | %s%n", i + 1, item.name, item.price, item.explain);
            }
            //번호메뉴 받기
            System.out.println("메뉴 번호를 선택하세요!");
            int choice = scanner.nextInt();
            //조건문 활용하기
            switch (choice) {
                case 1:
                    System.out.println("1번 매뉴를 선택합니다.");
                    break;
                case 2:
                    System.out.println("2번 매뉴를 선택합니다.");
                    break;
                case 3:
                    System.out.println("3번 매뉴를 선택합니다.");
                    break;
                case 4:
                    System.out.println("4번 매뉴를 선택합니다.");
                    break;
            }
            int input = scanner.nextInt();
            if (input == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("매뉴 선택창으로 돌아갑니다.");
            }
        }
    }
}
