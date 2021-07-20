package com.mohsindk786.dto;

import lombok.Data;

@Data
public class AddressDto {
    private Long id;
    private String city;
    private String street;
    private String zipCode;
}
