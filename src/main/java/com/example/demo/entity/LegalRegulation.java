package com.example.demo.entity;

import lombok.Data;
import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "legal_regulation")
public class LegalRegulation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String regulationId;
    private String title;
    private String category;
    private LocalDateTime publishDate;
    private String source;
    private String applicableScope;
    private String compensationStandard;
    private LocalDateTime updateTime;
    private String status;
}