package com.example.demo.service;

import com.example.demo.entity.LegalRegulation;
import com.example.demo.repository.LegalRegulationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class LegalRegulationService {
    @Autowired
    private LegalRegulationRepository legalRegulationRepository;

    public List<LegalRegulation> findAll() {
        return legalRegulationRepository.findAll();
    }

    public LegalRegulation save(LegalRegulation regulation) {
        return legalRegulationRepository.save(regulation);
    }

    public void deleteById(Long id) {
        legalRegulationRepository.deleteById(id);
    }
}