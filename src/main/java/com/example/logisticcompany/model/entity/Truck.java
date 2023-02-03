package com.example.logisticcompany.model.entity;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class Truck {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String registrationPlate;
    private int driverChange;
    private int capacity;
    private boolean condition;
    @ManyToOne
    private City city;

    public Truck() {
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

    public boolean getCondition() {
        return condition;
    }

    public void setCondition(boolean condition) {
        this.condition = condition;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Truck truck)) return false;
        return getId() == truck.getId()
                && getDriverChange() == truck.getDriverChange()
                && getCapacity() == truck.getCapacity()
                && getRegistrationPlate().equals(truck.getRegistrationPlate())
                && getCondition() == truck.getCondition()
                && getCity().equals(truck.getCity());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(),
                getRegistrationPlate(),
                getDriverChange(),
                getCapacity(),
                getCondition(),
                getCity());
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Truck{");
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
