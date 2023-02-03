package com.example.logisticcompany.model.enumEntity;

public enum StatusCargo {
    PREPARED("prepared"),
    SHIPPED("shipped"),
    DELIVERED("delivered");

    private String status;

    StatusCargo(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}
