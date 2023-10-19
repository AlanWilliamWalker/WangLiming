package com.design.abstractfactory.implinterface;

import com.design.abstractfactory.AbstractFactory;
import com.design.abstractfactory.Computer;
import com.design.abstractfactory.Phone;
import com.design.abstractfactory.impl.PhoneApple;
import com.design.abstractfactory.impl.PhoneHuaWei;

public class PhoneFactory extends AbstractFactory {
    public Phone createPhone(String brand) {
        if("HuaWei".equals(brand)){
            return new PhoneHuaWei();
        }else if("Apple".equals(brand)){
            return new PhoneApple();
        }else {
            return null;
        }
    }

    public Computer createComputer(String brand) {
        return null;
    }
}
