package tn.esprit.test.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.test.entity.Menu;

public interface MenuRepository extends JpaRepository<Menu, Long> {
}
