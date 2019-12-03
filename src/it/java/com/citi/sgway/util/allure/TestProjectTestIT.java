package com.citi.sgway.util.allure;

import com.citi.sgway.util.allure.data.entity.TestProject;
import com.citi.sgway.util.allure.web.rest.ProjectTestController;
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
@Epic("TestProject")
@Tag("IntegrationTest")
public class TestProjectTestIT {

	private static final Logger LOGGER = LogManager.getLogger(TestProjectTestIT.class);

	@Autowired
	private ProjectTestController projectTestController;

	@Owner("Reimy")
	@Issue("Find all menu method")
	@Test
	public void testFindAll() {
		List<TestProject> testProjects = projectTestController.findAll();
		LOGGER.info(new Gson().toJson(testProjects));
		Assertions.assertTrue(testProjects.size() > 0);
	}

	@Owner("Reimy")
	@Issue("Find all menu method")
	@Test
	public void testFindById() {
		TestProject testProject = projectTestController.findById(1L);
		LOGGER.info(new Gson().toJson(testProject));
		Assertions.assertNotNull(testProject);
	}

	@Owner("Reimy")
	@Issue("Find all menu method")
	@Test
	public void testFindAllWithPageable() {
		Pageable pageable = PageRequest.of(0, 5, Sort.by(
				Order.asc("name"),
				Order.desc("id")));
		Page<TestProject> menus = projectTestController.findAll(pageable);
		LOGGER.info(new Gson().toJson(menus));
		Assertions.assertTrue(menus.getSize() > 0);
	}


	@Owner("Reimy")
	@Issue("Find all menu method")
	@Test
	public void testCreate() {
		TestProject testProject = new TestProject();
		testProject.setCreatedDate(LocalDateTime.now());
		testProject.setDescription("Hello");
		testProject.setName("SG-SIM");
		testProject.setPath("/test/sg-sim");
		TestProject testProjectReturned = projectTestController.create(testProject);
		LOGGER.info(new Gson().toJson(testProjectReturned));
		Assertions.assertNotNull(testProject);
	}


	@Owner("Reimy")
	@Issue("Edit method from menu")
	@Test
	public void testEdit() {
		TestProject testProjectToEdit = projectTestController.findById(1L);
		testProjectToEdit.setName("SG-ACSM");
		TestProject testProject = projectTestController.edit(testProjectToEdit.getId(), testProjectToEdit);
		LOGGER.info(new Gson().toJson(testProject));
		Assertions.assertNotNull(testProject);
	}

	@Owner("Reimy")
	@Issue("Delete method from menu")
	@Test
	public void testDelete() {
		projectTestController.delete(3L);
	}
}
