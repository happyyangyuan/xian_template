package com.yourcompany.demoplugin01;

import info.xiancloud.plugin.Group;

/**
 * Created by happyyangyuan at 2018/2/26
 */
public class DemoPlugin01Group implements Group {
    public static final DemoPlugin01Group singleton = new DemoPlugin01Group();

    @Override
    public String getName() {
        return "demoPlugin";
    }
}
