package dev.java10x.ninja.Ninja;

import dev.java10x.ninja.missoes.missoesModel;
import jakarta.persistence.*;

@Entity
@Table(name = "TD_cadastro")
public class ninjaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String Email;
    private int idade;
    @ManyToOne
    @JoinColumn(name = "missoes_id")
    private missoesModel missoesModel;

    public ninjaModel() {
    }

    public ninjaModel(String nome, String email, int idade) {
        this.nome = nome;
        Email = email;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
