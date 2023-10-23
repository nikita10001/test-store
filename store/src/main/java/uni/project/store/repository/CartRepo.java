package uni.project.store.repository;

import org.springframework.data.repository.CrudRepository;
import uni.project.store.entity.CartEntity;

public interface CartRepo extends CrudRepository<CartEntity, Long> {
}
