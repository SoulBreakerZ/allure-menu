package com.citi.sgway.util.allure.services.impl;

import com.citi.sgway.util.allure.data.DAOBranch;
import com.citi.sgway.util.allure.data.DAOProject;
import com.citi.sgway.util.allure.data.entity.Branch;
import com.citi.sgway.util.allure.services.BranchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class BranchServiceImpl implements BranchService {

	@Autowired
	private DAOBranch daoBranch;

	@Override
	@Transactional(readOnly=true)
	public List<Branch> findAll() {
		return (List<Branch>) daoBranch.findAll();
	}

	@Override
	public List<Branch> findAllByProjectId(Long id) {
		return (List<Branch>) daoBranch.findByProject_id(id);
	}

	@Override
	@Transactional(readOnly=true)
	public Page<Branch> findAll(Pageable pageable) {
		return daoBranch.findAll(pageable);
	}

	@Override
	@Transactional
	public Branch save(Branch branch) {
		return daoBranch.save(branch);
	}

	@Override
	@Transactional(readOnly=true)
	public Branch findOne(Long id) {
		return daoBranch.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void deleteById(Long id) {
        daoBranch.deleteById(id);
	}

}
