package com.zeyi.desinPattem.composite;

/**
 * Created by yangsen1 on 2016/12/1.
 */
public class MarketJoin extends Market{

    public MarketJoin(String name){
        this.name = name;
    }

    @Override
    public void add(Market market) {

    }

    @Override
    public void remove(Market market) {

    }

    @Override
    public void payCard() {
        System.out.println("理发卡在"+name+"消费了");
    }
}
