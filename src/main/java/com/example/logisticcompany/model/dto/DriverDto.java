package com.example.logisticcompany.model.dto;

import java.util.Objects;

public class DriverDto extends AbstractDto {

    private String firstName;
    private String lastName;
    private Long personalNumber;
    private Integer numberOfHoursWorked;
    private String employmentStatus;
    private Long cityId;
    private Long trackId;

    public DriverDto() {
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

    public String getEmploymentStatus() {
        return employmentStatus;
    }

    public void setEmploymentStatus(String employmentStatus) {
        this.employmentStatus = employmentStatus;
    }

    public Long getCityId() {
        return cityId;
    }

    public void setCityId(Long cityId) {
        this.cityId = cityId;
    }

    public Long getTrackId() {
        return trackId;
    }

    public void setTrackId(Long trackId) {
        this.trackId = trackId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DriverDto driverDto)) return false;
        if (!super.equals(o)) return false;
        return getFirstName().equals(driverDto.getFirstName()) && getLastName().equals(driverDto.getLastName()) && getPersonalNumber().equals(driverDto.getPersonalNumber()) && getNumberOfHoursWorked().equals(driverDto.getNumberOfHoursWorked()) && getEmploymentStatus().equals(driverDto.getEmploymentStatus()) && getCityId().equals(driverDto.getCityId()) && getTrackId().equals(driverDto.getTrackId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getFirstName(), getLastName(), getPersonalNumber(), getNumberOfHoursWorked(), getEmploymentStatus(), getCityId(), getTrackId());
    }

    @Override
    public String toString() {
        return """
                DriverDto{
                    firstName='$firstName',\s
                    lastName='$lastName',\s
                    personalNumber=$personalNumber,\s
                    numberOfHoursWorked=$numberOfHoursWorked,\s
                    employmentStatus='$employmentStatus',\s
                    city=$city,\s
                    track=$track
                }""";
    }
}
