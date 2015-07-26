package com.realvjy.model;

/**
 * IpInfo Model
 * @author realv_000 on 7/25/2015.
 */
public class IPinfoModel {
    private String iP;
    private String domain;
    private String country;
    private String countryCode;
    private String region;
    private String regionName;
    private String city;
    private String zipCode;
    private String latitude;
    private String longitude;
    private String timeZone;
    private String isp;
    private String organization;
    private String asNameNo;
    private String status;
    private String msg = null;

    public IPinfoModel() {
    }

    public IPinfoModel(String iP, String domain, String country, String countryCode, String region, String regionName, String city, String zipCode, String latitude, String longitude, String timeZone, String isp, String organization, String asNameNo, String status, String msg) {
        this.iP = iP;
        this.domain = domain;
        this.country = country;
        this.countryCode = countryCode;
        this.region = region;
        this.regionName = regionName;
        this.city = city;
        this.zipCode = zipCode;
        this.latitude = latitude;
        this.longitude = longitude;
        this.timeZone = timeZone;
        this.isp = isp;
        this.organization = organization;
        this.asNameNo = asNameNo;
        this.status = status;
        this.msg = msg;
    }

    public String getiP() {
        return iP;
    }

    public void setiP(String iP) {
        this.iP = iP;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    public String getIsp() {
        return isp;
    }

    public void setIsp(String isp) {
        this.isp = isp;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public String getAsNameNo() {
        return asNameNo;
    }

    public void setAsNameNo(String asNameNo) {
        this.asNameNo = asNameNo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
