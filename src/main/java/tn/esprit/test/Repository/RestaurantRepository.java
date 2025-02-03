package tn.esprit.test.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.test.entity.Restaurant;

public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {
}
