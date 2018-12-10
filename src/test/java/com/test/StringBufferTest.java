package com.test;

import javafx.collections.ObservableMap;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class StringBufferTest {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("aaa").append(22222);
        System.out.println(sb);

        StringBuilder sbu = new StringBuilder();
        sbu.append("aaaa").append(124124).append('a');
        //字符串转基本数据类型
        String a = "aaa";

        //创建线程安全的list集合：
        List<Object> list = Collections.synchronizedList(new ArrayList<Object>());
        CopyOnWriteArrayList cwlist=new CopyOnWriteArrayList();

        //创建线程安全的map集合方式：
        Map<Object, Object> map = Collections.synchronizedMap(new HashMap<Object, Object>());
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        System.out.println(sbu);
    }


}
