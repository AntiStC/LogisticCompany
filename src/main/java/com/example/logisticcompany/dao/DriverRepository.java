package com.example.logisticcompany.dao;

import com.example.logisticcompany.model.entity.DriverEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DriverRepository extends JpaRepository<DriverEntity, Long> {
}
