package com.example.logisticcompany.model.mapper;

import com.example.logisticcompany.dao.TruckRepository;
import com.example.logisticcompany.model.dto.OrderDto;
import com.example.logisticcompany.model.entity.OrderEntity;
import jakarta.annotation.PostConstruct;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class OrderMapper extends AbstractMapper<OrderEntity, OrderDto> {

    private final ModelMapper mapper;
    private final TruckRepository truckRepository;

    @Autowired
    OrderMapper(Class<OrderEntity> entityClass, Class<OrderDto> dtoClass, ModelMapper mapper, TruckRepository truckRepository1) {
        super(entityClass, dtoClass);
        this.mapper = mapper;
        this.truckRepository = truckRepository1;
    }

    @PostConstruct
    public void setupMapper() {
        mapper.createTypeMap(OrderEntity.class, OrderDto.class)
                .addMappings(m -> m.skip(OrderDto::setTrack)).setPostConverter(toDtoConverter());
        mapper.createTypeMap(OrderDto.class, OrderEntity.class)
                .addMappings(m -> m.skip(OrderEntity::setTruck)).setPostConverter(toEntityConverter());
    }

    @Override
    void mapSpecificFields(OrderEntity source, OrderDto destination) {
        destination.setTrack(getTruckId(source));
    }

    private Long getTruckId(OrderEntity order) {
        return Objects.isNull(order) || Objects.isNull(order.getId()) ? null : order.getTruck().getId();
    }

    @Override
    void mapSpecificFields(OrderDto source, OrderEntity destination) {
        destination.setTruck(truckRepository.findById(source.getTrack()).orElse(null));
    }
}
