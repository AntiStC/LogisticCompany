package com.example.logisticcompany.model.model;

public class CargoModel {
    private long id;
    private String nameCargo;
    private int weight;
    private String statusCargo;

    public CargoModel() {
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

    public String getStatusCargo() {
        return statusCargo;
    }

    public void setStatusCargo(String statusCargo) {
        this.statusCargo = statusCargo;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("CargoModel{");
        sb.append("id=").append(id);
        sb.append(", nameCargo='").append(nameCargo).append('\'');
        sb.append(", weight=").append(weight);
        sb.append(", statusCargo='").append(statusCargo).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
