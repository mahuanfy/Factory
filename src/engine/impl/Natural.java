package engine.impl;

import engine.Engine;

/**
 * 自然吸气发动机
 */
public class Natural implements Engine {

    @Override
    public void manufacture() {
        System.out.println("自然吸气发动机");
    }
}
