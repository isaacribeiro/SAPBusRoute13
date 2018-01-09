package self.study.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import self.study.dao.UserRepository;
import self.study.pojo.User;

@RestController
@RequestMapping("/api/user")
public class UserController {

	@Autowired
	UserRepository repository;
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String basicGet() {
		return "Hello World!";
	}
	
	@RequestMapping(value="/find/{id}", method=RequestMethod.GET)
	Optional<User> getById(@PathVariable("id") Long id) {
		return repository.findById(id);
	}
	
	@RequestMapping(value="/", method=RequestMethod.POST)
	public User update(@RequestBody User user) {
		return repository.save(user);
	}
	
	
}
