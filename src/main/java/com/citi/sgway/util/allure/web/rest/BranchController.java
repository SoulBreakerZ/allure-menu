package com.citi.sgway.util.allure.web.rest;

import com.citi.sgway.util.allure.data.entity.Branch;
import com.citi.sgway.util.allure.services.BranchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/branch")
public class BranchController {

    @Autowired
    private BranchService branchService;

    @GetMapping("/page")
    public Page<Branch> findAll(@PageableDefault(page = 0, size = 10)
                                      Pageable pageable) {
        return this.branchService.findAll(pageable);
    }

    @GetMapping("/project/{projectId}")
    public List<Branch> findAllByProjectId(@PathVariable Long projectId) {
        return this.branchService.findAllByProjectId(projectId);
    }

    @GetMapping("/{id}")
    public Branch findById(@PathVariable Long id) {
        return this.branchService.findById(id);
    }

    @PostMapping
    public Branch create(@RequestBody Branch projectBranch) {
        return this.branchService.save(projectBranch);
    }

    @PutMapping("/{id}")
    public Branch edit(@PathVariable Long id,
                              @RequestBody Branch branch) {
        return this.branchService.save(branch);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        this.branchService.deleteById(id);
    }
}
