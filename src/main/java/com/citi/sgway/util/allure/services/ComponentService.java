package com.citi.sgway.util.allure.services;

import java.util.List;

import com.citi.sgway.util.allure.data.entity.Component;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


public interface ComponentService {

	Page<Component> findAll(Pageable pageable);

	Component save(Component testProject);

	Component findById(Long id);

	void deleteById(Long id);
}
