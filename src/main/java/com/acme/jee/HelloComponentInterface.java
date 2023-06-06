package com.acme.jee;

import javax.ejb.EJBException;

/**
 * @author Fabian Krüger
 */
public interface HelloComponentInterface extends javax.ejb.EJBLocalObject {
    public String sayHello(String myName) throws EJBException;
}
