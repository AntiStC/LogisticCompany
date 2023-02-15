package com.example.logisticcompany.dao;

import com.example.logisticcompany.model.entity.CityEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository extends JpaRepository<CityEntity, Long> {
}
