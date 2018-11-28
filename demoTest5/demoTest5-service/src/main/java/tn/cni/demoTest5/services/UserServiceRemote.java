package tn.cni.demoTest5.services;

import javax.ejb.Remote;

import tn.cni.demoTest5.entities.User;
import tn.cni.demoTest5.utilities.IGenericDAO;

@Remote
public interface UserServiceRemote extends IGenericDAO<User> {

}
