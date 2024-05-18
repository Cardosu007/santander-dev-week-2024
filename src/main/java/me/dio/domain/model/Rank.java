package me.dio.domain.model;

import jakarta.persistence.*;

import java.util.List;


@Entity(name = "tb_rank")
public class Rank {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String rank;

    private float xpRank;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public float getXpRank() {
        return xpRank;
    }

    public void setXpRank(float xpRank) {
        this.xpRank = xpRank;
    }
}
