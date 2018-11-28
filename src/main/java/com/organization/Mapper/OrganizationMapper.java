package com.organization.Mapper;

import com.organization.model.Organization;

public interface OrganizationMapper {

    public Organization getOrg(Long organizationId);

    public void saveOrg(Organization org);

    //public void updateOrg(Organization org);

    public void deleteOrg(Long organizationId);
}
