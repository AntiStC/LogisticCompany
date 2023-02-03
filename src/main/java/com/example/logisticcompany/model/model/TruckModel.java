package com.example.logisticcompany.model.model;

public class TruckModel {
    private long id;
    private String registrationPlate;
    private int driverChange;
    private int capacity;
    private boolean condition;
    private CityModel city;

    public TruckModel() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getRegistrationPlate() {
        return registrationPlate;
    }

    public void setRegistrationPlate(String registrationPlate) {
        this.registrationPlate = registrationPlate;
    }

    public int getDriverChange() {
        return driverChange;
    }

    public void setDriverChange(int driverChange) {
        this.driverChange = driverChange;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public boolean isCondition() {
        return condition;
    }

    public void setCondition(boolean condition) {
        this.condition = condition;
    }

    public CityModel getCity() {
        return city;
    }

    public void setCity(CityModel city) {
        this.city = city;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("TruckModel{");
        sb.append("id=").append(id);
        sb.append(", registrationPlate='").append(registrationPlate).append('\'');
        sb.append(", driverChange=").append(driverChange);
        sb.append(", capacity=").append(capacity);
        sb.append(", condition=").append(condition);
        sb.append(", city=").append(city);
        sb.append('}');
        return sb.toString();
    }
}
