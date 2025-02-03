package tn.esprit.test.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.test.entity.ChefCuisinier;

public interface ChefCuisinierRepository extends JpaRepository<ChefCuisinier, Long> {
}
