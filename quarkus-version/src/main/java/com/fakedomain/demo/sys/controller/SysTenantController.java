package com.fakedomain.demo.sys.controller;

import com.fakedomain.demo.sys.pojo.po.SysTenant;
import com.fakedomain.demo.sys.service.ISysTenantService;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;

@Path("/sys/tenant")
public class SysTenantController {
  @Inject ISysTenantService sysTenantService;

  @GET
  @Path("/{id}")
  public SysTenant getById(@PathParam("id") Long id) {
    return sysTenantService.getById(id);
  }

  @POST
  public boolean add(SysTenant sysTenant) {
    return sysTenantService.add(sysTenant);
  }

  @PATCH
  public boolean update(SysTenant sysTenant) {
    return sysTenantService.update(sysTenant);
  }

  @DELETE
  @Path("/{id}")
  public boolean delete(@PathParam("id") Long id) {
    return sysTenantService.delete(id);
  }
}
