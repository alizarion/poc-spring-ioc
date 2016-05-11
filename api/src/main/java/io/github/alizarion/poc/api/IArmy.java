package io.github.alizarion.poc.api;

import java.util.Set;

/**
 * Created by sbn on 10/05/2016.
 */
public interface IArmy {

    public Set<Class<? extends IRobot>> getArmy();
}
