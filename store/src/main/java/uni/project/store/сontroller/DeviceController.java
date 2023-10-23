package uni.project.store.сontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uni.project.store.entity.DeviceEntity;
import uni.project.store.service.DeviceService;

@CrossOrigin(origins = {"http://localhost:3000"})
@RestController
@RequestMapping("/devices")
public class DeviceController {

    @Autowired
    private DeviceService deviceService;


    @GetMapping
    public ResponseEntity getAllDevices(){
        try {
            return ResponseEntity.ok(deviceService.getAll());
        }catch (Exception e){
            return ResponseEntity.badRequest().body("Произошла ошибка");
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity getSingleDevice(@PathVariable Long id){
        try{
            return ResponseEntity.ok(deviceService.getSingle(id));
        }catch(Exception e){
            return ResponseEntity.badRequest().body("Произошла ошибка");
        }
    }
    @PostMapping
    public ResponseEntity createDevice(@RequestBody DeviceEntity device){
        try{
            deviceService.createDevice(device);
            return ResponseEntity.ok("Успешно сохранено");
        }catch (Exception e){
            return ResponseEntity.badRequest().body("Произошла ошибка");
        }
    }

    @DeleteMapping("/{id}") // принимаем часть строки запроса
    public ResponseEntity deleteDevice(@PathVariable Long id){
        try {
            return ResponseEntity.ok(deviceService.delete(id));
        } catch (Exception e){
            return ResponseEntity.badRequest().body("Произошла ошибка");
        }
    }

}
