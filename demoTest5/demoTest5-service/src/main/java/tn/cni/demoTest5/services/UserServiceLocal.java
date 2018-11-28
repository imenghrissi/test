package tn.cni.demoTest5.services;

import javax.ejb.Local;

import tn.cni.demoTest5.entities.User;
import tn.cni.demoTest5.utilities.IGenericDAO;

@Local
public interface UserServiceLocal extends IGenericDAO<User> {

	User login(String login, String password);

}
