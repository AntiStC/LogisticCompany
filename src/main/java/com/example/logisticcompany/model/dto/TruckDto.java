package com.example.logisticcompany.model.dto;

import java.util.Objects;

public class TruckDto extends AbstractDto {

    private String registrationPlate;
    private Integer driverChange;
    private Integer capacity;
    private Boolean condition;
    private Long cityId;

    public TruckDto() {
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

    public Boolean isCondition() {
        return condition;
    }

    public void setCondition(Boolean condition) {
        this.condition = condition;
    }

    public Long getCityId() {
        return cityId;
    }

    public void setCityId(Long longId) {
        this.cityId = longId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TruckDto truckDto)) return false;
        if (!super.equals(o)) return false;
        return getRegistrationPlate().equals(truckDto.getRegistrationPlate()) && getDriverChange().equals(truckDto.getDriverChange()) && getCapacity().equals(truckDto.getCapacity()) && condition.equals(truckDto.condition) && getCityId().equals(truckDto.getCityId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getRegistrationPlate(), getDriverChange(), getCapacity(), condition, getCityId());
    }
}
