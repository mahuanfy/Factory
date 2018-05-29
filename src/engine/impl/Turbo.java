package engine.impl;

import engine.Engine;

/**
 * 涡轮增压发动机
 */
public class Turbo implements Engine {
    @Override
    public void manufacture() {
        System.out.println("涡轮增压的发动机");
    }
}
