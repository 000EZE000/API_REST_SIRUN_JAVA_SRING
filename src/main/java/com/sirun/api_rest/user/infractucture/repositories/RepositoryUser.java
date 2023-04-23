package com.sirun.api_rest.user.infractucture.repositories;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.sirun.api_rest.user.application.IUseCaseUser;
import com.sirun.api_rest.user.infractucture.repositories.entities.EntityUser;
import com.sirun.api_rest.user.infractucture.repositories.parseClass.EntityUserToUser;
import com.sirun.api_rest.user.infractucture.repositories.parseClass.UserToEntityUser;
import com.sirun.api_rest.user.model.User;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;


@Repository
public class RepositoryUser implements IUseCaseUser{

  @PersistenceContext
  private EntityManager entityManager;

  @Override
  @Transactional
  public User createUser(User user) {
    EntityUser entityUser = UserToEntityUser.toEntityUser(user); 
    entityManager.merge(entityUser);  
    return user;
  }


  @Override
  @Transactional
  public User findUserByEmail(String email) {
    String param = "FROM EntityUser WHERE email = :email";
    List<EntityUser> entityUsers = entityManager.
                                    createQuery(param).
                                    setParameter("email",email).
                                    getResultList();

   if(entityUsers.size() == 0) return new User();
    
   return EntityUserToUser.toUser(entityUsers.get(0));
  }

  @Override
  public User updateUser(User user) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'updateUser'");
  }

  @Override
  public void deleteUser(String email) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'deleteUser'");
  }

  
}
