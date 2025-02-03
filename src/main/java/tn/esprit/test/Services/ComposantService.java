package tn.esprit.test.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.test.Repository.ComposantRepository;
import tn.esprit.test.entity.Composant;

import java.util.List;

@Service
public class ComposantService {
    @Autowired
    private ComposantRepository composantRepository;

    public List<Composant> getAllComposants() {
        return composantRepository.findAll();
    }

    public Composant getComposantById(Long id) {
        return composantRepository.findById(id).orElse(null);
    }

    public Composant saveComposant(Composant composant) {
        return composantRepository.save(composant);
    }

    public void deleteComposant(Long id) {
        composantRepository.deleteById(id);
    }
}
