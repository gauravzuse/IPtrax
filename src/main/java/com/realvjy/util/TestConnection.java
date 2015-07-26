package com.realvjy.util;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

/**
 * This class is responsible for test the internet connection
 * @author realv_000 on 7/25/2015.
 */
public class TestConnection {
    /**
     * testInet method get domain/url and check reachable or not
     * @param site domain
     * @return the boolean value
     */
    public static boolean testInet(String site) {
        Socket sock = new Socket();
        InetSocketAddress addr = new InetSocketAddress(site,80);
        try {
            sock.connect(addr,3000);
            return true;
        } catch (IOException e) {
            return false;
        } finally {
            try {sock.close();}
            catch (IOException ignored) {}
        }
    }

    /**
     * This is initial task performed to checked the internet connection by calling the testInet
     * with more than three
     * @return Connection status
     */
    public static String isOnline() {
        if (testInet("facebook.com") || testInet("google.com") || testInet("amazon.com")){
            if (testInet("api.ipify.org")) {
                try {
                    return JSONParser.parse("https://api.ipify.org/?format=json").get("ip").toString();
                } catch (Exception e) {
                    return "Invalid Data format";
                }
            } else {
                return "api error!! check api.ipify.org live or not";
            }
        } else {
            return "Internet Connection Lost!";
        }
    }
}
