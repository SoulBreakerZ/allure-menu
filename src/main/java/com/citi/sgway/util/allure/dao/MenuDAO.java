package com.citi.sgway.util.allure.dao;

import com.citi.sgway.util.allure.models.entity.Menu;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface MenuDAO extends PagingAndSortingRepository<Menu, Long> {

}


