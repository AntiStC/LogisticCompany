package com.example.logisticcompany.model.model;

import com.example.logisticcompany.model.enumEntity.TypeOfWaypoint;

public class ListOfWayPointsModel {
    private long ud;
    private CityModel city;
    private CargoModel cargo;
    private TypeOfWaypoint type;

    public ListOfWayPointsModel() {
    }

    public long getUd() {
        return ud;
    }

    public void setUd(long ud) {
        this.ud = ud;
    }

    public CityModel getCity() {
        return city;
    }

    public void setCity(CityModel city) {
        this.city = city;
    }

    public CargoModel getCargo() {
        return cargo;
    }

    public void setCargo(CargoModel cargo) {
        this.cargo = cargo;
    }

    public TypeOfWaypoint getType() {
        return type;
    }

    public void setType(TypeOfWaypoint type) {
        this.type = type;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("ListOfWayPointsModel{");
        sb.append("ud=").append(ud);
        sb.append(", city=").append(city);
        sb.append(", cargo=").append(cargo);
        sb.append(", type=").append(type);
        sb.append('}');
        return sb.toString();
    }
}
