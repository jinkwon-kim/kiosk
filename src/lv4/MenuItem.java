package lv4;

public class MenuItem {
    //속성
    private String name;
    private double price;
    private String explain;
    //생성자
    public MenuItem(String name, double price, String explain) {
        this.name = name;
        this.price = price;
        this.explain = explain;
    };
    //기능
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getExplain() {
        return explain;
    }
}
