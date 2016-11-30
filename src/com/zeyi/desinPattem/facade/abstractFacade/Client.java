package com.zeyi.desinPattem.facade.abstractFacade;



/**
 * Created by yangsen1 on 2016/11/29.
 */
public class Client {
    public static void main(String agrs[]){
        //老流程
        AbstractFacade abstractFacade = new Facade();
        abstractFacade.method();

        //修改新流程
        AbstractFacade abstractFacadeNew = new NewFacade();
        abstractFacadeNew.method();
    }
}
