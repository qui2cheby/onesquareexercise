package org.unosquare.vo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "customer")
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "customer_name")
    @JsonProperty
    private String customerName;
    @Column(name = "ssn")
    @JsonProperty
    private String ssn;
    @Column(name = "date_of_birth")
    @JsonProperty
    private LocalDateTime dateOfBirth;

}
