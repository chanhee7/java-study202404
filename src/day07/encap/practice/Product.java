package day07.encap.practice;

public class Product {

    private String name;
    private int price;
    private int stock;

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public void reduceStock(int quantity) {

        if (quantity < 0 || this.stock < quantity) {
            System.out.println("요청한 수량이 재고보다 많거나 잘못된 수량입니다.");
            return;
        }
            this.stock -= quantity;
    }
}
