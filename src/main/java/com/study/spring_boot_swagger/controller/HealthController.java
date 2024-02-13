package com.study.spring_boot_swagger.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
@Tag(name = "Health 컨트롤러", description = "정상 작동 확인 API 입니다.")
public class HealthController {


    @Operation(summary = "API 확인", description = "정상 작동 확인")
    @GetMapping
    public String health() {
      return "health good~!";
    }
}
