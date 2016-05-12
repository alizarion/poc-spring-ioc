package io.github.alizarion.poc.impl;

import io.github.alizarion.poc.api.IRobot;

/**
 * @author selim@openlinux.fr
 */
public class BB8 implements IRobot {
    @Override
    public String present() {
        return "Hi i'm BB8";
    }

    @Override
    public String issueMessage() {
        return "this movies sucks";
    }

    @Override
    public String fire() {
        return "\n" +
                "             \\|/\n" +
                "            .-*-         \n" +
                "           / /|\\         \n" +
                "          _L_            \n" +
                "        ,\"   \".          \n" +
                "    (\\ /  O O  \\ /)      \n" +
                "     \\|    _    |/       \n" +
                "       \\  (_)  /         \n" +
                "       _/.___,\\_         \n" +
                "      (_/ alf \\_)   ";
    }
}
