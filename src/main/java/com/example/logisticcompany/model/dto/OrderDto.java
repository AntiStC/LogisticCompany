package com.example.logisticcompany.model.dto;

import java.util.List;
import java.util.Objects;

public class OrderDto extends AbstractDto {

    private Boolean statusOrder;
    private List<Long> listOfWayPointsModelsId;
    private Long trackId;
    private List<Long> driversId;

    public OrderDto() {
    }

    public Boolean isStatusOrder() {
        return statusOrder;
    }

    public void setStatusOrder(Boolean statusOrder) {
        this.statusOrder = statusOrder;
    }

    public List<Long> getListOfWayPointsModels() {
        return listOfWayPointsModelsId;
    }

    public void setListOfWayPointsModels(List<Long> listOfWayPointsModels) {
        this.listOfWayPointsModelsId = listOfWayPointsModels;
    }

    public Long getTrack() {
        return trackId;
    }

    public void setTrack(Long track) {
        this.trackId = track;
    }

    public List<Long> getDrivers() {
        return driversId;
    }

    public void setDrivers(List<Long> drivers) {
        this.driversId = drivers;
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
