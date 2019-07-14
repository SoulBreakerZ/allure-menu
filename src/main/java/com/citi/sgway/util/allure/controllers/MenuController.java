package com.citi.sgway.util.allure.controllers;


import com.citi.sgway.util.allure.models.entity.Menu;
import com.citi.sgway.util.allure.services.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/menu")
public class MenuController {

    @Autowired
    private MenuService menuService;

    @GetMapping
    public List<Menu> findAll() {
        return this.menuService.findAll();
    }

    @GetMapping("/{id}")
    public Menu findById(@PathVariable Long id) {
        return this.menuService.findOne(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Menu create(@RequestBody Menu menu) {
        return this.menuService.save(menu);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Menu edit(@PathVariable Long id,
                              @RequestBody Menu menu) {
        return this.menuService.save(menu);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        this.menuService.deleteById(id);
    }
}
