package com.fakedomain.demo.sys.service.impl;

import com.fakedomain.demo.sys.mapper.SysTenantMapper;
import com.fakedomain.demo.sys.pojo.po.SysTenant;
import com.fakedomain.demo.sys.service.ISysTenantService;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

/**
 * @author Camio1945
 */
@ApplicationScoped
public class SysTenantServiceImpl implements ISysTenantService {
  @Inject private SysTenantMapper sysTenantMapper;

  @Override
  public SysTenant getById(Long id) {
    return sysTenantMapper.selectById(id);
  }

  @Override
  public boolean add(SysTenant sysTenant) {
    return sysTenantMapper.insert(sysTenant) > 0;
  }

  @Override
  public boolean update(SysTenant sysTenant) {
    return sysTenantMapper.updateById(sysTenant) > 0;
  }

  @Override
  public boolean delete(Long id) {
    return sysTenantMapper.deleteById(id) > 0;
  }
}
