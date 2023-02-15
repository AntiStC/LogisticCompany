package com.example.logisticcompany.dao;

import com.example.logisticcompany.model.entity.CargoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CargoRepository extends JpaRepository<CargoEntity, Long> {
}
