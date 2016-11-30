package com.zeyi.desinPattem.facade.abstractFacade;



/**
 * Created by yangsen1 on 2016/11/30.
 */
public class Facade extends AbstractFacade{

    private SubSystemA obj1 = new SubSystemA();
    private SubSystemB obj2 = new SubSystemB();
    private SubSystemC obj3 = new SubSystemC();

    @Override
    public void method() {
        obj1.methodA();
        obj2.methodB();
        obj3.methodC();
    }
}
