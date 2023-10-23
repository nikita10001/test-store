package uni.project.store.repository;

import org.springframework.data.repository.CrudRepository;
import uni.project.store.entity.DeviceEntity;

public interface DeviceRepo extends CrudRepository<DeviceEntity, Long> {
    DeviceEntity findByName(String name);
}
