package org.unosquare.vo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Product")
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    @JsonProperty
    private Long id;
    @Column(name = "amount")
    @JsonProperty
    private Double amount;
    @Column(name = "sku")
    @JsonProperty
    private String sky;
    @Column(name = "quantity")
    @JsonProperty
    private Integer quantity;

    @ManyToOne
    @JoinColumn(name = "productsId", referencedColumnName = "id")
    private Order order;

}
