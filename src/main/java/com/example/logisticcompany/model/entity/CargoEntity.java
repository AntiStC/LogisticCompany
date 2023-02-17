package com.example.logisticcompany.model.entity;

import com.example.logisticcompany.model.enumEntity.StatusCargo;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

import java.util.Objects;

@Entity
public class
CargoEntity extends AbstractEntity {

    private String nameCargo;
    private Integer weight;
    @Enumerated(value = EnumType.STRING)
    private StatusCargo statusCargo;

    public CargoEntity() {
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

    public StatusCargo getStatusCargo() {
        return statusCargo;
    }

    public void setStatusCargo(StatusCargo statusCargo) {
        this.statusCargo = statusCargo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CargoEntity that)) return false;
        return getWeight().equals(that.getWeight())
                && getNameCargo().equals(that.getNameCargo())
                && getStatusCargo() == that.getStatusCargo();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNameCargo(),
                getWeight(),
                getStatusCargo());
    }

    @Override
    public String toString() {
        return """
                CargoEntity{
                nameCargo='$nameCargo',\s
                weight=$weight,\s
                statusCargo=$statusCargo
                }""";
    }

}
