/*
 * Copyright 2021 - 2022 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.acme.jee;

import javax.ejb.*;

/**
 * @author Fabian Krüger
 */
//@Startup
//@Singleton
public class ScheduledBeanImpl {
    public void initialize(TimerService timerService) {
        System.out.println("INITIALIZED....");
        timerService.createTimer(0, 30000, "MyScheduledTimer");
    }
    //@Schedules(@Schedule(month = "*", dayOfMonth = "*", second = "*/3", minute = "*", hour = "*"))
    public void printHello(Timer timer) {
        System.out.println("Hello...");
    }

    public void timeout(Timer timer) {
        System.out.println("Hello...");
    }
}
