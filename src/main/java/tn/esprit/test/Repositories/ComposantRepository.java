package tn.esprit.test.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.test.entity.Composant;

public interface ComposantRepository extends JpaRepository<Composant, Long> {
}
