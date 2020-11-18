package com.company.model;

import java.util.Objects;

/**
 * @author sonnyako <Makydon Sofiia>
 * @version 1.0.0
 * @since 1.0.0
 */
public class User {
    private Long id;
    private String name;
    private Address address;
    private Contact contact;
    private Summary summary;

    public User(Long id, String name, Address address, Contact contact, Summary summary) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.contact = contact;
        this.summary = summary;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public Summary getSummary() {
        return summary;
    }

    public void setSummary(Summary summary) {
        this.summary = summary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return Objects.equals(id, user.id) &&
            Objects.equals(name, user.name) &&
            Objects.equals(address, user.address) &&
            Objects.equals(contact, user.contact) &&
            Objects.equals(summary, user.summary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, address, contact, summary);
    }

    @Override
    public String toString() {
        return "User{" +
            "id" + this.id +
            "name" + this.name +
            "address" + this.address +
            "contact" + this.contact +
            "summary" + this.summary + "}";
    }
}
