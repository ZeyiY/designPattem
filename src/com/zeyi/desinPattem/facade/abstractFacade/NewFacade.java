package com.zeyi.desinPattem.facade.abstractFacade;

/**
 * Created by yangsen1 on 2016/11/30.
 */
public class NewFacade extends AbstractFacade{
    private SubSystemA obj1 = new SubSystemA();
    private SubSystemNewB obj2 = new SubSystemNewB();
    private SubSystemC obj3 = new SubSystemC();

    @Override
    public void method() {
        obj1.methodA();
        obj2.methodB();
        obj3.methodC();
    }
}
