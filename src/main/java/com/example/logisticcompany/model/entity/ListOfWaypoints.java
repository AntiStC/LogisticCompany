package com.example.logisticcompany.model.entity;

import com.example.logisticcompany.model.enumEntity.TypeOfWaypoint;
import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class ListOfWaypoints {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @ManyToOne
    private City city;
    @OneToOne
    private Cargo cargo;
    @Enumerated(value = EnumType.STRING)
    private TypeOfWaypoint type;

    public ListOfWaypoints() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
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
        if (!(o instanceof ListOfWaypoints that)) return false;
        return getId() == that.getId()
                && getCity().equals(that.getCity())
                && getCargo().equals(that.getCargo())
                && getType().equals(that.getType());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(),
                getCity(),
                getCargo(),
                getType());
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("ListOfWaypoints{");
        sb.append("id=").append(id);
        sb.append(", city=").append(city);
        sb.append(", cargo=").append(cargo);
        sb.append(", type=").append(type);
        sb.append('}');
        return sb.toString();
    }
}
