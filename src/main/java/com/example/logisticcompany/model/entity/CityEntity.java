package com.example.logisticcompany.model.entity;

import jakarta.persistence.Entity;

import java.util.Objects;

@Entity
public class CityEntity extends AbstractEntity {
    private String city;
    private Long distance;

    public CityEntity() {
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Long getDistance() {
        return distance;
    }

    public void setDistance(Long distance) {
        this.distance = distance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CityEntity that)) return false;
        return getDistance() == that.getDistance()
                && getCity().equals(that.getCity());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCity(),
                getDistance());
    }

    @Override
    public String toString() {
        return """
                CityEntity{
                    city='$city', 
                    distance=$distance
                }""";
    }
}
