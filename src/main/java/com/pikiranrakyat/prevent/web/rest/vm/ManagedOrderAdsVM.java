package com.pikiranrakyat.prevent.web.rest.vm;

import com.pikiranrakyat.prevent.domain.OrderAds;
import com.pikiranrakyat.prevent.service.dto.OrderAdsDTO;

import java.time.ZonedDateTime;

/**
 * View Model extending the UserDTO, which is meant to be used in the user management UI.
 */
public class ManagedOrderAdsVM extends OrderAdsDTO {


    private Long id;

    private String createdBy;

    private ZonedDateTime createdDate;

    private String lastModifiedBy;

    private ZonedDateTime lastModifiedDate;

    public ManagedOrderAdsVM() {
    }

    public ManagedOrderAdsVM(OrderAds o) {
        super(o);
        this.id = o.getId();
        this.createdBy = o.getCreatedBy();
        this.createdDate = o.getCreatedDate();
        this.lastModifiedBy = o.getLastModifiedBy();
        this.lastModifiedDate = o.getLastModifiedDate();
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public ZonedDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(ZonedDateTime createdDate) {
        this.createdDate = createdDate;
    }

    public String getLastModifiedBy() {
        return lastModifiedBy;
    }

    public void setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    public ZonedDateTime getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(ZonedDateTime lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    @Override
    public String toString() {
        return "ManagedOrderAdsVM{" +
            "id=" + id +
            ", createdBy=" + createdBy +
            ", createdDate=" + createdDate +
            ", lastModifiedBy='" + lastModifiedBy + '\'' +
            ", lastModifiedDate=" + lastModifiedDate +
            "} " + super.toString();
    }
}
