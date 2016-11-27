package com.zeyi.desinPattem.adapter;

/**
 * Created by yangsen on 2016/11/27.
 */
public class ConcreteTarge implements Target {
    @Override
    public void request() {
        System.out.println("普通类 实现普通方法");
    }
}
