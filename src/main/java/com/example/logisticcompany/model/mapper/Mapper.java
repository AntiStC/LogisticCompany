package com.example.logisticcompany.model.mapper;

import com.example.logisticcompany.model.dto.AbstractDto;
import com.example.logisticcompany.model.entity.AbstractEntity;

public interface Mapper<E extends AbstractEntity, D extends AbstractDto> {

    E toEntity(D dto);

    D toDto(E entity);
}
