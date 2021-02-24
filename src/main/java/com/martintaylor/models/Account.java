package com.martintaylor.models;

import org.springframework.security.crypto.bcrypt.BCrypt;
import java.util.UUID;
import com.fasterxml.uuid.Generators;

public class Account
{

    // Attributes
    private String accountId;
    private String firstName;
    private String lastName;
    private String userName;
    private String emailAddress;
    private String password;

    // Constructor (overloaded)
    public Account(String pFirstNameIn, String pLastNameIn,
                   String pUserNameIn, String pEmailAddressIn,
                   String pPasswordIn)
    {
        this.accountId = generateNewGuid();
        this.firstName = pFirstNameIn;
        this.lastName = pLastNameIn;
        this.userName = pUserNameIn;
        this.emailAddress = pEmailAddressIn;
        this.password = hashPassword(pPasswordIn);
    }

    // Getters
    public String getAccountId() { return this.accountId; }
    public String getFirstName() { return this.firstName; }
    public String getLastName() { return this.lastName; }
    public String getUserName() { return this.userName; }
    public String getEmailAddress() { return this.emailAddress; }
    public String getPassword() { return this.password; }

    // Methods
    private String hashPassword(String pPasswordIn)
    {
        return BCrypt.hashpw(pPasswordIn, BCrypt.gensalt());
    }

    public boolean VerifyPassword(String pPasswordIn)
    {

        // If plaintext password matches that of the
        // hashed password, then password must be valid.
        if(BCrypt.checkpw(pPasswordIn, this.password))
        {
            return true;
        }

        return false;

    }

    private String generateNewGuid()
    {
        UUID uuid = Generators.randomBasedGenerator().generate();
        return uuid.toString();
    }

}
