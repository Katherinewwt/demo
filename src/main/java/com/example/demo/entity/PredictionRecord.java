package com.example.demo.entity;

import lombok.Data;
import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "prediction_record")
public class PredictionRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String predictionId;
    private String caseType;
    private Double predictedAmount;
    private Double actualAmount;
    private Double accuracy;
    private LocalDateTime predictionDate;
    private String modelVersion;
    private String status;
    private String remark;
}