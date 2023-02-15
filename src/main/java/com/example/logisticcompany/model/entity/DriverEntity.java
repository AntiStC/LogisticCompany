package com.example.logisticcompany.model.entity;

import com.example.logisticcompany.model.enumEntity.EmploymentStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;

import java.util.Objects;

@Entity
public class DriverEntity extends AbstractEntity {

    private String firstName;
    private String lastName;
    private Long personalNumber;
    private Integer numberOfHoursWorked;
    @Enumerated(value = EnumType.STRING)
    private EmploymentStatus employmentStatus;
    @ManyToOne
    private CityEntity locationCityEntity;
    @ManyToOne
    private TruckEntity currentTruckEntity;

    public DriverEntity() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Long getPersonalNumber() {
        return personalNumber;
    }

    public void setPersonalNumber(Long personalNumber) {
        this.personalNumber = personalNumber;
    }

    public Integer getNumberOfHoursWorked() {
        return numberOfHoursWorked;
    }

    public void setNumberOfHoursWorked(Integer numberOfHoursWorked) {
        this.numberOfHoursWorked = numberOfHoursWorked;
    }

    public EmploymentStatus getEmploymentStatus() {
        return employmentStatus;
    }

    public void setEmploymentStatus(EmploymentStatus employmentStatus) {
        this.employmentStatus = employmentStatus;
    }

    public CityEntity getLocationCity() {
        return locationCityEntity;
    }

    public void setLocationCity(CityEntity locationCityEntity) {
        this.locationCityEntity = locationCityEntity;
    }

    public TruckEntity getCurrentTruck() {
        return currentTruckEntity;
    }

    public void setCurrentTruck(TruckEntity currentTruckEntity) {
        this.currentTruckEntity = currentTruckEntity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DriverEntity that)) return false;
        return getPersonalNumber() == that.getPersonalNumber()
                && getNumberOfHoursWorked() == that.getNumberOfHoursWorked()
                && getFirstName().equals(that.getFirstName())
                && getLastName().equals(that.getLastName())
                && getEmploymentStatus() == that.getEmploymentStatus()
                && locationCityEntity.equals(that.locationCityEntity)
                && getCurrentTruck().equals(that.getCurrentTruck());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirstName(),
                getLastName(),
                getPersonalNumber(),
                getNumberOfHoursWorked(),
                getEmploymentStatus(),
                locationCityEntity,
                getCurrentTruck());
    }

    @Override
    public String toString() {
        return """
                DriverEntity{
                    firstName='$firstName', 
                    lastName='$lastName', 
                    personalNumber=$personalNumber, 
                    numberOfHoursWorked=$numberOfHoursWorked, 
                    employmentStatus=$employmentStatus, 
                    locationCityEntity=$locationCityEntity, 
                    currentTruckEntity=$currentTruckEntity
                }""";
    }
}
