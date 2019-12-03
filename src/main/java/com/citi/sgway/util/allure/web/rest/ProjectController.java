package com.citi.sgway.util.allure.web.rest;

import com.citi.sgway.util.allure.data.entity.Project;
import com.citi.sgway.util.allure.services.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/project")
public class ProjectController {

    @Autowired
    private ProjectService projectService;

    @GetMapping
    public List<Project> findAll() {
        return this.projectService.findAll();
    }

    @GetMapping("/page")
    public Page<Project> findAll(@PageableDefault(page = 0, size = 10)
                                      Pageable pageable) {
        return this.projectService.findAll(pageable);
    }

    @GetMapping("/{id}")
    public Project findById(@PathVariable Long id) {
        return this.projectService.findOne(id);
    }

    @PostMapping
    public Project create(@RequestBody Project project) {
        return this.projectService.save(project);
    }

    @PutMapping("/{id}")
    public Project edit(@PathVariable Long id,
                              @RequestBody Project project) {
        return this.projectService.save(project);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        this.projectService.deleteById(id);
    }
}
