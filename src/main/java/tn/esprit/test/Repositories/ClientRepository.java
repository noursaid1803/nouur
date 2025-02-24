package tn.esprit.test.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.test.entity.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
