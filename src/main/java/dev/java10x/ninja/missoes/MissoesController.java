package dev.java10x.ninja.missoes;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("missoes")
public class MissoesController {
    private MissoesService missoesService;

    public MissoesController(MissoesService missoesService) {
        this.missoesService = missoesService;
    }

    @GetMapping("/boasvindas")
    public String boasVindas(){
        return "você esta no centro de missões ninjas";
    }

    @PostMapping("/criar")
    public missoesModel criarMissao(@RequestBody missoesModel missoes){return missoesService.criarNinja(missoes);}

    @GetMapping("/todos")
    public List<missoesModel> mostrarMissao(){return missoesService.ListarNinja();}

    @PutMapping("/alterar/{id}")
    public missoesModel alterarMissao(@PathVariable Long id, @RequestBody missoesModel misssoes){
        return missoesService.updateMissoes(id, misssoes);
    }

    @DeleteMapping("/deletarID/{id}")
    public void deletarMissao(@PathVariable Long id){missoesService.deletarNinja(id);}
}
