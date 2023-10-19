package com.design.factory;

import com.design.factory.impl.HuaWei;
import com.design.factory.impl.Iphone;

public class Factory {

    public Phone createPhone(String phoneNmae){
        if("HuaWei".equals(phoneNmae)){
            return new HuaWei();
        }else if("Apple".equals(phoneNmae)){
            return new Iphone();
        }else {
            return null;
        }
    }

}
