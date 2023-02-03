package com.example.logisticcompany.model.entity;

import com.example.logisticcompany.model.enumEntity.StatusCargo;
import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class Cargo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nameCargo;
    private int weight;
    @Enumerated(value = EnumType.STRING)
    private StatusCargo statusCargo;

    public Cargo() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNameCargo() {
        return nameCargo;
    }

    public void setNameCargo(String nameCargo) {
        this.nameCargo = nameCargo;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
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
        if (!(o instanceof Cargo cargo)) return false;
        return getId() == cargo.getId()
                && getWeight() == cargo.getWeight()
                && getNameCargo().equals(cargo.getNameCargo())
                && getStatusCargo() == cargo.getStatusCargo();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(),
                getNameCargo(),
                getWeight(),
                getStatusCargo());
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Cargo{");
        sb.append("id=").append(id);
        sb.append(", nameCargo='").append(nameCargo).append('\'');
        sb.append(", weight=").append(weight);
        sb.append(", statusCargo=").append(statusCargo);
        sb.append('}');
        return sb.toString();
    }
}
