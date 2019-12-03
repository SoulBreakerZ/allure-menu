package com.citi.sgway.util.allure.data;

import com.citi.sgway.util.allure.data.entity.TestProject;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DAOProjectBranch extends PagingAndSortingRepository<TestProject, Long> {

    List<TestProject> findByProject(Long projectId);

    TestProject findByBranch(Long projectId);

    TestProject findByProjectAndBranch(Long projectId,Long branchId);


}


