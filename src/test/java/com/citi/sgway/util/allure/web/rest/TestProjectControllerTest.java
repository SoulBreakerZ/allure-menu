package com.citi.sgway.util.allure.web.rest;

import com.citi.sgway.util.allure.services.ProjectTestService;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

@Tag("UnitTest")
@ExtendWith(MockitoExtension.class)
@SpringBootTest
public class TestProjectControllerTest {


    @InjectMocks
    private ProjectTestService projectTestService;

    @Test
    public void testFindAll() {
    }

    @Test
    public void testFindAllWithPageable() {
    }

    @Test
    public void testFindById() {
    }

    @Test
    public void testCreate() {
    }

    @Test
    public void testEdit() {
    }

    @Test
    public void testDelete() {
    }
}