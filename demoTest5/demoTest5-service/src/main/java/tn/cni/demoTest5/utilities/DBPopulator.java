package tn.cni.demoTest5.utilities;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Singleton;
import javax.ejb.Startup;

import tn.cni.demoTest5.entities.User;
import tn.cni.demoTest5.services.UserServiceLocal;

@Singleton
@Startup
public class DBPopulator {
	@EJB
	private UserServiceLocal userServiceLocal;

	public DBPopulator() {
	}

	@PostConstruct
	public void init() {
		User user = new User("user", "u", "u", "user@bitbox.tn");

		userServiceLocal.update(user);
	}
}
