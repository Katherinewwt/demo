package com.example.demo.repository;

import com.example.demo.entity.PredictionRecord;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PredictionRecordRepository extends JpaRepository<PredictionRecord, Long> {
}