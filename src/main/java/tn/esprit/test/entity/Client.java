package tn.esprit.test.entity;
import lombok.*;
import jakarta.persistence.*;

import lombok.Data;

import java.time.LocalDate;
import java.util.List;
import java.util.Date;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idClient;

    private String identifiant;
    private LocalDate datePremiereVisite;

    @OneToMany(mappedBy = "client", cascade = CascadeType.ALL)
    private List<Commande> commandes;
}
