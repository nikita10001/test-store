package uni.project.store.entity;


import jakarta.persistence.*;

import java.util.List;
import java.util.Set;

@Entity
public class DeviceEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int price;
    private double rating;
    private String img;
    private String description;

    @OneToMany(mappedBy = "device")
    private Set<BasketDevice> basketDevices;

    public DeviceEntity(){}

    public DeviceEntity(Long id, String name, int price, double rating, String img, String description) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.rating = rating;
        this.img = img;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
