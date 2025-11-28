package dev.java10x.ninja.Ninja;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NinjaService {

    private NinjaRepository ninjaRepository;

    public NinjaService(NinjaRepository ninjaRepository){
        this.ninjaRepository = ninjaRepository;
    }

    // listar todos meus ninjas
    public List<ninjaModel> listarNinjas(){
        return ninjaRepository.findAll();
    };

    public ninjaModel ListaNinjaPorID(Long id){
        Optional<ninjaModel> ninjaModel = ninjaRepository.findById(id);
        return ninjaModel.orElse(null);
    }

}
