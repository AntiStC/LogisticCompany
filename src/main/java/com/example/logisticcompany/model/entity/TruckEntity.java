package com.example.logisticcompany.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;

import java.util.Objects;

@Entity
public class TruckEntity extends AbstractEntity {

    private String registrationPlate;
    private Integer driverChange;
    private Integer capacity;
    private Boolean condition;
    @ManyToOne
    private CityEntity cityEntity;

    public TruckEntity() {
    }

    public String getRegistrationPlate() {
        return registrationPlate;
    }

    public void setRegistrationPlate(String registrationPlate) {
        this.registrationPlate = registrationPlate;
    }

    public Integer getDriverChange() {
        return driverChange;
    }

    public void setDriverChange(Integer driverChange) {
        this.driverChange = driverChange;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public Boolean getCondition() {
        return condition;
    }

    public void setCondition(Boolean condition) {
        this.condition = condition;
    }

    public CityEntity getCity() {
        return cityEntity;
    }

    public void setCity(CityEntity cityEntity) {
        this.cityEntity = cityEntity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TruckEntity that)) return false;
        return getDriverChange() == that.getDriverChange()
                && getCapacity() == that.getCapacity()
                && getCondition() == that.getCondition()
                && getRegistrationPlate().equals(that.getRegistrationPlate())
                && cityEntity.equals(that.cityEntity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getRegistrationPlate(),
                getDriverChange(),
                getCapacity(),
                getCondition(),
                cityEntity);
    }

    @Override
    public String toString() {
        return """
                TruckEntity{
                    registrationPlate='$registrationPlate', 
                    driverChange=$driverChange, 
                    capacity=$capacity, 
                    condition=$condition, 
                    cityEntity=$cityEntity
                }""";
    }
}
