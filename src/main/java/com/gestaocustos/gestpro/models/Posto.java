package com.gestaocustos.gestpro.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="TBL_POSTO")
public class Posto {

    @Id
    private int id;
    
    private String name;
    
    // Constructor
    public Posto (int id, String name) {
        System.out.println("Construindo um Posto");

        this.id = id;
        this.name = name;
    }
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
