package com.example.logisticcompany.dao;

import com.example.logisticcompany.model.entity.TruckEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TruckRepository extends JpaRepository<TruckEntity, Long> {
}
