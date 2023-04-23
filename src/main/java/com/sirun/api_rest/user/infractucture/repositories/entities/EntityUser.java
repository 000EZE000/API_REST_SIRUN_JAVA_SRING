package com.sirun.api_rest.user.infractucture.repositories.entities;

import com.sirun.api_rest.user.model.Roles;
import com.sirun.api_rest.user.model.User;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@ToString
@Getter
@Setter
@Table(name = "user")
public class EntityUser {

    @Id
    @Column(name = "id")
    private  String id;
    @Column(name = "name")
    private String name;
    @Column(name ="last_name")
    private String lastName;
    @Column(name = "email")
    private String email;
    @Column(name = "password")
    private String password;
    @Column(name = "phone")
    private String photo;
    @Column(name = "rol")
    @Enumerated(EnumType.STRING)
    private Roles  rol;

    public EntityUser(){}

    public EntityUser(User user){
      this.id = user.getId();
      this.name = user.getName();
      this.lastName = user.getLastName();
      this.email = user.getEmail();
      this.password = user.getPassword();
      this.photo = user.getPhoto();
      this.rol = user.getRol();
  }

    public EntityUser(
                      String id,
                      String email,
                      String photo,
                      Roles rol,
                      String name,
                      String lastName,
                      String password
                      ) {
    
      this.id = id;
      this.name = name;
      this.lastName = lastName;
      this.email = email;
      this.password = password;
      this.rol = rol;
      this.photo = photo;
  }

}

