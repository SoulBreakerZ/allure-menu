package com.citi.sgway.util.allure.services;

import com.citi.sgway.util.allure.data.entity.Project;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;


public interface ProjectService {
	List<Project> findAll();

	Page<Project> findAll(Pageable pageable);

	Project save(Project projectBranch);

	Project findOne(Long id);

	void deleteById(Long id);
}
