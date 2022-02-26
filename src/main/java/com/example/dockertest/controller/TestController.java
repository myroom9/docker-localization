package com.example.dockertest.controller;

import com.example.dockertest.domain.TestEntity;
import com.example.dockertest.service.TestService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
public class TestController {

    private final TestService testService;

    @GetMapping
    public List<TestEntity> test() {
        log.info("request");
        return testService.test();
    }
}
