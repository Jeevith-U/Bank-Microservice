package com.jeevith.accounts.entity;

import jakarta.persistence.* ;
import jakarta.persistence.Column;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;

@MappedSuperclass
@Getter
@Setter
public class BaseEntity {

    @Column  (updatable = false)
    public LocalDateTime createdAt;

    @Column(updatable = false)
    public String createdBy;

    @Column(insertable = false)
    public LocalDateTime updatedAt;

    @Column(insertable = false)
    public String updatedBy;

}
