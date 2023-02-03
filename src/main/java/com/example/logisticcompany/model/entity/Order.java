package com.example.logisticcompany.model.entity;

import jakarta.persistence.*;

import java.util.List;
import java.util.Objects;

@Entity
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private boolean statusOrder;
    @OneToMany
    private List<ListOfWaypoints> listOfWaypoints;
    @ManyToOne
    private Truck truck;
    @ManyToMany
    private List<Driver> drivers;

    public Order() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public boolean isStatusOrder() {
        return statusOrder;
    }

    public void setStatusOrder(boolean statusOrder) {
        this.statusOrder = statusOrder;
    }

    public List<ListOfWaypoints> getListOfWaypoints() {
        return listOfWaypoints;
    }

    public void setListOfWaypoints(List<ListOfWaypoints> listOfWaypoints) {
        this.listOfWaypoints = listOfWaypoints;
    }

    public Truck getTruck() {
        return truck;
    }

    public void setTruck(Truck truck) {
        this.truck = truck;
    }

    public List<Driver> getDrivers() {
        return drivers;
    }

    public void setDrivers(List<Driver> drivers) {
        this.drivers = drivers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Order order)) return false;
        return getId() == order.getId() && isStatusOrder() == order.isStatusOrder() && getListOfWaypoints().equals(order.getListOfWaypoints()) && getTruck().equals(order.getTruck()) && getDrivers().equals(order.getDrivers());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), isStatusOrder(), getListOfWaypoints(), getTruck(), getDrivers());
    }

    @Override
    public String toString() {
        String sb = "Order{" + "id=" + id +
                ", statusOrder=" + statusOrder +
                ", listOfWaypoints=" + listOfWaypoints +
                ", truck=" + truck +
                ", drivers=" + drivers +
                '}';
        return sb;
    }
}
