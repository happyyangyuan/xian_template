package com.yourcompany.test;

import info.xiancloud.core.Unit;
import info.xiancloud.core.distribution.exception.UnitOfflineException;
import info.xiancloud.core.distribution.exception.UnitUndefinedException;
import info.xiancloud.core.distribution.loadbalance.UnitRouter;
import info.xiancloud.core.message.Xian;
import org.junit.Test;

import java.util.HashMap;

/**
 * Created by happyyangyuan at 2018/2/26
 */
public class DemoUnitTest {


    private static Unit demoUnit01;

    static {
        try {
            demoUnit01 = UnitRouter.singleton.firstInstance(Unit.fullName("demoGroup01","demoUnit01")).getPayload();
        } catch (UnitUndefinedException | UnitOfflineException e) {
            demoUnit01 = null;
        }
    }

    @Test
    public void demoUnitTest() {
        System.out.println(Xian.call(demoUnit01, new HashMap<>()).toVoJSONString());
    }
}