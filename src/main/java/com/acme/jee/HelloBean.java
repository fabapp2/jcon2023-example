package com.acme.jee;

import javax.ejb.*;

public class HelloBean implements SessionBean {

    /* ----------------------------------------
    * Begin business methods. The following methods
    * are called by the client code.
    * -------------------------------------- */

    public String sayHello(String myName) throws EJBException {
        return ("Hello " + myName);
    }

    /* ----------------------------------------
    * Begin private methods. The following methods
    * are used internally
    * -------------------------------------- */

    /* ------------------------------------------------------
    * Begin EJB-required methods. The following methods are called
    * by the container, and never called by client code
    * ------------------------------------------------------- */

    public void ejbCreate() throws CreateException {
        // when bean is created
    }

    public void setSessionContext(SessionContext ctx) {
    }

// Life Cycle Methods

    public void ejbActivate() {
    }

    public void ejbPassivate() {
    }

    public void ejbRemove() {
    }
}