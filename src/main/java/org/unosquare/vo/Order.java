package org.unosquare.vo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "orders")
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "storeId")
    @JsonProperty
    private Long storeId;
    @OneToOne(cascade = CascadeType.ALL, fetch= FetchType.EAGER)
    @JoinColumn(name = "customerId", referencedColumnName = "id")
    @JsonProperty
    private Customer customerId;
    @Column(name = "orderDate")
    @JsonProperty
    private LocalDateTime orderDate;
    @Column(name = "orderTime")
    @JsonProperty
    private LocalDateTime orderTime;
    @Column(name = "notes")
    @JsonProperty
    private String notes;
    @Column(name = "amount")
    @OneToMany(cascade = CascadeType.ALL, mappedBy="order")
    @JsonProperty
    private List<Product> productsId;
}
