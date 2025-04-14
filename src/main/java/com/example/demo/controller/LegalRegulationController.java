package com.example.demo.controller;

import com.example.demo.entity.LegalRegulation;
import com.example.demo.service.LegalRegulationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/legal-regulations")
public class LegalRegulationController {
    @Autowired
    private LegalRegulationService legalRegulationService;

    @GetMapping
    public List<LegalRegulation> findAll() {
        return legalRegulationService.findAll();
    }

    @PostMapping
    public LegalRegulation create(@RequestBody LegalRegulation regulation) {
        return legalRegulationService.save(regulation);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        legalRegulationService.deleteById(id);
    }
}