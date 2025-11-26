package dev.java10x.ninja.Ninja;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class ControllerNinja {

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
    public String mostrarTodosNinjas() {
        return "mostrar Ninja";
    };

    //procurar por id
    @GetMapping("/todosID")
    public String mostrarTodosNinjasPorId() {
        return "Mostrar Ninja por id";
    };

    //alterar dados do ninja
    @PostMapping("/alterarID")
    public String update(){
        return "alterar ninja por id";
    }


    //deletar ninja
    @DeleteMapping("/deletarID")
    public String deletarNinjaPorId(){
        return "deletarNinhja";
    }
}
