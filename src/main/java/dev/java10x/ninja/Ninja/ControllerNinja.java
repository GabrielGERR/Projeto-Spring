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
    public NinjaModel criarNinja(@RequestBody NinjaModel ninjaModel) {
        return ninjaService.criarNinja(ninjaModel);
    };
    //mostrar todos ninjas
    @GetMapping("/todos")
    public List<NinjaModel> mostrarTodosNinjas() {
        return ninjaService.listarNinjas();
    };

    //procurar por id
    @GetMapping("/todos/{id}")
    public NinjaModel mostrarTodosNinjasPorId(@PathVariable Long id) {
        return ninjaService.ListaNinjaPorID(id);
    };

    //alterar dados do ninja
    @PutMapping("/alterar/{id}")
    public NinjaModel update(@PathVariable Long id, @RequestBody NinjaModel ninjaAtualizado){
        return ninjaService.updateNinja(id, ninjaAtualizado);
    }


    //deletar ninja
    @DeleteMapping("/deletarID/{id}")
    public void deletarNinjaPorId(@PathVariable Long id){
         ninjaService.deletarNinja(id);
    }
}
