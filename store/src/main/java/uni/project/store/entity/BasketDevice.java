package uni.project.store.entity;

import jakarta.persistence.*;

@Entity
public class BasketDevice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "basket_id")
    private CartEntity basket;

    @ManyToOne
    @JoinColumn(name = "device_id")
    private DeviceEntity device;


    public BasketDevice(CartEntity basket, DeviceEntity device) {
        this.basket = basket;
        this.device = device;
    }

    public BasketDevice() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public CartEntity getBasket() {
        return basket;
    }

    public void setBasket(CartEntity basket) {
        this.basket = basket;
    }

    public DeviceEntity getDevice() {
        return device;
    }

    public void setDevice(DeviceEntity device) {
        this.device = device;
    }
}
