package com.example.demo.service;

import com.example.demo.entity.TortCase;
import com.example.demo.repository.TortCaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TortCaseService {
    @Autowired
    private TortCaseRepository tortCaseRepository;

    public List<TortCase> findAll() {
        return tortCaseRepository.findAll();
    }

    public TortCase save(TortCase tortCase) {
        return tortCaseRepository.save(tortCase);
    }

    public void deleteById(Long id) {
        tortCaseRepository.deleteById(id);
    }
}