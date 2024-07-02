package com.fakedomain.demo.sys.controller;

import com.fakedomain.demo.sys.mapper.SysTenantMapper;
import com.fakedomain.demo.sys.pojo.po.SysTenant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 临时测试控制器
 *
 * @author Camio1945
 */
@RestController
@RequestMapping("/temp/test")
public class TempTestController {
  @Autowired private SysTenantMapper sysTenantMapper;

  @GetMapping
  public String test() {
    SysTenant sysTenant = sysTenantMapper.selectByIdTest(3L);
    return sysTenant.getCode();
  }
}
