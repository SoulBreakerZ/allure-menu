package com.citi.sgway.util.allure.services.impl;

import java.util.List;

import com.citi.sgway.util.allure.data.entity.Menu;
import com.citi.sgway.util.allure.services.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.citi.sgway.util.allure.data.DAOMenu;

@Service
public class MenuServiceImpl implements MenuService {

	@Autowired
	private DAOMenu DAOMenu;

	@Override
	@Transactional(readOnly=true)
	public List<Menu> findAll() {
		return (List<Menu>) DAOMenu.findAll();
	}

	@Override
	@Transactional(readOnly=true)
	public Page<Menu> findAll(Pageable pageable) {
		return DAOMenu.findAll(pageable);
	}

	@Override
	@Transactional
	public Menu save(Menu menu) {
		return DAOMenu.save(menu);
	}

	@Override
	@Transactional(readOnly=true)
	public Menu findOne(Long id) {
		return DAOMenu.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void deleteById(Long id) {
		DAOMenu.deleteById(id);
	}

}
