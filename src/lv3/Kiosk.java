package lv3;

import java.util.List;
import java.util.Scanner;

public class Kiosk {
    //속성
    private List<MenuItem> menuItems;

    //생성자
    public Kiosk (List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }
    //기능
    //Start 함수 만들기
    public void Start() {
    Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("[ SHAKESHACK MENU ]");
            for (int i = 0; i < menuItems.size(); i++) {
                lv3.MenuItem item = menuItems.get(i);
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
