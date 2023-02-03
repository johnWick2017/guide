package com.yatchigz.collection.hashmap;

import java.util.HashMap;
import java.util.Map;

/**
 * Create on 2023-01-31
 * Copyright (c) 2023 by XueBang Information Technology Co.Ltd.
 * All Rights Reserved, Designed By XueBangSoft
 * Copyright:  Copyright(C) 2014-2023
 * Company:    XueBang Information Technology Co.Ltd.
 *
 * @author y
 */
public class Test {

    public static void main(String[] args) {
        Map<String, String> testMap = new HashMap<>();
        testMap.put("1", "hello");
        testMap.put("2", "hey");
        testMap.put("3", "hey");
        System.out.println(testMap.get("2"));
    }
}
