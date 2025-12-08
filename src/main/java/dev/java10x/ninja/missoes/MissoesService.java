package dev.java10x.ninja.missoes;

import dev.java10x.ninja.Ninja.NinjaModel;
import dev.java10x.ninja.Ninja.NinjaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MissoesService {
    private MissoesRepository missoesRepository;

    public MissoesService(MissoesRepository missoesRepository){
        this.missoesRepository = missoesRepository;
    }

    public List<missoesModel> ListarNinja(){return missoesRepository.findAll(); }

    public missoesModel criarNinja(missoesModel missoes){return missoesRepository.save(missoes);}

    public void deletarNinja(Long ID){missoesRepository.deleteById(ID);}

    public missoesModel updateMissoes(Long id, missoesModel missoes){
        if(missoesRepository.existsById(id)){
            missoes.setId(id);
            return missoesRepository.save(missoes);
        }
        return null;
    }
}
