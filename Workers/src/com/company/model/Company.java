package com.company.model;

import java.util.Objects;

/**
 * @author sonnyako <Makydon Sofiia>
 * @version 1.0.0
 * @since 1.0.0
 */
public class Company {
    private Long id;
    private String name;
    private Address address;
    private Contact contact;
    private String description;

    public Company(Long id, String name, Address address, Contact contact, String description) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.contact = contact;
        this.description = description;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Company)) return false;
        Company company = (Company) o;
        return id.equals(company.id) &&
            name.equals(company.name) &&
            address.equals(company.address) &&
            contact.equals(company.contact) &&
            description.equals(company.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, address, contact, description);
    }

    @Override
    public String toString() {
        return "Company{" +
            "id" + this.id +
            "name" + this.name +
            "address" + this.address +
            "contact" + this.contact +
            "description" + this.description + "}";
    }
}
