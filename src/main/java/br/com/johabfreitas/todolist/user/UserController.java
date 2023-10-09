package br.com.johabfreitas.todolist.user;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@PostMapping("/")
	public void create(@RequestBody UserModel userModel) {
		UserModel userModel1 = new UserModel();
		System.out.println(userModel1.getName());
	}

}
