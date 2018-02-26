package com.yourcompany.demoplugin02.unit;

import com.yourcompany.demoplugin02.DemoGroup02;
import info.xiancloud.plugin.Group;
import info.xiancloud.plugin.Input;
import info.xiancloud.plugin.Unit;
import info.xiancloud.plugin.message.UnitRequest;
import info.xiancloud.plugin.message.UnitResponse;

/**
 * Created by happyyangyuan at 2018/2/26
 */
public class DemoUnit02 implements Unit {
    @Override
    public String getName() {
        return "demoUnit02";
    }

    @Override
    public Input getInput() {
        return Input.create().add("param", String.class, "必填参数", REQUIRED);
    }

    @Override
    public Group getGroup() {
        return DemoGroup02.singleton;
    }

    @Override
    public UnitResponse execute(UnitRequest msg) {
        return UnitResponse.success(msg.get("param"));
    }
}
