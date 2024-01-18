package com.springcloud.organizationservice.mapper;

import com.springcloud.organizationservice.dto.OrganizationDto;
import com.springcloud.organizationservice.entity.Organization;
import org.springframework.stereotype.Component;

@Component
public class MapperImpl implements Mapper{
    @Override
    public Organization mapToOrganization(OrganizationDto dto) {
        return new Organization(
                dto.getId(),
                dto.getOrganizationName(),
                dto.getOrganizationDescription(),
                dto.getOrganizationCode(),
                dto.getCreatedTime());
    }

    @Override
    public OrganizationDto mapToOrganizationDto(Organization org) {
        return new OrganizationDto(
                org.getId(),
                org.getOrganizationName(),
                org.getOrganizationDescription(),
                org.getOrganizationCode(),
                org.getCreatedTime());
    }
    }

