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

    public void killThemAll(){
      for(IRobot iRobot : iArmy.getArmy()){
          System.out.println(iRobot.present());
          System.out.println(iRobot.issueMessage());
          System.out.println(iRobot.fire());
      }

    }
}
