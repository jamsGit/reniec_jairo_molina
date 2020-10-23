package com.reniec.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.reniec.models.ReniecResponse;

import io.reactivex.Single;

@RestController
@RequestMapping(path = "/external/reniec")
public class ReniecResponseController {

  @Value("${entityName}")
  String entityName;
  @Value("${success}")
  boolean success;
  @PostMapping("/validate")
  public Single<ReniecResponse>responseReniec(@RequestBody String document) {
    return Single.just(new ReniecResponse(entityName, success));
  }

 
  
  
  

}