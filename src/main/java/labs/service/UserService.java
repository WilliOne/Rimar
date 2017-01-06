package labs.service;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import labs.models.User;
import labs.repositories.UserRepository;

@Service
public class UserService {
  @Autowired
  private UserRepository usersRepo;

  @Transactional
  @PostConstruct
	public void createAdminUser() {		
		User userAdmin=usersRepo.findByMail("admin");
		if(userAdmin==null){
			register("admin","admin", "admin@mail.com", "admin");
		}
	}
    
  public void register(String name, String famil, String mail, String pass) {
    String passHash = new BCryptPasswordEncoder().encode(pass);
    User u = new User(name,famil, mail.toLowerCase(), passHash);
    usersRepo.save(u);
  }

}
