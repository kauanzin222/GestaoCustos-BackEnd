package com.gestaocustos.gestpro.models;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="TBL_ABASTECIMENTO")
public class Abastecimento {

    @Id
    private int id;
    
    @ManyToOne
    private Posto posto;
    
    private double price;
    private LocalDate date;
    private boolean statusPay;
    
    // Constructor 
    public Abastecimento (int id, double price, LocalDate date, Posto posto, boolean statusPay) {
        System.out.println("Construindo um abastecimento!");
        
        this.id = id;
        this.price = price;
        this.date = date;
        this.posto = posto;
        this.statusPay = statusPay;
    }
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public LocalDate getDate() {
        return date;
    }
    public void setDate(LocalDate date) {
        this.date = date;
    }
    public Posto getPosto() {
        return posto;
    }
    public void setPosto(Posto posto) {
        this.posto = posto;
    }
    public boolean isStatusPay() {
        return statusPay;
    }
    public void setStatusPay(boolean statusPay) {
        this.statusPay = statusPay;
    }
    

}
