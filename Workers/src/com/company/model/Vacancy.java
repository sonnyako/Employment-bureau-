package com.company.model;

/**
 * @author sonnyako <Makydon Sofiia>
 * @version 1.0.0
 * @since 1.0.0
 */
public class Vacancy {
    private Long id;
    private String position;
    private float salary;
    private Address address;
    private String description;
    private String requirements;
    private Company company;

    public Vacancy(Long id, String position, float salary, Address address, String description, String requirements, Company company) {
        this.id = id;
        this.position = position;
        this.salary = salary;
        this.address = address;
        this.description = description;
        this.requirements = requirements;
        this.company = company;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRequirements() {
        return requirements;
    }

    public void setRequirements(String requirements) {
        this.requirements = requirements;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "Vacancy{" +
            "id" + this.id +
            "position" + this.position +
            "salary" + this.salary +
            "address" + this.address +
            "description" + this.description +
            "requirements" + this.requirements +
            "company" + this.company + "}";
    }
}
