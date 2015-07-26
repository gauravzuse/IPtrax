package com.realvjy.util;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author realv_000 on 7/25/2015.
 */
public class DomainToIP {
    public static String convert(String domain){
        try {
            InetAddress address = InetAddress.getByName(domain);
            return address.getHostAddress();
        } catch (UnknownHostException e) {
            return "Unknown";
        }
    }
}
