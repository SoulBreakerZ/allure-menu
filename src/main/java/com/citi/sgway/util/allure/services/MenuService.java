package com.citi.sgway.util.allure.services;

import java.util.List;

import com.citi.sgway.util.allure.data.entity.Menu;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


public interface MenuService {
	List<Menu> findAll();

	Page<Menu> findAll(Pageable pageable);

	Menu save(Menu menu);

	Menu findOne(Long id);

	void deleteById(Long id);
}
