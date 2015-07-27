package com.realvjy.model;

import com.realvjy.util.JSONParser;
import org.json.JSONObject;

/**
 * @author realv_000 on 7/25/2015.
 */
public class IPtraxModel {
    IPinfoModel iPinfoModel = new IPinfoModel();

    public IPtraxModel() {
    }

    public IPtraxModel(String ip) {
        iPinfoModel.setiP(ip);
    }

    public IPinfoModel getiPinfoModel() {
        return iPinfoModel;
    }

    public void setIpToInfoModel(String ip){
        iPinfoModel.setiP(ip);
    }

    public void setInfo() {
        String jUrl = "http://ip-api.com/json/"+iPinfoModel.getiP();
        JSONObject jsonObject = null;
        try {
            jsonObject = JSONParser.parse(jUrl);
            String status = jsonObject.getString("status");
            iPinfoModel.setStatus(status);
            if (status.equals("success")) {
                iPinfoModel.setStatus(jsonObject.get("status").toString());
                iPinfoModel.setCountry(jsonObject.get("country").toString());
                iPinfoModel.setCountryCode(jsonObject.get("countryCode").toString());
                iPinfoModel.setRegion(jsonObject.get("region").toString());
                iPinfoModel.setRegionName(jsonObject.get("regionName").toString());
                iPinfoModel.setCity(jsonObject.get("city").toString());
                iPinfoModel.setZipCode(jsonObject.get("zip").toString());
                iPinfoModel.setLatitude(jsonObject.get("lat").toString());
                iPinfoModel.setLongitude(jsonObject.get("lon").toString());
                iPinfoModel.setTimeZone(jsonObject.get("timezone").toString());
                iPinfoModel.setIsp(jsonObject.get("isp").toString());
                iPinfoModel.setOrganization(jsonObject.get("org").toString());
                iPinfoModel.setAsNameNo(jsonObject.get("as").toString());
            } else {;
                iPinfoModel.setMsg(jsonObject.get("message").toString());
            }
        } catch (Exception ignored) {}
    }
}
