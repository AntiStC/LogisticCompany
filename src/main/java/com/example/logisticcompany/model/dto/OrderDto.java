package com.example.logisticcompany.model.dto;

import java.util.List;
import java.util.Objects;

public class OrderDto extends AbstractDto {

    private Boolean statusOrder;
    private List<ListOfWaypointsDto> listOfWaypointsDtoList;
    private Long trackId;
    private List<DriverDto> driverList;

    public OrderDto() {
    }

    public Boolean isStatusOrder() {
        return statusOrder;
    }

    public void setStatusOrder(Boolean statusOrder) {
        this.statusOrder = statusOrder;
    }

    public List<ListOfWaypointsDto> getListOfWayPointsModels() {
        return listOfWaypointsDtoList;
    }

    public void setListOfWayPointsModels(List<ListOfWaypointsDto> listOfWayPointsModels) {
        this.listOfWaypointsDtoList = listOfWayPointsModels;
    }

    public Long getTrack() {
        return trackId;
    }

    public void setTrack(Long track) {
        this.trackId = track;
    }

    public List<DriverDto> getDrivers() {
        return driverList;
    }

    public void setDrivers(List<DriverDto> drivers) {
        this.driverList = drivers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof OrderDto orderDto)) return false;
        if (!super.equals(o)) return false;
        return isStatusOrder() == orderDto.isStatusOrder()
                && getListOfWayPointsModels().equals(orderDto.getListOfWayPointsModels())
                && getTrack().equals(orderDto.getTrack())
                && getDrivers().equals(orderDto.getDrivers());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(),
                isStatusOrder(),
                getListOfWayPointsModels(),
                getTrack(),
                getDrivers());
    }

    @Override
    public String toString() {
        return """
                OrderDto{
                    statusOrder=$statusOrder, 
                    listOfWayPointsModels=$listOfWayPointsModels, 
                    track=$track, 
                    drivers=$drivers
                }""";
    }
}
