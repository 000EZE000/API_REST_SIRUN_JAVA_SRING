package com.sirun.api_rest.user.domain;

import lombok.*;

import java.net.URL;

@ToString @EqualsAndHashCode
public class UserImp implements User {
    @Setter @Getter
    protected String name;
    @Setter @Getter
    protected String lastName;
    @Setter @Getter
    protected String email;
    @Setter @Getter
    protected String password;
    @Setter @Getter
    protected URL photo;
    @Getter
    private Roles role = Roles.client;

    public void updateUser(UserImp user){
        name = user.getName();
        lastName = user.getLastName();
        email = user.getEmail();
        password = user.getPassword();
        photo = user.getPhoto();

    }

     protected UserImp(String name, String lastName, String email, String password, URL photo) {
       this. name = name;
       this.lastName = lastName;
       this.email = email;
       this.password = password;
       this.photo = photo;
    }

    public boolean setRole(UserImp userwithRoleSuperAdmin,  UserImp userCandidate){
        if(userwithRoleSuperAdmin.role == Roles.super_admin) {
            userCandidate.role = userCandidate.role == Roles.client ? Roles.admin : Roles.client;
            return true;
        }
        return false;
    }
}
