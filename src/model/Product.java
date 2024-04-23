package src.model;

import java.util.ArrayList;
import java.util.List;

public class Product {
    private int id;
    private String name;
    List<Property> properties;
    private double price;
    private Category category;

    public Product() {
        this.properties = new ArrayList<>();

    }
    public void addProperty(Property property){
        properties.add(property);

    }


    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {

        this.category = category;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", properties=" + properties +
                ", price=" + price +
                ", category=" + category.getName() +
                '}';
    }

    public List<Property> getProperties() {
        return properties;
    }

    public void setProperties(List<Property> properties) {
        this.properties = properties;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
