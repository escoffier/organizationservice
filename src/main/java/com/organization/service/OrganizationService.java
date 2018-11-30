package com.organization.service;

import com.organization.Mapper.OrganizationMapper;
import com.organization.events.SimpleSourceBean;
import com.organization.model.Organization;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrganizationService {

    @Autowired
    private OrganizationMapper organizationMapper = null;

    @Autowired
    private SimpleSourceBean simpleSourceBean;

    public Organization getOrg(Long organizationId){
        simpleSourceBean.publishOrg("get", organizationId);
        return organizationMapper.getOrg(organizationId);

    }

    public void saveOrg(Organization org){

        simpleSourceBean.publishOrg("save", org.getId());
        organizationMapper.saveOrg(org);
    }

    public void updateOrg(Organization org){
        simpleSourceBean.publishOrg("update", org.getId());
        organizationMapper.updateOrg(org);
    }

    public void deleteOrg(Long organizationId){
        simpleSourceBean.publishOrg("delete", organizationId);
        organizationMapper.deleteOrg(organizationId);
    }
}
