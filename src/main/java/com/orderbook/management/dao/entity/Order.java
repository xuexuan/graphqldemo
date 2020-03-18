package com.orderbook.management.dao.entity;


import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode
@Entity
@Table(name = "order_table")
public class Order implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @Id
    @Column(name = "ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    
    @Column(name = "type", nullable = false)
    private String type;
    
    @Column(name = "model_code", nullable = false)
    private String modelCode;
    
    @Column(name = "brand_name")
    private String brandName;
    
    @Column(name = "launch_date")
    private LocalDate launchDate;
    
    
    // Getter and setter
    public String getFormattedDate() {
        return getLaunchDate().toString();
    }
}