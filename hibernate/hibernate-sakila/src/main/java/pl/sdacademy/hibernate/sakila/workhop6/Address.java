package pl.sdacademy.hibernate.sakila.workhop6;

import javax.persistence.*;

@Entity
@Table(name = "address")
public class Address {

    @Id
    @Column(name= "address_id")
    private String addressId;
    private String address;

    @ManyToOne
    @JoinColumn(name= "city_id")
    private City city;

    public Address(String addressId, String address, City city) {
        this.addressId = addressId;
        this.address = address;
        this.city = city;
    }

    public Address() {
    }

    public String getAddressId() {
        return addressId;
    }

    public String getAddress() {
        return address;
    }

    public City getCity() {
        return city;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCity(City city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Address{" +
                "addressId='" + addressId + '\'' +
                ", address='" + address + '\'' +
                ", city=" + city +
                '}';
    }
}
