package io.github.alizarion.poc.api.app;

import io.github.alizarion.poc.api.IRobot;

import java.util.ServiceLoader;

/**
 * @author selim@openlinux.fr
 */
public class Mission {

    private ServiceLoader<IRobot> armyLoader = ServiceLoader.load(IRobot.class);

    public void killThemAll() throws IllegalAccessException, InstantiationException {
        armyLoader.reload();
        for (IRobot iRobot : armyLoader) {
            System.out.println(iRobot.present());
            System.out.println(iRobot.issueMessage());
            System.out.println(iRobot.fire());

        }

    }
}
