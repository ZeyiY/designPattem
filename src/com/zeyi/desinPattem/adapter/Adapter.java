package com.zeyi.desinPattem.adapter;

/**
 * Created by yangsen on 2016/11/27.
 */
public class Adapter extends Adaptee implements Target{


    @Override
    public void request() {
        super.specificRequest();
    }
}
