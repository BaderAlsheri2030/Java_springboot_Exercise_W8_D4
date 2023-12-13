package com.example.schoolmanagmentsystem.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Data
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Address {

    @Id
    private Integer id;
    @NotNull(message = "area cannot be null")
    @Column(columnDefinition = "varchar(30) not null")
    private String area;
    @NotNull(message = "street cannot be null")
    @Column(columnDefinition = "varchar(30) not null")
    private String street;
    @NotNull(message = "building Number cannot be null")
    @Column(columnDefinition = "int not null")
    private Integer buildingNumber;



    @OneToOne
    @MapsId
    @JsonIgnore
    private Teacher teacher;

}