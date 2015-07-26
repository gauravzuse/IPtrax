package com.realvjy.util;

import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

/**
 * Parse the JSONUrl and return the JSONObject
 * @author realv_000 on 7/25/2015.
 */
public class JSONParser {
    public static JSONObject parse(String jsonUrl) throws Exception {
        return new JSONObject(parseUrl(jsonUrl));
    }

    private static String parseUrl(String jsonUrl) throws Exception{
        BufferedReader reader = null;
        try {
            URL url = new URL(jsonUrl);
            reader = new BufferedReader(new InputStreamReader(url.openStream()));
            StringBuilder buffer = new StringBuilder();
            int read;
            char[] chars = new char[1024];
            while ((read = reader.read(chars)) != -1)
                buffer.append(chars, 0, read);

            return buffer.toString();
        } finally {
            if (reader != null)
                reader.close();
        }
    }
}
