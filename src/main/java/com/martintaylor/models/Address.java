package com.martintaylor.models;

public class Address
{

    // Attributes
    private String addressLine1;
    private String addressLine2;
    private String postCode;
    private String city;
    private String county;

    // Constructor (overloaded)
    public Address(String pAddressLine1In, String pAddressLine2In,
                   String pPostCodeIn, String pCityIn, String pCountyIn)
    {
        this.addressLine1 = pAddressLine1In;
        this.addressLine2 = pAddressLine2In;
        this.postCode = pPostCodeIn;
        this.city = pCityIn;
        this.county = pCountyIn;
    }

    // No Args constructor
    public Address() {
        this.addressLine1 = "";
        this.addressLine2 = "";
        this.postCode = "";
        this.city = "";
        this.county = "";
    }

    // Getters
    public String getAddressLine1() { return this.addressLine1; }
    public String getAddressLine2() { return this.addressLine2; }
    public String getPostCode() { return this.postCode; }
    public String getCity() { return this.city; }
    public String getCounty() { return this.county; }

}