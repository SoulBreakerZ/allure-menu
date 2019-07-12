package com.citi.sgway.util.allure.services;

import java.util.List;

import com.citi.sgway.util.allure.models.entity.Menu;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


public interface MenuService {
	public List<Menu> findAll();

	public Page<Menu> findAll(Pageable pageable);

	public Menu save(Menu menu);

	public Menu findOne(Long id);

	public void deleteById(Long id);
}
