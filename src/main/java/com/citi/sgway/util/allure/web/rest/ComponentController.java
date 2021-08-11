package com.citi.sgway.util.allure.web.rest;

import com.citi.sgway.util.allure.data.entity.Component;
import com.citi.sgway.util.allure.services.ComponentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/project-test")
public class ComponentController {

    @Autowired
    private ComponentService componentService;

    @GetMapping("/page")
    public Page<Component> findAll(@PageableDefault(page = 0, size = 10)
                                      Pageable pageable) {
        return this.componentService.findAll(pageable);
    }

    @GetMapping("/{id}")
    public Component findById(@PathVariable Long id) {
        return this.componentService.findById(id);
    }

    @PostMapping
    public Component create(@RequestBody Component testProject) {
        return this.componentService.save(testProject);
    }

    @PutMapping("/{id}")
    public Component update(@PathVariable Long id,
                            @RequestBody Component testProject) {
        return this.componentService.save(testProject);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        this.componentService.deleteById(id);
    }
}
