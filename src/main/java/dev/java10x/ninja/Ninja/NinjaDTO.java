package dev.java10x.ninja.Ninja;

import dev.java10x.ninja.missoes.missoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class NinjaDTO {
    private Long id;
    private String nome;
    private String Email;
    private int idade;
    private String ImgUrl;
    private String rank;
    private missoesModel missoesModel;

}
