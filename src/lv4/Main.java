package lv4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    //속성

    //생성자

    //기능
    public static void main(String[] args) {

    Menu burgerMenu = new Menu("BURGERS MENU");
        burgerMenu.addMenuItem(new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        burgerMenu.addMenuItem(new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        burgerMenu.addMenuItem(new MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        burgerMenu.addMenuItem(new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));

    Menu drinkMenu = new Menu("DRINK MENU");
        drinkMenu.addMenuItem(new MenuItem("Pepsi", 2.0, "펩시제로"));
        drinkMenu.addMenuItem(new MenuItem("Fanta", 2.5, "환타"));
        drinkMenu.addMenuItem(new MenuItem("Cyder", 2.0, "사이다"));

    Menu dessertMenu = new Menu("DESSERT MENU");
        dessertMenu.addMenuItem(new MenuItem("Vanilla Icecream", 3.0, "바닐라맛 아이스크림"));
        dessertMenu.addMenuItem(new MenuItem("French Fries", 2.5, "감자튀김"));
        dessertMenu.addMenuItem(new MenuItem("Chicken Wrap", 4.0, "치킨 랩"));

        List<Menu> menus = new ArrayList<>();
        menus.add(burgerMenu);
        menus.add(drinkMenu);
        menus.add(dessertMenu);

        Kiosk kiosk = new Kiosk(menus);
        kiosk.Start();
    }
}
