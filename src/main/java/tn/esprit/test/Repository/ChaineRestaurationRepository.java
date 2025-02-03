package tn.esprit.test.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.test.entity.ChaineRestauration;

public interface ChaineRestaurationRepository extends JpaRepository<ChaineRestauration, Long> {
}
