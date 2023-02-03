package com.example.logisticcompany.model.model;

public class CityModel {
    private long id;
    private String city;
    private long distance;

    public CityModel() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public long getDistance() {
        return distance;
    }

    public void setDistance(long distance) {
        this.distance = distance;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("CityModel{");
        sb.append("id=").append(id);
        sb.append(", city='").append(city).append('\'');
        sb.append(", distance=").append(distance);
        sb.append('}');
        return sb.toString();
    }
}
