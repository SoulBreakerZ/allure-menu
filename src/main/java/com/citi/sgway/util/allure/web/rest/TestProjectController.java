package com.citi.sgway.util.allure.web.rest;

import com.citi.sgway.util.allure.data.entity.TestProject;
import com.citi.sgway.util.allure.services.TestProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/project-test")
public class TestProjectController {

    @Autowired
    private TestProjectService testProjectService;

    @GetMapping
    public List<TestProject> findAll() {
        return this.testProjectService.findAll();
    }

    @GetMapping("/page")
    public Page<TestProject> findAll(@PageableDefault(page = 0, size = 10)
                                      Pageable pageable) {
        return this.testProjectService.findAll(pageable);
    }

    @GetMapping("/{id}")
    public TestProject findById(@PathVariable Long id) {
        return this.testProjectService.findOne(id);
    }

    @GetMapping("project/{projectId}")
    public List<TestProject> findByProjectId(@PathVariable Long projectId) {
        return this.testProjectService.findByProjectId(projectId);
    }

    @GetMapping("branch/{branchId}")
    public TestProject findByBranchId(@PathVariable Long branchId) {
        return this.testProjectService.findByBranchId(branchId);
    }

    @GetMapping("project/{projectId}/branch/{branchId}")
    public TestProject findByProjectIdAndBranchId(@PathVariable Long projectId,@PathVariable Long branchId) {
        return this.testProjectService.findByProjectIdAndBranchId(projectId,branchId);
    }


    @PostMapping
    public TestProject create(@RequestBody TestProject testProject) {
        return this.testProjectService.save(testProject);
    }

    @PutMapping("/{id}")
    public TestProject edit(@PathVariable Long id,
                            @RequestBody TestProject testProject) {
        return this.testProjectService.save(testProject);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        this.testProjectService.deleteById(id);
    }
}
