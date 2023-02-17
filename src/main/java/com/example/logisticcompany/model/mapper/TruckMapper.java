package com.example.logisticcompany.model.mapper;

import com.example.logisticcompany.dao.CityRepository;
import com.example.logisticcompany.model.dto.TruckDto;
import com.example.logisticcompany.model.entity.TruckEntity;
import jakarta.annotation.PostConstruct;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class TruckMapper extends AbstractMapper<TruckEntity, TruckDto> {

    private final ModelMapper mapper;
    private final CityRepository cityRepository;

    @Autowired
    TruckMapper(Class<TruckEntity> entityClass, Class<TruckDto> dtoClass, ModelMapper mapper, CityRepository cityRepository) {
        super(entityClass, dtoClass);
        this.mapper = mapper;
        this.cityRepository = cityRepository;
    }

    @PostConstruct
    public void setMapper() {
        mapper.createTypeMap(TruckEntity.class, TruckDto.class)
                .addMappings(m -> m.skip(TruckDto::setCityId)).setPostConverter(toDtoConverter());
        mapper.createTypeMap(TruckDto.class, TruckEntity.class)
                .addMappings(m -> m.skip(TruckEntity::setCity)).setPostConverter(toEntityConverter());
    }

    @Override
    void mapSpecificFields(TruckEntity source, TruckDto destination) {
        destination.setCityId(getCityId(source));
    }

    private Long getCityId(TruckEntity truck) {
        return Objects.isNull(truck) || Objects.isNull(truck.getId()) ? null : truck.getCity().getId();
    }

    @Override
    void mapSpecificFields(TruckDto source, TruckEntity destination) {
        destination.setCity(cityRepository.findById(source.getCityId()).orElse(null));
    }
}
