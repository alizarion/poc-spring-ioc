package io.github.alizarion.poc.impl;

import io.github.alizarion.poc.api.IRobot;

/**
 * @author selim@openlinux.fr
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
