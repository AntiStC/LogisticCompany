package com.example.logisticcompany.model.mapper;

import com.example.logisticcompany.dao.CityRepository;
import com.example.logisticcompany.dao.TruckRepository;
import com.example.logisticcompany.model.dto.DriverDto;
import com.example.logisticcompany.model.entity.DriverEntity;
import jakarta.annotation.PostConstruct;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class DriverMapper extends AbstractMapper<DriverEntity, DriverDto> {

    private final ModelMapper mapper;
    private final TruckRepository truckRepository;
    private final CityRepository cityRepository;

    @Autowired
    DriverMapper(Class<DriverEntity> entityClass, Class<DriverDto> dtoClass, ModelMapper mapper, TruckRepository truckRepository, CityRepository cityRepository) {
        super(entityClass, dtoClass);
        this.mapper = mapper;
        this.truckRepository = truckRepository;
        this.cityRepository = cityRepository;
    }

    @PostConstruct
    public void setupMapper() {
        mapper.createTypeMap(DriverEntity.class, DriverDto.class)
                .addMappings(m -> m.skip(DriverDto::setTrackId))
                .addMappings(m -> m.skip(DriverDto::setCityId)).setPostConverter(toDtoConverter());
        mapper.createTypeMap(DriverDto.class, DriverEntity.class)
                .addMappings(m -> m.skip(DriverEntity::setCurrentTruck))
                .addMappings(m -> m.skip(DriverEntity::setLocationCity)).setPostConverter(toEntityConverter());
    }

    @Override
    void mapSpecificFields(DriverEntity source, DriverDto destination) {
        destination.setTrackId(getTruckId(source));
        destination.setCityId(getCityId(source));
    }

    private Long getTruckId(DriverEntity driver) {
        return Objects.isNull(driver) || Objects.isNull(driver.getId()) ? null : driver.getCurrentTruck().getId();
    }

    private Long getCityId(DriverEntity driver) {
        return Objects.isNull(driver) || Objects.isNull(driver.getId()) ? null : driver.getLocationCity().getId();
    }

    @Override
    void mapSpecificFields(DriverDto source, DriverEntity destination) {
        destination.setCurrentTruck(truckRepository.findById(source.getTrackId()).orElse(null));
        destination.setLocationCity(cityRepository.findById(source.getCityId()).orElse(null));
    }
}
