package com.acme.jee;

import javax.ejb.EJBHome;
import javax.ejb.EJBLocalHome;
import javax.ejb.RemoveException;

public interface HelloHomeInterface extends EJBHome, EJBLocalHome {


	void remove() throws RemoveException;

	HelloComponentInterface create();
}