package tn.esprit.test.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.test.Repositories.ComposantRepository;
import tn.esprit.test.entity.Composant;

import java.util.List;

@AllArgsConstructor
@Service
public class ComposantService implements IComposantService {

    private final ComposantRepository composantRepository;



    @Override
    public Composant saveComposant(Composant composant) {
        return composantRepository.save(composant);
    }

    @Override
    public Composant getComposantById(Long id) {
        return composantRepository.findById(id).orElse(null);
    }

    @Override
    public List<Composant> getAllComposants() {
        return composantRepository.findAll();
    }

    @Override
    public Composant updateComposant(Long id, Composant composant) {
        return composantRepository.save(composant);
    }

    @Override
    public void deleteComposant(Long id) {
        composantRepository.deleteById(id);
    }

    @Override
    public List<Composant> addComposants(List<Composant> composants) {
        return composantRepository.saveAll(composants);
    }
}
