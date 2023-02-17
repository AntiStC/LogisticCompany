package com.example.logisticcompany.model.mapper;

import com.example.logisticcompany.dao.CargoRepository;
import com.example.logisticcompany.dao.CityRepository;
import com.example.logisticcompany.model.dto.ListOfWaypointsDto;
import com.example.logisticcompany.model.entity.ListOfWaypointsEntity;
import jakarta.annotation.PostConstruct;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class ListOfWayPointMapper extends AbstractMapper<ListOfWaypointsEntity, ListOfWaypointsDto> {

    private final ModelMapper mapper;
    private final CityRepository cityRepository;
    private final CargoRepository cargoRepository;

    @Autowired
    ListOfWayPointMapper(Class<ListOfWaypointsEntity> entityClass, Class<ListOfWaypointsDto> dtoClass, ModelMapper mapper, CityRepository cityRepository, CargoRepository cargoRepository) {
        super(entityClass, dtoClass);
        this.mapper = mapper;
        this.cityRepository = cityRepository;
        this.cargoRepository = cargoRepository;
    }

    @PostConstruct
    public void setMapper() {
        mapper.createTypeMap(ListOfWaypointsEntity.class, ListOfWaypointsDto.class)
                .addMappings(m -> m.skip(ListOfWaypointsDto::setCityId))
                .addMappings(m -> m.skip(ListOfWaypointsDto::setCargoId)).setPostConverter(toDtoConverter());
        mapper.createTypeMap(ListOfWaypointsDto.class, ListOfWaypointsEntity.class)
                .addMappings(m -> m.skip(ListOfWaypointsEntity::setCity))
                .addMappings(m -> m.skip(ListOfWaypointsEntity::setCargo)).setPostConverter(toEntityConverter());
    }

    @Override
    void mapSpecificFields(ListOfWaypointsEntity source, ListOfWaypointsDto destination) {
        destination.setCityId(getCityId(source));
        destination.setCargoId(getCargoId(source));
    }

    private Long getCityId(ListOfWaypointsEntity waypoints) {
        return Objects.isNull(waypoints) || Objects.isNull(waypoints.getId()) ? null : waypoints.getCity().getId();
    }

    private Long getCargoId(ListOfWaypointsEntity waypoints) {
        return Objects.isNull(waypoints) || Objects.isNull(waypoints.getId()) ? null : waypoints.getCargo().getId();
    }

    @Override
    void mapSpecificFields(ListOfWaypointsDto source, ListOfWaypointsEntity destination) {
        destination.setCity(cityRepository.findById(source.getCityId()).orElse(null));
        destination.setCargo(cargoRepository.findById(source.getCargoId()).orElse(null));
    }
}
