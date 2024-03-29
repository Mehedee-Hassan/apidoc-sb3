package com.doc.test.springdoctest.plant;

import java.util.Objects;



public class Plant {
    public Plant(Long id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    private Long id;
    private String name;
    private String description;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }



    public boolean equals(Object o){

        if(this == o)
            return true;
        if(o == null || getClass() != o.getClass())
            return false;

        Plant plant = (Plant) o;
        return id.equals(plant.id);
    }



}
