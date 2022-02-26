package com.example.dockertest.service;

import com.example.dockertest.domain.TestEntity;
import com.example.dockertest.repository.TestRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TestService {
    private final TestRepository testRepository;

    public List<TestEntity> test() {
        return testRepository.findAll();
    }
}
