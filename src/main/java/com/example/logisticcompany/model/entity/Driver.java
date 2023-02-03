package com.example.logisticcompany.model.entity;

import com.example.logisticcompany.model.enumEntity.EmploymentStatus;
import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class Driver {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String firstName;
    private String lastName;
    private long personalNumber;
    private int numberOfHoursWorked;
    @Enumerated(value = EnumType.STRING)
    private EmploymentStatus employmentStatus;
    @ManyToOne
    private City locationCity;
    @ManyToOne
    private Truck currentTruck;

    public Driver() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public long getPersonalNumber() {
        return personalNumber;
    }

    public void setPersonalNumber(long personalNumber) {
        this.personalNumber = personalNumber;
    }

    public int getNumberOfHoursWorked() {
        return numberOfHoursWorked;
    }

    public void setNumberOfHoursWorked(int numberOfHoursWorked) {
        this.numberOfHoursWorked = numberOfHoursWorked;
    }

    public EmploymentStatus getEmploymentStatus() {
        return employmentStatus;
    }

    public void setEmploymentStatus(EmploymentStatus employmentStatus) {
        this.employmentStatus = employmentStatus;
    }

    public City getLocationCity() {
        return locationCity;
    }

    public void setLocationCity(City locationCity) {
        this.locationCity = locationCity;
    }

    public Truck getCurrentTruck() {
        return currentTruck;
    }

    public void setCurrentTruck(Truck currentTruck) {
        this.currentTruck = currentTruck;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Driver driver)) return false;
        return getId() == driver.getId()
                && getPersonalNumber() == driver.getPersonalNumber()
                && getNumberOfHoursWorked() == driver.getNumberOfHoursWorked()
                && getFirstName().equals(driver.getFirstName())
                && getLastName().equals(driver.getLastName())
                && getEmploymentStatus() == driver.getEmploymentStatus()
                && getLocationCity().equals(driver.getLocationCity())
                && getCurrentTruck().equals(driver.getCurrentTruck());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(),
                getFirstName(),
                getLastName(),
                getPersonalNumber(),
                getNumberOfHoursWorked(),
                getEmploymentStatus(),
                getLocationCity(),
                getCurrentTruck());
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Driver{");
        sb.append("id=").append(id);
        sb.append(", firstName='").append(firstName).append('\'');
        sb.append(", lastName='").append(lastName).append('\'');
        sb.append(", personalNumber=").append(personalNumber);
        sb.append(", numberOfHoursWorked=").append(numberOfHoursWorked);
        sb.append(", employmentStatus=").append(employmentStatus);
        sb.append(", locationCity=").append(locationCity);
        sb.append(", currentTruck=").append(currentTruck);
        sb.append('}');
        return sb.toString();
    }
}
