package pt.ipp.isep.dei.esoft.project.domain;

import pt.isep.lei.esoft.auth.domain.model.Email;

public class Agent {
    private static int agentIdCounter = 0;
    private int agentId;

    private String name;
    private Email email;
    private int ccNumber;
    private int taxNumber;
    private String address;
    private String phoneNumber;
    private Agency agency;

    public Agent(String name, Email email, int ccNumber, int taxNumber, String address, String phoneNumber, Agency agency) {
        this.name = name;
        this.email = email;
        this.ccNumber = ccNumber;
        this.taxNumber = taxNumber;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.agency = agency;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(Email email) {
        this.email = email;
    }

    public void setCcNumber(int ccNumber) {
        this.ccNumber = ccNumber;
    }

    public void setTaxNumber(int taxNumber) {
        this.taxNumber = taxNumber;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setAgency(Agency agency) {
        this.agency = agency;
    }

    public static int getAgentIdCounter() {
        return agentIdCounter;
    }

    public int getAgentId() {
        return agentId;
    }

    public String getName() {
        return name;
    }

    public Email getEmail() {
        return email;
    }

    public int getCcNumber() {
        return ccNumber;
    }

    public int getTaxNumber() {
        return taxNumber;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Agency getAgency() {
        return agency;
    }
}
