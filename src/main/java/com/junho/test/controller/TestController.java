package com.junho.test.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@Slf4j
@RestController
@Api(value = "TestController V1")
@RequestMapping("api/v1/test")
public class TestController {

    @ApiOperation(value = "test", notes = "controller 테스트 코드 입니다.")
    @GetMapping
    public ResponseEntity<?>  getTest() {
        Map<String, Object> result = new HashMap<>();
        result.put("name", "junho");
        result.put("age", "12");
        return ResponseEntity.ok(result);
    }
}
