package com.example.logisticcompany.model.dto;

import java.util.Objects;

public class CargoDto extends AbstractDto {

    private String nameCargo;
    private Integer weight;
    private String statusCargo;

    public CargoDto() {
    }

    public String getNameCargo() {
        return nameCargo;
    }

    public void setNameCargo(String nameCargo) {
        this.nameCargo = nameCargo;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public String getStatusCargo() {
        return statusCargo;
    }

    public void setStatusCargo(String statusCargo) {
        this.statusCargo = statusCargo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CargoDto cargoDto)) return false;
        if (!super.equals(o)) return false;
        return getWeight().equals(cargoDto.getWeight()) && getNameCargo().equals(cargoDto.getNameCargo()) && getStatusCargo().equals(cargoDto.getStatusCargo());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getNameCargo(), getWeight(), getStatusCargo());
    }

    @Override
    public String toString() {
        return """
                CargoDto{
                    nameCargo='$nameCargo',\s
                    weight=$weight,\s
                    statusCargo='$statusCargo'
                }""";
    }
}
