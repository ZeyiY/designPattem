package com.zeyi.desinPattem.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yangsen1 on 2016/12/1.
 */
public class MarketBranch extends  Market {
    List<Market> marketList = new ArrayList<Market>();
    public MarketBranch(String name){
        this.name = name;
    }

    @Override
    public void add(Market market) {
        marketList.add(market);
    }

    @Override
    public void remove(Market market) {
        marketList.remove(market);
    }

    @Override
    public void payCard() {
        System.out.println("理发卡在" + name + "消费了");
        for (Market market:marketList){
            market.payCard();
        }
    }
}
