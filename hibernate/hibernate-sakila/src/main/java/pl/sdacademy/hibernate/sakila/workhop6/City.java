package pl.sdacademy.hibernate.sakila.workhop6;


import javax.persistence.*;
import java.util.List;

@Entity
@Table (name = "city")
public class City {
        @Id
        @Column(name= "city_id")
        private String cityId;

        @Column(name= "city")
        private String name;

        @ManyToOne
        @JoinColumn(name= "country_id")
        private Country country;

        @OneToMany(mappedBy = "city")
        private List<Address> addresses;

    public City() {
    }

    public City(String cityId, String name, Country country, List<Address> addresses) {
        this.cityId = cityId;
        this.name = name;
        this.country = country;
        this.addresses = addresses;
    }

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    @Override
    public String toString() {
        return "City{" +
                "cityId='" + cityId + '\'' +
                ", name='" + name + '\'' +
                ", country=" + country +
                '}';
    }
}
