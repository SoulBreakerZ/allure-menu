package com.citi.sgway.util.allure.services;

import java.util.List;

import com.citi.sgway.util.allure.data.entity.TestProject;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


public interface TestProjectService {
	List<TestProject> findAll();

	Page<TestProject> findAll(Pageable pageable);

	TestProject save(TestProject testProject);

	TestProject findOne(Long id);

	List<TestProject> findByProjectId(Long projectId);

	TestProject findByBranchId(Long branchId);

	TestProject findByProjectIdAndBranchId(Long projectId,Long branchId);

	void deleteById(Long id);
}
