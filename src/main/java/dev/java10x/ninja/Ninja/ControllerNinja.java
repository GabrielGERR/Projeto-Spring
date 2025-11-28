package dev.java10x.ninja.Ninja;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ninja")
public class ControllerNinja {

    private NinjaService ninjaService;
    public ControllerNinja(NinjaService ninjaService) {
        this.ninjaService = ninjaService;
    }

    @GetMapping("/boasVindas")
    public String boavindas() {
        return "Olá jovem";
    }
    //Adicionar ninja
    @PostMapping("/criar")
    public String criarNinja() {
        return "ninja criardo";
    };
    //mostrar todos ninjas
    @GetMapping("/todos")
    public List<ninjaModel> mostrarTodosNinjas() {
        return ninjaService.listarNinjas();
    };

    //procurar por id
    @GetMapping("/todosID")
    public String mostrarTodosNinjasPorId() {
        return "Mostrar Ninja por id";
    };

    //alterar dados do ninja
    @PutMapping("/alterarID")
    public String update(){
        return "alterar ninja por id";
    }


    //deletar ninja
    @DeleteMapping("/deletarID")
    public String deletarNinjaPorId(){
        return "deletarNinhja";
    }
}
