package com.example.demo.controller;

import com.example.demo.entity.PredictionRecord;
import com.example.demo.service.PredictionRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/prediction-records")
public class PredictionRecordController {
    @Autowired
    private PredictionRecordService predictionRecordService;

    @GetMapping
    public List<PredictionRecord> findAll() {
        return predictionRecordService.findAll();
    }

    @PostMapping
    public PredictionRecord create(@RequestBody PredictionRecord record) {
        return predictionRecordService.save(record);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        predictionRecordService.deleteById(id);
    }
}