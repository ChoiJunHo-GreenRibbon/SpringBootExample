package com.junho.test.dto;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Map;

@Getter
@Setter
@ToString
public class TestResponse {
    private Map<String, Object> response;

    public TestResponse(Map<String, Object> response) {
        this.response = response;
    }
}
