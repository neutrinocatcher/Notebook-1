package tsi.java.l1g2.notebook;

import asg.cliche.Command;
import asg.cliche.Param;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class Person extends Note {
    private String firstName;
    private String lastName;
    private String email;
    private List<String> phones = new ArrayList<>();

    @Command
    public String getFirstName() {
        return firstName;
    }

    @Command
    public void setFirstName(@Param(name = "first name") String firstName) {
        this.firstName = firstName;
    }

    @Command
    public String getLastName() {
        return lastName;
    }

    @Command
    public void setLastName(@Param(name = "last name") String lastName) {
        this.lastName = lastName;
    }

    @Command
    public List<String> getPhones() {
        return phones;
    }

    @Command
    public void addPhones(@Param(name = "phones") String... phones) {
        Collections.addAll(this.phones, phones);
    }

    @Command
    public String getEmail() {
        return email;
    }

    @Command
    public void setEmail(@Param(name = "email") String email) {
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

    @Override
    public boolean contains(String str) {
        if (super.contains(str)) {
            return true;
        }

        if (Stream.concat(Stream.of(firstName, lastName, email), phones.stream()).anyMatch(r -> r.toLowerCase().contains(str.toLowerCase()))) {
            return true;
        }

        return false;
    }
}
