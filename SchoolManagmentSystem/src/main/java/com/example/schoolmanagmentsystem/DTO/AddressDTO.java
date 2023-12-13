package com.example.schoolmanagmentsystem.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AddressDTO {
    private Integer teacher_id;
    private String street;
    private Integer building_number;
    private String area;
}
