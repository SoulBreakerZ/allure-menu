package com.citi.sgway.util.allure;

import com.citi.sgway.util.allure.data.entity.Menu;
import com.citi.sgway.util.allure.web.rest.MenuController;
import com.google.gson.Gson;
import io.qameta.allure.Epic;
import io.qameta.allure.Issue;
import io.qameta.allure.Owner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Order;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.time.LocalDateTime;
import java.util.List;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@ContextConfiguration(classes = {Application.class})
@Epic("Menu")
@Tag("IntegrationTest")
public class MenuTestIT {

	private static final Logger LOGGER = LogManager.getLogger(MenuTestIT.class);

	@Autowired
	private MenuController menuController;

	@Owner("Reimy")
	@Issue("Find all menu method")
	@Test
	public void testFindAll() {
		List<Menu> menus = menuController.findAll();
		LOGGER.info(new Gson().toJson(menus));
		Assertions.assertTrue(menus.size() > 0);
	}

	@Owner("Reimy")
	@Issue("Find all menu method")
	@Test
	public void testFindById() {
		Menu menu = menuController.findById(1L);
		LOGGER.info(new Gson().toJson(menu));
		Assertions.assertNotNull(menu);
	}

	@Owner("Reimy")
	@Issue("Find all menu method")
	@Test
	public void testFindAllWithPageable() {
		Pageable pageable = PageRequest.of(0, 5, Sort.by(
				Order.asc("name"),
				Order.desc("id")));
		Page<Menu> menus = menuController.findAll(pageable);
		LOGGER.info(new Gson().toJson(menus));
		Assertions.assertTrue(menus.getSize() > 0);
	}


	@Owner("Reimy")
	@Issue("Find all menu method")
	@Test
	public void testCreate() {
		Menu menu = new Menu();
		menu.setCreatedDate(LocalDateTime.now());
		menu.setDescription("Hello");
		menu.setName("SG-SIM");
		menu.setPath("/test/sg-sim");
		Menu menuReturned = menuController.create(menu);
		LOGGER.info(new Gson().toJson(menuReturned));
		Assertions.assertNotNull(menu);
	}


	@Owner("Reimy")
	@Issue("Edit method from menu")
	@Test
	public void testEdit() {
		Menu menuToEdit = menuController.findById(1L);
		menuToEdit.setName("SG-ACSM");
		Menu menu = menuController.edit(menuToEdit.getId(),menuToEdit);
		LOGGER.info(new Gson().toJson(menu));
		Assertions.assertNotNull(menu);
	}

	@Owner("Reimy")
	@Issue("Delete method from menu")
	@Test
	public void testDelete() {
		menuController.delete(3L);
	}
}
