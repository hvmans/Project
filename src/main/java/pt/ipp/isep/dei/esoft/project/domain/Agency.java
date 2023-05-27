package pt.ipp.isep.dei.esoft.project.domain;

import pt.isep.lei.esoft.auth.domain.model.Email;

public class Agency {

    private static int agencyIdCounter = 0;
    private int agencyId;
    private Email agencyEmail;
    private String location;
    private int telephoneNumber;

    public Agency(Email agencyEmail, String location, int telephoneNumber) {
        this.agencyEmail = agencyEmail;
        this.location = location;
        this.telephoneNumber = telephoneNumber;
        this.agencyId = agencyIdCounter++;
    }

    public static int getAgencyIdCounter() {
        return agencyIdCounter;
    }

    public int getAgencyId() {
        return agencyId;
    }

    public Email getAgencyEmail() {
        return agencyEmail;
    }

    public void setAgencyEmail(Email agencyEmail) {
        this.agencyEmail = agencyEmail;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(int telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }
}
