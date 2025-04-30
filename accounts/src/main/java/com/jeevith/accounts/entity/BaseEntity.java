package com.jeevith.accounts.entity;

import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

@MappedSuperclass
@Getter
@Setter
public class BaseEntity {

    @column(updatable = false)
    public localDateTime createdAt;

    @column(updatable = false)
    public String createdBy;

    @column(insertable = false)
    public localDateTime updatedAt;

    @column(insertable = false)
    public String updatedBy;

}
