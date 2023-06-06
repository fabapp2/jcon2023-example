package com.acme.jee;

import javax.ejb.EJBLocalHome;

public interface LocalHelloHomeInterface extends EJBLocalHome {
	HelloComponentInterface create();
}