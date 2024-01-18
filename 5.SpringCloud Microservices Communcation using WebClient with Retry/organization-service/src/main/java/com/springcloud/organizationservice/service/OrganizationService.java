package com.springcloud.organizationservice.service;

import com.springcloud.organizationservice.dto.OrganizationDto;

public interface OrganizationService {
    public OrganizationDto save(OrganizationDto dto);

    public OrganizationDto getByCode(String code);

}
