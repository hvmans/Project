package pt.ipp.isep.dei.esoft.project.domain;

import java.util.Objects;

/**
 * The type Owner.
 */
public class Owner {
    private static int ownerIdCounter =0;
    private int ownerId;
    private String name;
    private int ccNumber;
    private String taxNumber;
    private final String emailAddress;
    private String phoneNumber;

    public Owner(String name, int ccNumber, String taxNumber, String emailAddress, String phoneNumber) {
        this.name = name;
        this.ccNumber = ccNumber;
        this.taxNumber = taxNumber;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
        this.ownerId = ownerIdCounter++;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCcNumber(int ccNumber) {
        this.ccNumber = ccNumber;
    }

    public void setTaxNumber(String taxNumber) {
        this.taxNumber = taxNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public int getCcNumber() {
        return ccNumber;
    }

    public String getTaxNumber() {
        return taxNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public static int getOwnerIdCounter() {
        return ownerIdCounter;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public Owner clone(){return new Owner(this.name, this.ccNumber, this.taxNumber, this.emailAddress, this.phoneNumber);
}


}