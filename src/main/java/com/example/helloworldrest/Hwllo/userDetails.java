package com.example.helloworldrest.Hwllo;

public class userDetails {

    private String firstname;
    private String lastname;
    private String city;

    public String getFirstname() {
        return firstname;
    }

    @Override
    public String toString() {
        return "userDetails{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", city='" + city + '\'' +
                '}';
    }

    public userDetails(String firstname, String lastname, String city) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.city = city;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
