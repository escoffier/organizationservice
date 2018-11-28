package com.organization.service;

import com.organization.Mapper.OrganizationMapper;
import com.organization.model.Organization;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrganizationService {

    @Autowired
    private OrganizationMapper organizationMapper = null;

    public Organization getOrg(Long organizationId){
        return organizationMapper.getOrg(organizationId);

    }

    public void saveOrg(Organization org){
        organizationMapper.saveOrg(org);
    }

    public void updateOrg(Organization org){

    }

    public void deleteOrg(Long organizationId){
        organizationMapper.deleteOrg(organizationId);
    }
}
