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
    public Set<IRobot> getArmy() {
        Set<IRobot> iRobots = new HashSet<IRobot>();
        iRobots.add(new Terminator());
        iRobots.add(new R2D2());
        return iRobots;
    }
}
