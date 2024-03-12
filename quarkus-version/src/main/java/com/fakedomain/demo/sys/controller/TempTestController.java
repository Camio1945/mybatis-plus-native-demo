package com.fakedomain.demo.sys.controller;

import com.fakedomain.demo.sys.mapper.SysTenantMapper;
import com.fakedomain.demo.sys.pojo.po.SysTenant;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

/**
 * 临时测试控制器
 *
 * @author Camio1945
 */
@Path("/temp/test")
public class TempTestController {
  @Inject private SysTenantMapper sysTenantMapper;

  @GET
  public String test() {
    SysTenant sysTenant = sysTenantMapper.selectByIdTest(3L);
    return sysTenant.getCode();
  }
}
