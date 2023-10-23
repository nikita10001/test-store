package uni.project.store.entity;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class CartEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

    @OneToMany(mappedBy = "basket")
    private Set<BasketDevice> basketDevices;


    public CartEntity(User user, Set<BasketDevice> basketDevices) {
        this.user = user;
        this.basketDevices = basketDevices;
    }


    public CartEntity() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Set<BasketDevice> getBasketDevices() {
        return basketDevices;
    }

    public void setBasketDevices(Set<BasketDevice> basketDevices) {
        this.basketDevices = basketDevices;
    }
}


