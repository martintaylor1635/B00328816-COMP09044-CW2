package com.martintaylor.models;

public class Client
{

    // Attributes
    private int clientId;
    private String firstName;
    private String lastName;
    private String companyName;
    private Address address;
    private String contactNumber;

    // Constructor (no args)
    public Client() {
        this.clientId = 0;
        this.firstName = "";
        this.lastName = "";
        this.companyName = "";
        this.address = new Address();
        this.contactNumber = "";
    }

    // Constructor (overloaded, takes Address object)
    public Client(String pFirstNameIn, String pLastNameIn, String pCompanyNameIn,
                  Address pAddressIn, String pContactNumberIn)
    {
        this.firstName = pFirstNameIn;
        this.lastName = pLastNameIn;
        this.companyName = pCompanyNameIn;
        this.address = pAddressIn;
        this.contactNumber = pContactNumberIn;
    }

    // Constructor (constructs Address)
    public Client(String pFirstNameIn, String pLastNameIn, String pCompanyNameIn, String pAddressLine1In,
                  String pAddressLine2In, String pPostCodeIn, String pCityIn, String pCountyIn, String pContactNumberIn)
    {
        this.firstName = pFirstNameIn;
        this.lastName = pLastNameIn;
        this.companyName = pCompanyNameIn;
        this.address = new Address(pAddressLine1In, pAddressLine2In, pPostCodeIn, pCityIn, pCountyIn);
        this.contactNumber = pContactNumberIn;
    }

    // Setters
    public void setFirstName(String pFirstNameIn) { this.firstName = pFirstNameIn; }
    public void setLastName(String pLastNameIn) { this.lastName = pLastNameIn; }
    public void setCompanyName(String pCompanyNameIn) { this.companyName = pCompanyNameIn; }
    public void setAddress(Address pAddressIn) { this.address = pAddressIn; }
    public void setContactNumber(String pContactNumberIn) { this.contactNumber = pContactNumberIn; }

    // Getters
    public String getFirstName() { return this.firstName; }
    public String getLastName() { return this.lastName; }
    public String getCompanyName() { return this.companyName; }
    public Address getAddress() { return this.address; }
    public String getContactNumber() { return this.contactNumber; }

}
