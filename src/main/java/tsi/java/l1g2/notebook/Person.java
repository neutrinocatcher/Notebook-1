package tsi.java.l1g2.notebook;

import asg.cliche.Command;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Person extends Record {
    private String firstName;
    private String lastName;
    private String email;
    private List<String> phones = new ArrayList<>();

    @Command
    public String getFirstName() {
        return firstName;
    }

    @Command
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Command
    public String getLastName() {
        return lastName;
    }

    @Command
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Command
    public List<String> getPhones() {
        return phones;
    }

    @Command
    public void addPhones(String... phones) {
        Collections.addAll(this.phones, phones);
    }

    @Command
    public String getEmail() {
        return email;
    }

    @Command
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + getId() +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", phones=" + phones +
                '}';
    }
}
