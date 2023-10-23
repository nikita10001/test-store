package uni.project.store.сontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uni.project.store.entity.CartEntity;
import uni.project.store.repository.CartRepo;

@RestController
@RequestMapping("/basket")
public class BasketCreateController {

    @Autowired
    private CartRepo basketRepository;

    @PostMapping("/create")
    public ResponseEntity<?> createBasket() {
        CartEntity basket = new CartEntity();
        basketRepository.save(basket);

        return ResponseEntity.ok("Basket created with ID: " + basket.getId());
    }

}
