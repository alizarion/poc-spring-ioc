package io.github.alizarion.poc.api.app;

import io.github.alizarion.poc.api.IRobot;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ServiceLoader;

/**
 * @author selim@openlinux.fr
 */
public class Mission {

    private ServiceLoader<IRobot> armyLoader;

    public Mission() {

//        try {
//            URLClassLoader urlClassLoader =
//                    new URLClassLoader(new URL[]{ new URL("file:///C:/lib/poc-spring-ioc-impl2-1.0.0-SNAPSHOT.jar")});
//            armyLoader = ServiceLoader.load(IRobot.class,urlClassLoader);
//        } catch (MalformedURLException e) {
//           throw new RuntimeException("EEEERRRROOR");
//        }
        armyLoader = ServiceLoader.load(IRobot.class);


    }



    public void killThemAll() throws IllegalAccessException, InstantiationException {
        armyLoader.reload();
        for (IRobot iRobot : armyLoader) {
            System.out.println(iRobot.present());
            System.out.println(iRobot.issueMessage());
            System.out.println(iRobot.fire());

        }

    }
}
