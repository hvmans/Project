package pt.ipp.isep.dei.esoft.project.domain;

import java.util.Objects;

public class Employee {
    private static int employeeIdcounter = 0;
    private int employeeId;
    private String name;
    private int ccNumber;
    private int taxNumber;
    private final String employeeEmail;
    private int phoneNumber;

    public Employee( String name, int ccNumber, int taxNumber, String employeeEmail, int phoneNumber) {
        this.employeeId = employeeIdcounter++;
        this.name = name;
        this.ccNumber = ccNumber;
        this.taxNumber = taxNumber;
        this.employeeEmail = employeeEmail;
        this.phoneNumber = phoneNumber;
    }

    public Employee(String employeeEmail) {
        this.employeeEmail = employeeEmail;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Employee)) {
            return false;
        }
        Employee employee = (Employee) o;
        return employeeEmail.equals(employee.employeeEmail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeEmail);
    }

    public boolean hasEmail(String email) {
        return this.employeeEmail.equals(email);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCcNumber(int ccNumber) {
        this.ccNumber = ccNumber;
    }

    public void setTaxNumber(int taxNumber) {
        this.taxNumber = taxNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public static int getEmployeeIdcounter() {
        return employeeIdcounter;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public int getCcNumber() {
        return ccNumber;
    }

    public int getTaxNumber() {
        return taxNumber;
    }

    public String getEmployeeEmail() {
        return employeeEmail;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }
/**
     * Clone method.
     *
     * @return A clone of the current instance.
     */


}
