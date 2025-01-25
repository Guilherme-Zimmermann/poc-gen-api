package com.will.poc_gen_api.resources;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api")
@CrossOrigin("*")
public class CodeResource {

  private String code;

  @PostMapping()
  public ResponseEntity<Void> reciveCode(@RequestBody String code) {
    this.code = code;
    return ResponseEntity.ok().build();
  }

  @GetMapping()
  public ResponseEntity<String> getCode() {
    return ResponseEntity.ok().body(this.code);
  }
}
