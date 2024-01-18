package com.springcloud.organizationservice.mapper;

import com.springcloud.organizationservice.dto.OrganizationDto;
import com.springcloud.organizationservice.entity.Organization;

public interface Mapper {
   public Organization mapToOrganization(OrganizationDto dto);
   public OrganizationDto mapToOrganizationDto(Organization org);

}
