package lv4;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    //속성
    private List<MenuItem> menuItems;
    private String categoryName;
    //생성자
public Menu (String categoryName) {
    this.categoryName = categoryName;
    this.menuItems = new ArrayList<>();
}
    //기능
    //List에 들어있는 MenuItem을 순차적으로 보여주는 함수
    public void printmenuItems() {
        System.out.println("\n[" + categoryName + "]");
        for (int i = 0; i < menuItems.size(); i++) {
            MenuItem item = menuItems.get(i);
            System.out.printf("%d. %-15s | w %.1f | %s;\n", (i + 1), item.getName(), item.getPrice(), item.getExplain());
        }
        System.out.println("0. 뒤로가기");
    };
    //List를 리턴하는 함수
    public List<MenuItem> getMenuItems() {
        return menuItems;}
    //상위카테고리를 리턴하는 함수
        public String getCategoryName() {
            return categoryName;
        }
    // 매뉴아이템 추가하는 기능
        public void addMenuItem(MenuItem item) {
            menuItems.add(item);
        }

}
