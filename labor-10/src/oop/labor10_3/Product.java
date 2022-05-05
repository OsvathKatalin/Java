package oop.labor10_3;

import oop.labor10_1.MyDate;

public class Product implements Comparable<Product>{
    private int id, amount, price;
    private String name;

    public Product(int id, int amount, int price, String name) {
        this.id = id;
        this.amount = amount;
        this.price = price;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public int getAmount() {
        return amount;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", amount=" + amount +
                ", price=" + price +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Product o) {
        int cmp=Integer.compare(this.id,o.id);
        return cmp;
    }

    public void increaseAmount(int newAmount)
    {
        amount+=newAmount;
    }
}
