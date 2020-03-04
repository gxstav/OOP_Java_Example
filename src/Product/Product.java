package src.Product;

import src.Brand.*;

public class Product {
    Brand brand;
    Double price;
    public void setBrand(Brand val) {  
        this.brand = val;
    }
    public void setPrice(Double price) {  
        this.price = price;
    }
    public Brand brand() {
        return this.brand;
    }
    public Double price() {
        return this.price;
    }
}