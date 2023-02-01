package ques3;
import java.io.*;
import java.util.*;

public class Product {
    int productId;
    String name, price;

    Product(int productId, String name, String price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return productId;
    }

    public void setId(int productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId);
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Product other = (Product) obj;
        return Objects.equals(productId, other.productId);
    }

    @Override
    public String toString() {
        return "Product [productId=" + productId + ", name=" + name + ", price=" + price + "]";
    }
}
