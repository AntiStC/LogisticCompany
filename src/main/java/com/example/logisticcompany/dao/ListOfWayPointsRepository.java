package com.example.logisticcompany.dao;

import com.example.logisticcompany.model.entity.ListOfWaypointsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ListOfWayPointsRepository extends JpaRepository<ListOfWaypointsEntity, Long> {
}
