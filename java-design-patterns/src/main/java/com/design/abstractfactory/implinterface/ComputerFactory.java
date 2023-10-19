package com.design.abstractfactory.implinterface;

import com.design.abstractfactory.AbstractFactory;
import com.design.abstractfactory.Computer;
import com.design.abstractfactory.Phone;
import com.design.abstractfactory.impl.ComputerHuaWei;

public class ComputerFactory extends AbstractFactory {

    public Phone createPhone(String brand) {
        return null;
    }

    public Computer createComputer(String brand) {
        if("HuaWei".equals(brand)){
            return new ComputerHuaWei();
        }else if("Apple".equals(brand)){
            return new ComputerHuaWei();
        }else {
            return null;
        }
    }
}
