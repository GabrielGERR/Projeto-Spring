package dev.java10x.ninja.missoes;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("missoes")
public class MissoesController {

    @GetMapping("/boasvindas")
    public String boasVindas(){
        return "você esta no centro de missões ninjas";
    }

    @PostMapping("/criar")
    public String criarMissao(){
        return "missão criada";
    }

    @GetMapping("/todos")
    public String mostrarMissao(){
        return "mostrar missões";
    }

    @PutMapping("/alterar")
    public String alterarMissao(){
        return "missão alterada";
    }

    @DeleteMapping("/deletar")
    public String deletarMissao(){
        return "missão deletada";
    }
}
