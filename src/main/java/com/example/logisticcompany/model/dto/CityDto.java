package com.example.logisticcompany.model.dto;

import java.util.Objects;

public class CityDto extends AbstractDto {

    private String city;
    private Long distance;

    public CityDto() {
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
        if (!(o instanceof CityDto cityDto)) return false;
        if (!super.equals(o)) return false;
        return getCity().equals(cityDto.getCity()) && getDistance().equals(cityDto.getDistance());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getCity(), getDistance());
    }

    @Override
    public String toString() {
        return """
                CityDto{
                    city='$city',\s
                    distance=$distance
                }""";
    }
}
