package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {
    private String city;
    private String state;
    private String country;
    private String zipcode;

@Autowired
    public Address(@Value("#{'Atlanta'}") String city,
                   @Value("#{'Georgia'}")String state,
                   @Value("#{'USA'}")String country,
                   @Value("#{'02204'}")String zipcode) {
        this.city = city;
        this.state = state;
        this.country = country;
        this.zipcode = zipcode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", zipcode='" + zipcode + '\'' +
                '}';
    }
}
