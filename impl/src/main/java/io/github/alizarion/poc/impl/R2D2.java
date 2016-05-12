package io.github.alizarion.poc.impl;

import io.github.alizarion.poc.api.IRobot;

/**
 * selim@openlinux.fr
 */
public class R2D2 implements IRobot {
    @Override
    public String present() {
        return "bip blop bip blaoup !";
    }

    @Override
    public String issueMessage() {
        return "bip blop bip blaoup ! \n" +
                "    ,_~\"\"\"~-,   Jussi Hannula\n" +
                "  .'(_)------`,\n" +
                "  |===========|\n" +
                "  `,---------,'\n" +
                "    ~-.___.-~   Death Star (2)";
    }

    @Override
    public String fire() {
        return "bzzzzzz";
    }
}
