package lv4;

import java.util.List;
import java.util.Scanner;

public class Kiosk {
    //속성
    private List<Menu> menuList;
    private Scanner scanner;
    //생성자
    public Kiosk (List<Menu> menuList) {
        this.menuList = menuList;
        this.scanner = new Scanner(System.in);
    }
    //기능
    public void Start() {
            while (true) {
                System.out.println("\n[ MAIN MENU ]");
                for (int i= 0; i < menuList.size(); i++) {
                    System.out.println((i + 1) + "." + menuList.get(i).getCategoryName().replace("MENU", ""));
                }
                System.out.println("0. 종료    | 종료");

                System.out.println("숫자를 입력하세요");
                int input = scanner.nextInt();

                if (input == 0) {
                    System.out.println("프로그램을 종료합니다.");
                    break;
                }
                if (input <1 || input > menuList.size()) {
                    System.out.println("잘못된 입력입니다.");
                    continue;
                }
                Menu selectedMenu = menuList.get(input - 1);
                handleSubMenu(selectedMenu);

            }
    }
    //리스트에 들어있는 매뉴 아이템을 출력
    private void handleSubMenu(Menu menu) {
        while (true) {
            menu.printmenuItems();
            System.out.println("숫자를 입력하세요.");
            int input = scanner.nextInt();

            if (input ==0) break;
            List<MenuItem> items = menu.getMenuItems();

            if (input < 1 || input > items.size()) {
                System.out.println("잘못된 입력입니다.");
                continue;
            }
            MenuItem selectedItem = items.get(input - 1);
            System.out.printf("선택한 메뉴: %s | W %.1f | %s\n", selectedItem.getName(), selectedItem.getPrice(), selectedItem.getExplain());
        }
    }
}
