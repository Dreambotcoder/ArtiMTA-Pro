package org.dreambot.articron.behaviour.telekinetic;

import org.dreambot.articron.fw.nodes.NodeGroup;

import java.util.function.BooleanSupplier;

/**
 * Author: Articron
 * Date:   17/10/2017.
 */
public class MazeGroup extends NodeGroup {

    public MazeGroup(String name, BooleanSupplier boolSupplier) {
        super(name, boolSupplier);
    }

    @Override
    public String getStatus() {
        return "Calculating maze";
    }

    @Override
    public int priority() {
        return 0;
    }
}