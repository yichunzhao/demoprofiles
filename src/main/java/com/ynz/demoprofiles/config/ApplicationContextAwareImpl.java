package com.ynz.demoprofiles.config;

import com.ynz.demoprofiles.service.Greeting;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * ApplicationContextAware is an extension point, as a bean entering use phase of its life cycle. At this point,
 * implementing this aware interface, allows the bean get an insight into the application context.
 */

@Component
@Slf4j
public class ApplicationContextAwareImpl implements ApplicationContextAware {

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        log.info("Implementing application context aware ...");

        Greeting greeting = applicationContext.getBean(Greeting.class);

        //actually I may change bean property (this is read for usage) from here.
        //For Greeting beans, its property i.e. greeting has been populated at the phase of Post process of Bean
        // definition from the property resource. This phase is much earlier happened before the Use phase.
        greeting.setGreeting("I modified the greeting content.");
    }
}
