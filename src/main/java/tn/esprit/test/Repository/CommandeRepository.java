package tn.esprit.test.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.test.entity.Commande;

public interface CommandeRepository extends JpaRepository<Commande, Long> {
}
