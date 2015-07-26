package com.realvjy.util;

/**
 * Retrieve the domain name
 * @author realv_000 on 7/25/2015.
 */
public class DomainValidate {
    public static String validate(String domain){
        return domain.replaceAll("(https|http).(:*).(\\\\*)","");
    }
}
