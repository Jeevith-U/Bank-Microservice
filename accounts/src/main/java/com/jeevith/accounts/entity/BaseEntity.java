package com.jeevith.accounts.entity;

import jakarta.persistence.* ;
import jakarta.persistence.Column;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@MappedSuperclass
@Getter
@Setter
@EntityListeners(AuditingEntityListener.class)
public class BaseEntity {

    @CreatedDate
    @Column  (updatable = false)
    public LocalDateTime createdAt;

    @CreatedBy
    @Column(updatable = false)
    public String createdBy;

    @LastModifiedDate
    @Column(insertable = false)
    public LocalDateTime updatedAt;

    @LastModifiedBy
    @Column(insertable = false)
    public String updatedBy;

}
