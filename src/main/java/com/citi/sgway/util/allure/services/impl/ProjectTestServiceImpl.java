package com.citi.sgway.util.allure.services.impl;

import java.util.List;

import com.citi.sgway.util.allure.data.entity.TestProject;
import com.citi.sgway.util.allure.services.ProjectTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.citi.sgway.util.allure.data.DAOProjectBranch;

@Service
public class ProjectTestServiceImpl implements ProjectTestService {

	@Autowired
	private DAOProjectBranch daoProjectBranch;

	@Override
	@Transactional(readOnly=true)
	public List<TestProject> findAll() {
		return (List<TestProject>) daoProjectBranch.findAll();
	}

	@Override
	@Transactional(readOnly=true)
	public Page<TestProject> findAll(Pageable pageable) {
		return daoProjectBranch.findAll(pageable);
	}

	@Override
	@Transactional
	public TestProject save(TestProject testProject) {
		return daoProjectBranch.save(testProject);
	}

	@Override
	@Transactional(readOnly=true)
	public TestProject findOne(Long id) {
		return daoProjectBranch.findById(id).orElse(null);
	}

	@Override
	public List<TestProject> findByProjectId(Long projectId) {
		return daoProjectBranch.findByProject(projectId);
	}

	@Override
	public TestProject findByBranchId(Long branchId) {
		return daoProjectBranch.findByBranch(branchId);
	}

	@Override
	public TestProject findByProjectIdAndBranchId(Long projectId, Long branchId) {
		return daoProjectBranch.findByProjectAndBranch(projectId,branchId);
	}

	@Override
	@Transactional
	public void deleteById(Long id) {
		daoProjectBranch.deleteById(id);
	}

}
