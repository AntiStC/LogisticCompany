package com.example.logisticcompany.model.dto;

import java.io.Serializable;
import java.util.Objects;

public abstract class AbstractDto implements Serializable {

    private Long id;

    public AbstractDto() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AbstractDto that)) return false;
        return getId().equals(that.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public String toString() {
        return """
                AbstractDto{
                    id=$id
                }""";
    }
}
