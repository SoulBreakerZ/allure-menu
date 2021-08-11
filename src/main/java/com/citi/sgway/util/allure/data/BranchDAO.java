package com.citi.sgway.util.allure.data;

import com.citi.sgway.util.allure.data.entity.Branch;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BranchDAO extends PagingAndSortingRepository<Branch, Long> {

    List<Branch> findByProject_id(Long id);

}


