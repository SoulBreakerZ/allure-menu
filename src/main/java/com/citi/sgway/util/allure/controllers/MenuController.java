package com.citi.sgway.util.allure.controllers;


import com.citi.sgway.util.allure.models.entity.Menu;
import com.citi.sgway.util.allure.services.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@SessionAttributes("menu/")
public class MenuController {

    @Autowired
    private MenuService menuService;

    @GetMapping("")
    @ResponseStatus(HttpStatus.OK)
    public List<Menu> findAll() {
        return this.menuService.findAll();
    }

    @GetMapping("{id}")
    @ResponseStatus(HttpStatus.OK)
    public Menu findById(@PathVariable Long id) {
        return this.menuService.findOne(id);
    }

    @PostMapping("create")
    @ResponseStatus(HttpStatus.CREATED)
    public Menu create(@RequestBody Menu menu) {
        return this.menuService.save(menu);
    }

    @PutMapping("edit/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Menu edit(@PathVariable Long id,
                              @RequestBody Menu menu) {
        return this.menuService.save(menu);
    }

    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        this.menuService.deleteById(id);
    }
}
