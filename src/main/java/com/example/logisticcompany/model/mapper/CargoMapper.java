package com.example.logisticcompany.model.mapper;

import com.example.logisticcompany.model.dto.CargoDto;
import com.example.logisticcompany.model.entity.CargoEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CargoMapper extends AbstractMapper<CargoEntity, CargoDto> {

    @Autowired
    CargoMapper() {
        super(CargoEntity.class, CargoDto.class);
    }

}
