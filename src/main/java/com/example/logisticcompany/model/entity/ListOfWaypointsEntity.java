package com.example.logisticcompany.model.entity;

import com.example.logisticcompany.model.enumEntity.TypeOfWaypoint;
import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class ListOfWaypointsEntity extends AbstractEntity {

    @ManyToOne
    private CityEntity cityEntity;
    @OneToOne
    private CargoEntity cargoEntity;
    @Enumerated(value = EnumType.STRING)
    private TypeOfWaypoint type;

    public ListOfWaypointsEntity() {
    }

    public CityEntity getCity() {
        return cityEntity;
    }

    public void setCity(CityEntity cityEntity) {
        this.cityEntity = cityEntity;
    }

    public CargoEntity getCargo() {
        return cargoEntity;
    }

    public void setCargo(CargoEntity cargoEntity) {
        this.cargoEntity = cargoEntity;
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
        if (!(o instanceof ListOfWaypointsEntity that)) return false;
        return cityEntity.equals(that.cityEntity)
                && cargoEntity.equals(that.cargoEntity)
                && getType() == that.getType();
    }

    @Override
    public int hashCode() {
        return Objects.hash(cityEntity,
                cargoEntity,
                getType());
    }

    @Override
    public String toString() {
        return """
                ListOfWaypointsEntity{
                    cityEntity=$cityEntity, 
                    cargoEntity=$cargoEntity, 
                    type=$type
                }""";
    }
}
