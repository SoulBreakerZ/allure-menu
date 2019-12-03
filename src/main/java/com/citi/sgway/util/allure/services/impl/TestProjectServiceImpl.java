package com.citi.sgway.util.allure.services.impl;

import java.util.List;

import com.citi.sgway.util.allure.data.entity.TestProject;
import com.citi.sgway.util.allure.services.TestProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.citi.sgway.util.allure.data.DAOTestProject;

@Service
public class TestProjectServiceImpl implements TestProjectService {

	@Autowired
	private DAOTestProject daoTestProject;

	@Override
	@Transactional(readOnly=true)
	public List<TestProject> findAll() {
		return (List<TestProject>) daoTestProject.findAll();
	}

	@Override
	@Transactional(readOnly=true)
	public Page<TestProject> findAll(Pageable pageable) {
		return daoTestProject.findAll(pageable);
	}

	@Override
	@Transactional
	public TestProject save(TestProject testProject) {
		return daoTestProject.save(testProject);
	}

	@Override
	@Transactional(readOnly=true)
	public TestProject findOne(Long id) {
		return daoTestProject.findById(id).orElse(null);
	}

	@Override
	public List<TestProject> findByProjectId(Long projectId) {
		return daoTestProject.findByProjectId(projectId);
	}

	@Override
	public TestProject findByBranchId(Long branchId) {
		return daoTestProject.findByBranchId(branchId);
	}

	@Override
	public TestProject findByProjectIdAndBranchId(Long projectId, Long branchId) {
		return daoTestProject.findByProjectIdAndBranchId(projectId,branchId);
	}

	@Override
	@Transactional
	public void deleteById(Long id) {
		daoTestProject.deleteById(id);
	}

}
