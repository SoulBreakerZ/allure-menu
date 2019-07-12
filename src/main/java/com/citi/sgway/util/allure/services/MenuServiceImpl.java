package com.citi.sgway.util.allure.services;

import java.util.List;

import com.citi.sgway.util.allure.models.entity.Menu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.citi.sgway.util.allure.dao.MenuDAO;

@Service
public class MenuServiceImpl implements MenuService {

	@Autowired
	private MenuDAO menuDAO;

	@Override
	@Transactional(readOnly=true)
	public List<Menu> findAll() {
		return (List<Menu>) menuDAO.findAll();
	}

	@Override
	@Transactional
	public Menu save(Menu menu) {
		return menuDAO.save(menu);
	}

	@Override
	@Transactional(readOnly=true)
	public Menu findOne(Long id) {
		return menuDAO.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void deleteById(Long id) {
		menuDAO.deleteById(id);
	}

	@Override
	public Page<Menu> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return menuDAO.findAll(pageable);
	}

}
