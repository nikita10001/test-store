//package uni.project.store.entity;
//
//import jakarta.persistence.*;
//
//@Entity
//public class DeviceInfo {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Integer id;
//
//    @Column(nullable = false)
//    private String title;
//
//    @Column(nullable = false)
//    private String description;
//
//    @ManyToOne
//    @JoinColumn(name = "device_id")
//    private DeviceEntity device;
//
//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }
//
//    public String getDescription() {
//        return description;
//    }
//
//    public void setDescription(String description) {
//        this.description = description;
//    }
//
//    public DeviceEntity getDevice() {
//        return device;
//    }
//
//    public void setDevice(DeviceEntity device) {
//        this.device = device;
//    }
//}
