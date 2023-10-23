package uni.project.store.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import uni.project.store.entity.DeviceEntity;
import uni.project.store.repository.DeviceRepo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service
public class DeviceService {
    @Autowired
    private DeviceRepo deviceRepo;

    public DeviceEntity createDevice(DeviceEntity device) throws  Exception{
        if(deviceRepo.findByName(device.getName()) != null){
            throw new Exception("Такое устройство уже существует");
        }
        return deviceRepo.save(device);
    }

    public List<DeviceEntity> getAll() {
        List<DeviceEntity> students = new ArrayList<>();
        deviceRepo.findAll().forEach(students::add);
        return students;
    }

    public DeviceEntity getSingle(Long id) throws Exception{
        DeviceEntity device = deviceRepo.findById(id).get();
        if(device == null){
            throw new Exception("Устройство не найдено");
        }
        return device;
    }

    public Long delete(Long id) throws Exception{
        DeviceEntity device = deviceRepo.findById(id).get();
        if(device == null){
            throw new Exception("Устройство не найдено");
        }
        deviceRepo.deleteById(id);
        return id;
    }

}
