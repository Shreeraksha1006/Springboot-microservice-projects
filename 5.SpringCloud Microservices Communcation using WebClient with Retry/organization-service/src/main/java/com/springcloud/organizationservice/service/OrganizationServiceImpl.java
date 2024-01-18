package com.springcloud.organizationservice.service;

import com.springcloud.organizationservice.dto.OrganizationDto;
import com.springcloud.organizationservice.entity.Organization;
import com.springcloud.organizationservice.mapper.Mapper;
import com.springcloud.organizationservice.repository.OrganizationRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class OrganizationServiceImpl implements OrganizationService{
   private OrganizationRepository organizationRepository;
   private Mapper mapper;
    @Override
    public OrganizationDto save(OrganizationDto dto) {
        System.out.println(dto+"============================2");
        Organization organization=mapper.mapToOrganization(dto);
        System.out.println(organization+"============================3");
        System.out.println(organization);
        Organization savedOrg=organizationRepository.save(organization);
        System.out.println(savedOrg);
        return mapper.mapToOrganizationDto(savedOrg);
    }


    @Override
    public OrganizationDto getByCode(String code) {

       Organization organization= organizationRepository.findByOrganizationCode(code);
        return mapper.mapToOrganizationDto(organization);

    }


}
