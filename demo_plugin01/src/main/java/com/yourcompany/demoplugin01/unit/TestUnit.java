package com.yourcompany.demoplugin01.unit;

import com.yourcompany.demoplugin01.DemoPlugin01Group;
import info.xiancloud.plugin.Group;
import info.xiancloud.plugin.Input;
import info.xiancloud.plugin.Unit;
import info.xiancloud.plugin.message.UnitRequest;
import info.xiancloud.plugin.message.UnitResponse;

/**
 * Created by happyyangyuan at 2018/2/26
 */
public class TestUnit implements Unit {
    @Override
    public String getName() {
        return "test";
    }

    @Override
    public Input getInput() {
        return null;
    }

    @Override
    public Group getGroup() {
        return DemoPlugin01Group.singleton;
    }

    @Override
    public UnitResponse execute(UnitRequest msg) {
        return UnitResponse.success("hello world.");
    }
}
