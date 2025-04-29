package lv3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
    //리스트 생성
        List<MenuItem> menuItems = new ArrayList<>();
        //리스트에 값 넣기
        //리스트에 매뉴 넣기
        menuItems.add(new lv3.MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new lv3.MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new lv3.MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        menuItems.add(new lv3.MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));
        //Kiosk 클래스 활용하기
        Kiosk kiosk = new Kiosk(menuItems);
        //Start 함수 활용하기
        kiosk.Start();
    }
}
