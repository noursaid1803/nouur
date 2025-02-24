package tn.esprit.test.Services;

import tn.esprit.test.entity.Commande;

import java.util.List;

public interface ICommandeService {

    Commande saveCommande(Commande commande);

    Commande getCommandeById(Long id);

    List<Commande> getAllCommandes();

    Commande updateCommande(Long id, Commande commande);

    void deleteCommande(Long id);

    List<Commande> addCommandes(List<Commande> commandes);
}
