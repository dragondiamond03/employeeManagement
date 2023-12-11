package entity;

import constant.IConstant;
import util.Validate;

/**
 * Represents an employee.
 * 
 * @author Bui Tuan Son
 * @version 0.0.1
 */
public class Employee {

    private String id;
    private String firstName;
    private String lastName;
    private Boolean gender;
    private String dob;
    private String email;
    private String phone;
    private String address;
    private double salary;
    private String agency;

    public Employee() {
    }

    public Employee(String id, String firstName, String lastName, Boolean gender, String dob, String email,
            String phone, String address, double salary, String agency) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.dob = dob;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.salary = salary;
        this.agency = agency;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getAgency() {
        return agency;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }

    public String getid() {
        return id;
    }

    public void setid(String id) {
        this.id = id;
    }

    public String getfirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getphone() {
        return phone;
    }

    public void setphone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Displays an Employee instance's information in a formatted table.
     */
    public void display() {
        System.out.printf("| %5s | %10s | %10s | %6s | %10s | %25s | %10s | %10s | %10s | %10s |\n",
                id,
                firstName,
                lastName,
                gender ? "female" : "male",
                dob,
                email,
                phone,
                address,
                salary,
                agency);
    }

    /**
     * Reads input values for each field of an Employee instance from the user.
     */
    public void input() {
        this.firstName = Validate.getString("Enter firstName: ");
        this.lastName = Validate.getString("Enter lastName: ");
        this.gender = Boolean.parseBoolean(Validate.getString("Enter gender('true' is female): "));
        this.dob = Validate.getString("Enter dob: ", "Invalid value", IConstant.REGEX_DATE);
        this.email = Validate.getString("Enter email: ", "Invalid email", IConstant.REGEX_EMAIL);
        this.phone = Validate.getString("Enter phone number: ", "Invalid phone number: ", IConstant.REGEX_NUMBER);
        this.address = Validate.getString("Enter address: ");
        this.salary = Validate.getDouble("Enter salary: ", "Value out of range", "Invalid ", 0, Double.MAX_VALUE);
        this.agency = Validate.getString("Enter agency: ");
    }
}