package com.example.backendcrud;

import com.example.backendcrud.model.entity.User;
import com.example.backendcrud.model.services.IUserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BackendCrudApplication {

	@Autowired
	private IUserServices iUserServices;

	public static void main(String[] args) {
		SpringApplication.run(BackendCrudApplication.class, args);
	}


	private void LoadUser() {
		User user = new User();

		user.setBusinessId("485984590348");
		user.setSharedKey("Hamilton");
		user.setEmail("hamilton@gmail.com");
		user.setPhone("8459811");

		iUserServices.save(user);
	}

}
