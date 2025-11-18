package dev.java10x.ninja.missoes;

import dev.java10x.ninja.Ninja.ninjaModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "TD_missoes")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class missoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String dificuldade;

    @OneToMany(mappedBy = "missoesModel")
    private List<ninjaModel> ninjas;
}


