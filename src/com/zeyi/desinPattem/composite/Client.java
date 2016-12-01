package com.zeyi.desinPattem.composite;

/**
 * Created by yangsen1 on 2016/12/1.
 */
public class Client {
    public static void main(String args[]){
        MarketBranch zMarketBranch = new MarketBranch("总部");
        MarketBranch sMarketBranch = new MarketBranch("省级分部");
        MarketBranch xMarketBranch = new MarketBranch("县级分部");
        MarketJoin marketBranchOne = new MarketJoin("加盟一店");
        MarketJoin marketBranchTwo = new MarketJoin("加盟二店");
        zMarketBranch.add(sMarketBranch);
        sMarketBranch.add(xMarketBranch);
        xMarketBranch.add(marketBranchOne);
        xMarketBranch.add(marketBranchTwo);
        zMarketBranch.payCard();
    }
}
