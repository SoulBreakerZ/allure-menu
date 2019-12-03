package com.citi.sgway.util.allure.services.impl;

import com.citi.sgway.util.allure.data.DAOProject;
import com.citi.sgway.util.allure.data.entity.Project;
import com.citi.sgway.util.allure.services.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProjectServiceImpl implements ProjectService {

	@Autowired
	private DAOProject daoProject;

	@Override
	@Transactional(readOnly=true)
	public List<Project> findAll() {
		return (List<Project>) daoProject.findAll();
	}

	@Override
	@Transactional(readOnly=true)
	public Page<Project> findAll(Pageable pageable) {
		return daoProject.findAll(pageable);
	}

	@Override
	@Transactional
	public Project save(Project projectBranch) {
		return daoProject.save(projectBranch);
	}

	@Override
	@Transactional(readOnly=true)
	public Project findOne(Long id) {
		return daoProject.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void deleteById(Long id) {
		daoProject.deleteById(id);
	}

}
