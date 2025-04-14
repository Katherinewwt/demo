package com.example.demo.controller;

import com.example.demo.entity.TortCase;
import com.example.demo.service.TortCaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/tort-cases")
public class TortCaseController {
    @Autowired
    private TortCaseService tortCaseService;

    @GetMapping
    public List<TortCase> findAll() {
        return tortCaseService.findAll();
    }

    @PostMapping
    public TortCase create(@RequestBody TortCase tortCase) {
        return tortCaseService.save(tortCase);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        tortCaseService.deleteById(id);
    }
}