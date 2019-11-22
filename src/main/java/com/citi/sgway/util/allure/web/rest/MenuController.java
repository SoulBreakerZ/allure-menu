package com.citi.sgway.util.allure.web.rest;

import com.citi.sgway.util.allure.data.entity.Menu;
import com.citi.sgway.util.allure.services.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
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

    @GetMapping("/page")
    public Page<Menu> findAll(@PageableDefault(page = 0, size = 10)
                                      Pageable pageable) {
        return this.menuService.findAll(pageable);
    }

    @GetMapping("/{id}")
    public Menu findById(@PathVariable Long id) {
        return this.menuService.findOne(id);
    }

    @PostMapping
    public Menu create(@RequestBody Menu menu) {
        return this.menuService.save(menu);
    }

    @PutMapping("/{id}")
    public Menu edit(@PathVariable Long id,
                     @RequestBody Menu menu) {
        return this.menuService.save(menu);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        this.menuService.deleteById(id);
    }
}
