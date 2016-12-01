package com.zeyi.desinPattem.composite;

/**
 * Created by yangsen1 on 2016/12/1.
 */
public abstract class Market {
    protected String name;
    public abstract void add(Market market);
    public abstract void remove(Market market);
    public abstract  void payCard();
}
