
package com.company;

/**
 * Created by dev on 17/10/2015.
 */

public abstract class Player {
    private String name;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    /**
     * Created by dev on 17/10/2015.
     */
    public static class BaseballPlayer extends com.company.Player {
        public BaseballPlayer(String name) {
            super(name);
        }
    }
}
