package uni.project.store.repository;

import org.springframework.data.repository.CrudRepository;

import uni.project.store.entity.BasketDevice;
import uni.project.store.entity.CartEntity;

public interface BasketDeviceRepo extends CrudRepository<BasketDevice, Long> {
}
