package labs.repositories;


import org.springframework.data.repository.CrudRepository;

import labs.models.User;

public interface UserRepository extends CrudRepository<User, Long>{
	User findByMail(String mail);

}
