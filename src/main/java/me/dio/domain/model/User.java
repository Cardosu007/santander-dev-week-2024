package me.dio.domain.model;

import jakarta.persistence.*;

import java.util.List;

//Nome da tabela
    @Entity(name = "tb_user")
    public class User {

//Id do usuário
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//Nome do usuário
    private String name;

//Sistem a onde contém informações do usuário
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "system_id", referencedColumnName = "id")
    private System system;

//Infos das habilidades mágicas
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<MagicalSkill> magical_Skill;

//Infos das habilidades físicas
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<PhysicalSkill> physical_Skills;


// Get / Set

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

    public System getSystem() {
        return system;
    }

    public void setSystem(System system) {
        this.system = system;
    }

    public List<MagicalSkill> getMagical_Skill() {
        return magical_Skill;
    }

    public void setMagical_Skill(List<MagicalSkill> magical_Skill) {
        this.magical_Skill = magical_Skill;
    }

    public List<PhysicalSkill> getPhysical_Skills() {
        return physical_Skills;
    }

    public void setPhysical_Skills(List<PhysicalSkill> physical_Skills) {
        this.physical_Skills = physical_Skills;
    }
    
}
