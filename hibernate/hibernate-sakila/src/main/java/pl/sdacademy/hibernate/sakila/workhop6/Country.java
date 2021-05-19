package pl.sdacademy.hibernate.sakila.workhop6;


import javax.persistence.*;
import java.util.List;

@Entity
@Table (name = "country")
public class Country {

    @Id
    @Column(name= "country_id")
    private String countryID;

    @Column(name= "country")
    private String name;

    @OneToMany(mappedBy = "country")
    private List<City> cities;

    public Country(String countryID, String name, List<City> cities) {
        this.countryID = countryID;
        this.name = name;
        this.cities = cities;
    }

    public Country() {
    }

    public String getCountryID() {
        return countryID;
    }

    public void setCountryID(String countryID) {
        this.countryID = countryID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<City> getCities() {
        return cities;
    }

    public void setCities(List<City> cities) {
        this.cities = cities;
    }

    @Override
    public String toString() {
        return "Country{" +
                "countryID='" + countryID + '\'' +
                ", name='" + name +
                '}';
    }
}
