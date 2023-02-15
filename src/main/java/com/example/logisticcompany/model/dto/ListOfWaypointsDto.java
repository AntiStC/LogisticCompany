package com.example.logisticcompany.model.dto;

import com.example.logisticcompany.model.enumEntity.TypeOfWaypoint;

import java.util.Objects;

public class ListOfWaypointsDto extends AbstractDto {

    private Long cityId;
    private Long cargoId;
    private TypeOfWaypoint type;

    public ListOfWaypointsDto() {
    }

    public Long getCityId() {
        return cityId;
    }

    public void setCityId(Long cityId) {
        this.cityId = cityId;
    }

    public Long getCargoId() {
        return cargoId;
    }

    public void setCargoId(Long cargoId) {
        this.cargoId = cargoId;
    }

    public TypeOfWaypoint getType() {
        return type;
    }

    public void setType(TypeOfWaypoint type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ListOfWaypointsDto that)) return false;
        if (!super.equals(o)) return false;
        return getCityId().equals(that.getCityId()) && getCargoId().equals(that.getCargoId()) && getType() == that.getType();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getCityId(), getCargoId(), getType());
    }

    @Override
    public String toString() {
        return """
                ListOfWaypointsDto{
                    city=$city, 
                    cargo=$cargo, 
                    type=$type
                }""";
    }
}
