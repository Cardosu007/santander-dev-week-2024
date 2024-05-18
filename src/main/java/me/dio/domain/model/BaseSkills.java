package me.dio.domain.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class BaseSkills {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String habFisicas;

    private String habMagicas;

    private String description;






    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getHabFisicas() {
        return habFisicas;
    }

    public void setHabFisicas(String habFisicas) {
        this.habFisicas = habFisicas;
    }

    public String getHabMagicas() {
        return habMagicas;
    }

    public void setHabMagicas(String habMagicas) {
        this.habMagicas = habMagicas;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
