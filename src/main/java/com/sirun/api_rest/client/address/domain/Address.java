package com.sirun.api_rest.client.address.domain;

import com.sirun.api_rest.user.domain.UserImp;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.net.URL;
import java.util.UUID;

@ToString
@Getter
public  class Address {

    private UUID id;
    private String nameAddress;
    private Integer zipCode;
    private String streetName;
    private Integer streetNumber;
    private Integer phone;
    private Integer areaCode;

    public Address(String nameAddress, Integer zipCode, String streetName, Integer streetNumber, Integer phone, Integer areaCode) {
        this.nameAddress = nameAddress;
        this.zipCode = zipCode;
        this.streetName = streetName;
        this.streetNumber = streetNumber;
        this.phone = phone;
        this.areaCode = areaCode;
        id = UUID.randomUUID();
    }

    public  void updateAddress(Address address){
        nameAddress = address.getNameAddress();
        zipCode = address.getZipCode();
        streetName = address.getStreetName();
        streetNumber = address.getStreetNumber();
        phone = address.getPhone();
        areaCode =address.getAreaCode();
    }

}

