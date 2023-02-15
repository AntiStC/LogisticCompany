package com.example.logisticcompany.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

import java.util.List;
import java.util.Objects;

@Entity
public class OrderEntity extends AbstractEntity {

    private Boolean statusOrder;
    @OneToMany
    private List<ListOfWaypointsEntity> listOfWaypointEntities;
    @ManyToOne
    private TruckEntity truckEntity;
    @ManyToMany
    private List<DriverEntity> driverEntities;

    public OrderEntity() {
    }

    public Boolean isStatusOrder() {
        return statusOrder;
    }

    public void setStatusOrder(Boolean statusOrder) {
        this.statusOrder = statusOrder;
    }

    public List<ListOfWaypointsEntity> getListOfWaypoints() {
        return listOfWaypointEntities;
    }

    public void setListOfWaypoints(List<ListOfWaypointsEntity> listOfWaypointEntities) {
        this.listOfWaypointEntities = listOfWaypointEntities;
    }

    public TruckEntity getTruck() {
        return truckEntity;
    }

    public void setTruck(TruckEntity truckEntity) {
        this.truckEntity = truckEntity;
    }

    public List<DriverEntity> getDrivers() {
        return driverEntities;
    }

    public void setDrivers(List<DriverEntity> driverEntities) {
        this.driverEntities = driverEntities;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof OrderEntity that)) return false;
        return isStatusOrder() == that.isStatusOrder()
                && listOfWaypointEntities.equals(that.listOfWaypointEntities)
                && getTruck().equals(that.getTruck())
                && driverEntities.equals(that.driverEntities);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isStatusOrder(),
                listOfWaypointEntities,
                getTruck(),
                driverEntities);
    }

    @Override
    public String toString() {
        return """
                OrderEntity{
                    statusOrder=$statusOrder, 
                    listOfWaypointEntities=$listOfWaypointEntities, 
                    truckEntity=$truckEntity, 
                    driverEntities=$driverEntities
                }""";
    }
}
