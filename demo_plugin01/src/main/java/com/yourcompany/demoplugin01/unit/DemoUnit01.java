package com.yourcompany.demoplugin01.unit;

import com.alibaba.fastjson.JSONObject;
import com.yourcompany.demoplugin01.DemoPlugin01Group;
import info.xiancloud.plugin.Group;
import info.xiancloud.plugin.Input;
import info.xiancloud.plugin.Unit;
import info.xiancloud.plugin.message.UnitRequest;
import info.xiancloud.plugin.message.UnitResponse;
import info.xiancloud.plugin.message.Xian;

/**
 * Created by happyyangyuan at 2018/2/26
 */
public class DemoUnit01 implements Unit {
    @Override
    public String getName() {
        return "demoUnit01";
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
        return Xian.call("demoGroup02", "demoUnit02",
                new JSONObject().fluentPut("param", msg.get("param", "a temp param if not absent.")));
    }
}
