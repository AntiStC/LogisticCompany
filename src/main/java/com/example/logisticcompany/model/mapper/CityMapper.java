package com.example.logisticcompany.model.mapper;

import com.example.logisticcompany.model.dto.CityDto;
import com.example.logisticcompany.model.entity.CityEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CityMapper extends AbstractMapper<CityEntity, CityDto> {

    @Autowired
    CityMapper() {
        super(CityEntity.class, CityDto.class);
    }

}
