package io.github.alizarion.poc.api.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by sbn on 09/05/2016.
 */
public class Main {

    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Mission mission = (Mission) context.getBean("mission");
        mission.killThemAll();
    }
}
