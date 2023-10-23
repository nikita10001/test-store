package uni.project.store.сontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uni.project.store.entity.BasketDevice;
import uni.project.store.entity.CartEntity;
import uni.project.store.entity.DeviceEntity;
import uni.project.store.repository.BasketDeviceRepo;
import uni.project.store.repository.CartRepo;
import uni.project.store.repository.DeviceRepo;

import java.util.*;

@RestController
@RequestMapping("/basket")
public class CartController {

    @Autowired
    private CartRepo basketRepository;
    @Autowired
    private BasketDeviceRepo basketDeviceRepo;
    @Autowired
    private DeviceRepo deviceRepository;

    @PostMapping("/{basketId}/add/{deviceId}")
    public ResponseEntity<?> addItemToBasket(@PathVariable Long basketId, @PathVariable Long deviceId) {
        Optional<CartEntity> optionalBasket = basketRepository.findById(basketId);
        Optional<DeviceEntity> optionalDevice = deviceRepository.findById(deviceId);

        if (optionalBasket.isPresent() && optionalDevice.isPresent()) {
            CartEntity basket = optionalBasket.get();
            DeviceEntity device = optionalDevice.get();
            BasketDevice basketDevice = new BasketDevice(basket, device);
           
            basket.getBasketDevices().add(basketDevice);
            basketRepository.save(basket);
            basketDeviceRepo.save(basketDevice);
            return ResponseEntity.ok("Item added to basket");
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/{basketId}/items")
    public ResponseEntity<Set<DeviceEntity>> getAllItemsInBasket(@PathVariable Long basketId) {
        Optional<CartEntity> optionalBasket = basketRepository.findById(basketId);

        if (optionalBasket.isPresent()) {
            CartEntity basket = optionalBasket.get();
            
            Set<BasketDevice> basketDevices = basket.getBasketDevices();

            Set<DeviceEntity> devices = new HashSet<>();

            for (BasketDevice basketDevice : basketDevices) {
                DeviceEntity device = basketDevice.getDevice();
                devices.add(device);
            }

            return ResponseEntity.ok(devices);
        } else {
            return ResponseEntity.notFound().build();
        }
    }


}