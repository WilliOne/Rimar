package labs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import labs.service.UserService;

@Controller
public class UserController {
	
	  @Autowired
	  private UserService usersService;
	  
	  @RequestMapping(value = "/registration", method = RequestMethod.POST)
		  public String register(@RequestParam("name") String name,
				  @RequestParam("famil") String famil,
		      @RequestParam("mail") String mail, 
		      @RequestParam("pass") String pass) { 
		    usersService.register(name,famil, mail,pass);
		    return "redirect: home";
	  }
	  
}