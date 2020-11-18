package com.company.model;

import java.util.Objects;

/**
 * @author sonnyako <Makydon Sofiia>
 * @version 1.0.0
 * @since 1.0.0
 */
public class Address {
    private Long id;
    private String region;
    private String district;
    private String city;
    private CityType cityType;
    private String street;
    private StreetType streetType;
    private String houseNumber;
    private String postalCode;

    public Address(Long id, String region, String district, String city, CityType cityType, String
        street, StreetType streetType, String houseNumber, String postalCode) {
        this.id = id;
        this.region = region;
        this.district = district;
        this.city = city;
        this.cityType = cityType;
        this.street = street;
        this.streetType = streetType;
        this.houseNumber = houseNumber;
        this.postalCode = postalCode;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public CityType getCityType() {
        return cityType;
    }

    public void setCityType(CityType cityType) {
        this.cityType = cityType;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public StreetType getStreetType() {
        return streetType;
    }

    public void setStreetType(StreetType streetType) {
        this.streetType = streetType;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Address)) return false;
        Address address = (Address) o;
        return id.equals(address.id) &&
            region.equals(address.region) &&
            district.equals(address.district) &&
            city.equals(address.city) &&
            cityType == address.cityType &&
            street.equals(address.street) &&
            streetType == address.streetType &&
            houseNumber.equals(address.houseNumber) &&
            postalCode.equals(address.postalCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, region, district, city, cityType, street, streetType, houseNumber, postalCode);
    }

    @Override
    public String toString() {
        return "Address {" +
            "id" + this.id +
            "region" + this.region +
            "district" + this.district +
            "city" + this.city +
            "cityType" + this.cityType +
            "street" + this.street +
            "streetType" + this.streetType +
            "houseNumber" + this.houseNumber +
            "postalCode" + this.postalCode + "}";
    }
}
