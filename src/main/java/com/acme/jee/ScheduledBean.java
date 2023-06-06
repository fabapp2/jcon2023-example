package com.acme.jee;

import javax.ejb.*;

/**
 * @author Fabian Krüger
 */
public interface ScheduledBean {
    @Schedules(@Schedule(second = "3", persistent = false))
    @Lock(LockType.READ)
    void printHello(Timer timer);
}
