package com.citi.sgway.util.allure.data;

import com.citi.sgway.util.allure.data.entity.Component;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComponentDAO extends PagingAndSortingRepository<Component, Long> {


}


