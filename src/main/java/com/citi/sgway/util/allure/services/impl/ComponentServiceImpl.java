package com.citi.sgway.util.allure.services.impl;

import com.citi.sgway.util.allure.data.entity.Component;
import com.citi.sgway.util.allure.services.ComponentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.citi.sgway.util.allure.data.ComponentDAO;

@Service
public class ComponentServiceImpl implements ComponentService {

	@Autowired
	private ComponentDAO componentDAO;

	@Override
	@Transactional(readOnly=true)
	public Page<Component> findAll(Pageable pageable) {
		return componentDAO.findAll(pageable);
	}

	@Override
	@Transactional
	public Component save(Component testProject) {
		return componentDAO.save(testProject);
	}

	@Override
	@Transactional(readOnly=true)
	public Component findById(Long id) {
		return componentDAO.findById(id).get();
	}

	@Override
	@Transactional
	public void deleteById(Long id) {
		componentDAO.deleteById(id);
	}

}
