package org.LiftOff.TheRecipeProject.data;

import org.LiftOff.TheRecipeProject.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {

    User findByUsername(String username);

}