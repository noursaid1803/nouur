package tn.esprit.test.Services;

import tn.esprit.test.entity.Composant;

import java.util.List;

public interface IComposantService {
    Composant saveComposant(Composant composant);
    Composant getComposantById(Long id);
    List<Composant> getAllComposants();
    Composant updateComposant(Long id, Composant composant);
    void deleteComposant(Long id);
    List<Composant> addComposants(List<Composant> composants);
}
