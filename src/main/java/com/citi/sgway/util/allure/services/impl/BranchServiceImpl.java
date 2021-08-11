package com.citi.sgway.util.allure.services.impl;

import com.citi.sgway.util.allure.data.BranchDAO;
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
	private BranchDAO branchDAO;

	@Override
	@Transactional(readOnly=true)
	public List<Branch> findAllByProjectId(Long id) {
		return branchDAO.findByProject_id(id);
	}

	@Override
	@Transactional(readOnly=true)
	public Page<Branch> findAll(Pageable pageable) {
		return branchDAO.findAll(pageable);
	}

	@Override
	public Branch save(Branch branch) {
		return branchDAO.save(branch);
	}

	@Override
	@Transactional(readOnly=true)
	public Branch findById(Long id) {
		return branchDAO.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void deleteById(Long id) {
		branchDAO.deleteById(id);
	}

}
