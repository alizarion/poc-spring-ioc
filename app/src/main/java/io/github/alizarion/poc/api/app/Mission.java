package io.github.alizarion.poc.api.app;

import io.github.alizarion.poc.api.IArmy;
import io.github.alizarion.poc.api.IRobot;

/**
 * Created by sbn on 09/05/2016.
 */
public class Mission {

    private IArmy iArmy;

    public IArmy getiArmy() {
        return iArmy;
    }

    public void setiArmy(IArmy iArmy) {
        this.iArmy = iArmy;
    }

    public void killThemAll() throws IllegalAccessException, InstantiationException {
      for(Class<? extends IRobot>  aClass: iArmy.getArmy()){
          IRobot robot  = aClass.newInstance();
          System.out.println(robot.present());
          System.out.println(robot.issueMessage());
          System.out.println(robot.fire());
      }

    }
}
