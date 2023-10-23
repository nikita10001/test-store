//package uni.project.store.entity;
//
//import jakarta.persistence.*;
//
//import java.util.Set;
//
//@Entity
//public class Brand {
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
//            joinColumns = @JoinColumn(name = "brand_id"),
//            inverseJoinColumns = @JoinColumn(name = "type_id"))
//    private Set<Type> types;
//
//    @OneToMany(mappedBy = "brand")
//    private Set<DeviceEntity> devices;
//
//    // геттеры и сеттеры
//}