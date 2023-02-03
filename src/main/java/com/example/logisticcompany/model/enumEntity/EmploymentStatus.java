package com.example.logisticcompany.model.enumEntity;

public enum EmploymentStatus {
    REST("rest"),
    SHIFT("shift"),
    WORK("work");

    private String employmentStatus;

    EmploymentStatus(String employmentStatus) {
        this.employmentStatus = employmentStatus;
    }

    public String getEmploymentStatus() {
        return employmentStatus;
    }
}
