package com.citi.sgway.util.allure.data;

import com.citi.sgway.util.allure.data.entity.TestProject;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DAOTestProject extends PagingAndSortingRepository<TestProject, Long> {

    List<TestProject> findByProjectId(Long projectId);

    TestProject findByBranchId(Long projectId);

    TestProject findByProjectIdAndBranchId(Long projectId,Long branchId);


}


