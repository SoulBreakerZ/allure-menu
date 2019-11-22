package com.citi.sgway.util.allure.data;

import com.citi.sgway.util.allure.data.entity.Menu;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DAOMenu extends PagingAndSortingRepository<Menu, Long> {

}


