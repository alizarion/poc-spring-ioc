package io.github.alizarion.poc.impl;

import io.github.alizarion.poc.api.IArmy;
import io.github.alizarion.poc.api.IRobot;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by sbn on 10/05/2016.
 */
public class ArmyImpl implements IArmy {


    @Override
    public Set<Class<? extends IRobot>> getArmy() {
        Set<Class<? extends IRobot>>  iRobots = new HashSet<Class<? extends IRobot>>();
        iRobots.add(Terminator.class);
        iRobots.add(R2D2.class);
        return iRobots;
    }
}
