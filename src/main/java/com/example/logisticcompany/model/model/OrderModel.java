package com.example.logisticcompany.model.model;

import com.example.logisticcompany.model.entity.Driver;

import java.util.List;

public class OrderModel {
    private long id;
    private boolean statusOrder;
    private List<ListOfWayPointsModel> listOfWayPointsModels;
    private TruckModel track;
    private List<Driver> drivers;

    public OrderModel() {
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

    public List<ListOfWayPointsModel> getListOfWayPointsModels() {
        return listOfWayPointsModels;
    }

    public void setListOfWayPointsModels(List<ListOfWayPointsModel> listOfWayPointsModels) {
        this.listOfWayPointsModels = listOfWayPointsModels;
    }

    public TruckModel getTrack() {
        return track;
    }

    public void setTrack(TruckModel track) {
        this.track = track;
    }

    public List<Driver> getDrivers() {
        return drivers;
    }

    public void setDrivers(List<Driver> drivers) {
        this.drivers = drivers;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("OrderModel{");
        sb.append("id=").append(id);
        sb.append(", statusOrder=").append(statusOrder);
        sb.append(", listOfWayPointsModels=").append(listOfWayPointsModels);
        sb.append(", track=").append(track);
        sb.append(", drivers=").append(drivers);
        sb.append('}');
        return sb.toString();
    }
}
