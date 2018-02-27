package com.yourcompany.test;

import com.yourcompany.demoplugin01.unit.DemoUnit01;
import info.xiancloud.plugin.message.Xian;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;

/**
 * Created by happyyangyuan at 2018/2/26
 */
public class DemoUnitTest {

    @Test
    public void demoUnitTest() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        System.out.println(Xian.call(DemoUnit01.class, new HashMap<>()).toVoJSONString());
    }
}
