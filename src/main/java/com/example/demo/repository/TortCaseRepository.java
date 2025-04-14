package com.example.demo.repository;

import com.example.demo.entity.TortCase;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TortCaseRepository extends JpaRepository<TortCase, Long> {
}