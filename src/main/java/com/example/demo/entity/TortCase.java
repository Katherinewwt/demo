package com.example.demo.entity;

import lombok.Data;
import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "tort_case")
public class TortCase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String caseType;
    private Integer dataVolume;
    private Integer timeRange;
    private String compensationRange;
    private Double accuracy;
    private Double impactFactor;
    private String analysisResult;
    private String weightingFactors;
    private LocalDateTime createTime;
}