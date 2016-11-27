package com.zeyi.desinPattem.adapter;

/**
 * Created by yangsen on 2016/11/27.
 */
public class Client {
    public static void main(String agrs[]){
        //普通调用
        Target concreteTarge = new ConcreteTarge();
        concreteTarge.request();
        //适配器调用
        Target adapterTarget  = new Adapter();
        adapterTarget.request();
    }
}
