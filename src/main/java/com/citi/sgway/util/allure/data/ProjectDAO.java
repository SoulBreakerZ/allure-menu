package com.citi.sgway.util.allure.data;

import com.citi.sgway.util.allure.data.entity.Branch;
import com.citi.sgway.util.allure.data.entity.Project;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProjectDAO extends PagingAndSortingRepository<Project, Long> { }


