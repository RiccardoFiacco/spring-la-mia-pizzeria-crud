package org.exercise.spring_la_mia_pizzeria_crud.model;
import java.io.Serializable;
import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "pizzas")
public class Pizza implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name", nullable = false)
    @Size(min=5)
    private String name;

    
    @Column(name = "description", nullable = false)
    @Size(min=5)
    private String description;

    @Column(name = "url",  nullable = false)
    private String url;
    
    @Column(name = "price", nullable = false)
    @Min(5)
    @Max(16)
    private float price;

    public Pizza() {}
    public Pizza(String name, String description, String url, float price, int id) {
        this.name = name;
        this.description = description;
        this.url = url;
        this.price = price;
        this.id = id;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Pizza [id=" + id + ", name=" + name + ", description=" + description + ", url=" + url + ", price="
                + price + "]";
    }
    
}
