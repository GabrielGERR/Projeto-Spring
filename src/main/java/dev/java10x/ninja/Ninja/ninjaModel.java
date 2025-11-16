package dev.java10x.ninja.Ninja;

import dev.java10x.ninja.missoes.missoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "TD_cadastro")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ninjaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    private String nome;
    @Column(unique = true)
    private String Email;

    private int idade;

    @ManyToOne
    @JoinColumn(name = "missoes_id")
    private missoesModel missoesModel;

}
