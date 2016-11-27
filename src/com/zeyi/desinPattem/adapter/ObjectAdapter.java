package com.zeyi.desinPattem.adapter;

/**
 * Created by yangsen on 2016/11/27.
 */
public class ObjectAdapter implements Target {

    Adaptee adaptee = new Adaptee() ;
    @Override
    public void request() {
        adaptee.specificRequest();
    }

}
