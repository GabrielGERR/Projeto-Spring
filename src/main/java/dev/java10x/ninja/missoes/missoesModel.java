package dev.java10x.ninja.missoes;

import dev.java10x.ninja.Ninja.ninjaModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "TB_missoes")
public class missoesModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private String Difuculdade;

    @OneToMany(mappedBy = "missoes")
    private List<ninjaModel> ninjaModel;
}
