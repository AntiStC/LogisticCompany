package com.example.logisticcompany.model.model;

public class DriverModel {
    private long id;
    private String firstName;
    private String lastName;
    private long personalNumber;
    private int numberOfHoursWorked;
    private String employmentStatus;
    private CityModel city;
    private TruckModel track;

    public DriverModel() {
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

    public String getEmploymentStatus() {
        return employmentStatus;
    }

    public void setEmploymentStatus(String employmentStatus) {
        this.employmentStatus = employmentStatus;
    }

    public CityModel getCity() {
        return city;
    }

    public void setCity(CityModel city) {
        this.city = city;
    }

    public TruckModel getTrack() {
        return track;
    }

    public void setTrack(TruckModel track) {
        this.track = track;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("DriverModel{");
        sb.append("id=").append(id);
        sb.append(", firstName='").append(firstName).append('\'');
        sb.append(", lastName='").append(lastName).append('\'');
        sb.append(", personalNumber=").append(personalNumber);
        sb.append(", numberOfHoursWorked=").append(numberOfHoursWorked);
        sb.append(", employmentStatus='").append(employmentStatus).append('\'');
        sb.append(", city=").append(city);
        sb.append(", track=").append(track);
        sb.append('}');
        return sb.toString();
    }
}
