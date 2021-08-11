package com.citi.sgway.util.allure.services;

import com.citi.sgway.util.allure.data.entity.Branch;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;


public interface BranchService {

	List<Branch> findAllByProjectId(Long projectId);

	Page<Branch> findAll(Pageable pageable);

	Branch save(Branch branch);

	Branch findById(Long id);

	void deleteById(Long id);

}
