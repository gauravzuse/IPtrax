package com.realvjy.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Validate the IP given by user
 * @author realv_000 on 7/25/2015.
 */
public class IPcheck {
    private static final String IPADDRESS_PATTERN = "^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
                                                    "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
                                                    "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
                                                    "([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";
    private String ipString;

    public IPcheck(String ipString) {
        this.ipString = ipString;
    }

    public String getIpString() {
        return ipString;
    }

    public void setIpString(String ipString) {
        this.ipString = ipString;
    }

    public String validate(){
        Pattern pattern = Pattern.compile(IPADDRESS_PATTERN);
        Matcher matcher = pattern.matcher(getIpString());
        if (matcher.find()) {
            return matcher.group();
        } else {
            return "0.0.0.0";
        }
    }
}
