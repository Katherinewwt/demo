package com.example.demo.service;

import com.example.demo.entity.PredictionRecord;
import com.example.demo.repository.PredictionRecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PredictionRecordService {
    @Autowired
    private PredictionRecordRepository predictionRecordRepository;

    public List<PredictionRecord> findAll() {
        return predictionRecordRepository.findAll();
    }

    public PredictionRecord save(PredictionRecord record) {
        return predictionRecordRepository.save(record);
    }

    public void deleteById(Long id) {
        predictionRecordRepository.deleteById(id);
    }
}