package com.example.logisticcompany.model.enumEntity;

public enum TypeOfWaypoint {

    LOADING("loading"),
    UNLOADING("unloading");

    private String type;

    TypeOfWaypoint(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
