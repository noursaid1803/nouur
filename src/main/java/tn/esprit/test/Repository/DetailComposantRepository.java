package tn.esprit.test.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.test.entity.DetailComposant;

public interface DetailComposantRepository extends JpaRepository<DetailComposant, Long> {
}
