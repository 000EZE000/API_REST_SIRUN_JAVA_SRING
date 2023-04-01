package com.sirun.api_rest.user.domain;

public interface User {
    void updateUser(UserImp userImp);
    boolean setRole(UserImp superAdmin, UserImp userImp);

}
