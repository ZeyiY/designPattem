package com.zeyi.desinPattem.facade.basicFacade;

/**
 * Created by yangsen1 on 2016/11/29.
 * 外观类 统一给客户端提供接口，并配置子系统的调用
 */
public class Facade {

    private SubSystemA obj1 = new SubSystemA();
    private SubSystemB obj2 = new SubSystemB();
    private SubSystemC obj3 = new SubSystemC();
    public void method(){
        obj1.methodA();
        obj2.methodB();
        obj3.methodC();
    }
}
