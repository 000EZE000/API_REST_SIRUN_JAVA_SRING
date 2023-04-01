package com.sirun.api_rest.client.domain;

import com.sirun.api_rest.client.address.domain.Address;

import com.sirun.api_rest.user.domain.UserImp;

import lombok.Getter;
import lombok.Setter;


import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;


public  class Client extends UserImp  {
    @Getter
    private UUID id;
    @Getter @Setter
    private boolean status;
    @Getter
    private Boolean confirmationEmail;
    @Getter
    private List<Address> addresses;

    protected Client(String name, String lastName, int phone, String email, String password, URL photo) {
        super(name, lastName, email, password, photo);
        status =true;
        confirmationEmail= false;
        id = UUID.randomUUID();
        addresses = new ArrayList<>();
    }

    public void addAddress(Address address){
        addresses.add(address);
    }

    public void removeByIdAddress(UUID uuid){
        addresses = addresses.stream()
                .filter(address -> address.getId()
                        .equals(uuid)).collect(Collectors.toList());
    }

//    public void setConfirmationEmail(boolean status){
//        if(confirmationEmail.equals(true)) return;
//        confirmationEmail = status;
//    }


}
