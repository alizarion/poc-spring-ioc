package io.github.alizarion.poc.impl;

import io.github.alizarion.poc.api.IRobot;

/**
 * Created by sbn on 09/05/2016.
 */
public class Terminator implements IRobot {
    @Override
    public String present() {
        return "Sarah Connor?";
    }

    @Override
    public String issueMessage() {
        return "Asta la vista baby !";
    }

    @Override
    public String fire() {
        return "bouuuuum!";
    }
}
