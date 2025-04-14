package com.example.demo.repository;

import com.example.demo.entity.LegalRegulation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LegalRegulationRepository extends JpaRepository<LegalRegulation, Long> {
}