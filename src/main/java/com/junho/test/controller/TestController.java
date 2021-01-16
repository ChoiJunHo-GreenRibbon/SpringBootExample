package com.junho.test.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@Api(value = "TestController V1")
@RequestMapping("api/v1/test")
public class TestController {

    @ApiOperation(value = "exam", notes = "테스트 코드 입니다.")
    @ApiResponses({
            @ApiResponse(code = 200, message = "OK!!"),
            @ApiResponse(code = 500, message = "Internal Server Error"),
            @ApiResponse(code = 404, message = "Not Found Web page")
    })

    @GetMapping("/test")
    public Map<String, Object> getTest() {
        Map<String, Object> result = new HashMap<>();
        result.put("name", "junho");
        result.put("age", "12");
        return result;
    }
}
