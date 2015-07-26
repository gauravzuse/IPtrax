package com.realvjy.main;

import com.realvjy.gui.IPtraxFrame;
import com.realvjy.model.IPtraxModel;
import com.realvjy.util.DomainToIP;
import com.realvjy.util.DomainValidate;
import com.realvjy.util.IPcheck;
import com.realvjy.util.TestConnection;

/**
 * @author realv_000 on 7/25/2015.
 */
public class App {
    public static void main(String[] args) {
        System.out.println("-------------------IPtrax 0.0.1 beta---------------");
        IPcheck iPcheck = new IPcheck("255.255.255.988");
        System.out.println(iPcheck.validate());
        String dom = "http:\\\\google.com";
        System.out.println(DomainToIP.convert(DomainValidate.validate(dom)));
        System.out.println(DomainToIP.convert("google.com"));
        System.out.println(TestConnection.isOnline());
        IPtraxModel model = new IPtraxModel();
        model.getiPinfoModel().setiP("216.58.220.14");
        IPtraxModel iPtraxModel = new IPtraxModel("43.251.95.169");
        iPtraxModel.setInfo();
        System.out.println(iPtraxModel.getiPinfoModel().getCountry());

        IPtraxFrame iPtraxFrame = new IPtraxFrame();
        iPtraxFrame.showIt("IPtrax 0.0.1");
        System.out.println(iPtraxFrame.getSize());
    }
}
