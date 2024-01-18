package com.springcloud.organizationservice.repository;

import com.springcloud.organizationservice.entity.Organization;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrganizationRepository extends JpaRepository<Organization,Long> {
public Organization findByOrganizationCode(String organizationCode);

}
