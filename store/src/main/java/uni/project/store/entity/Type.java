//package uni.project.store.entity;
//
//import jakarta.persistence.*;
//
//import java.util.Set;
//
//@Entity
//public class Type {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Integer id;
//
//    @Column(unique = true, nullable = false)
//    private String name;
//
//    @ManyToMany
//    @JoinTable(name = "type_brand",
//            joinColumns = @JoinColumn(name = "type_id"),
//            inverseJoinColumns = @JoinColumn(name = "brand_id"))
//    private Set<Brand> brands;
//
//    @OneToMany(mappedBy = "type")
//    private Set<DeviceEntity> devices;
//
//    // геттеры и сеттеры
//}