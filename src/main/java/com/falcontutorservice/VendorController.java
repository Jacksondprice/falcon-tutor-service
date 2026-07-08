package com.falcontutorservice;

import java.util.List;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/vendors")
public class VendorController {
  @GetMapping
  public List<String> list() {
    return List.of("sample");
  }
}
