package tn.esprit.test.entity;


import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ChaineRestauration {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long idChaineRestauration;

    private String libelle;
    private LocalDate dateCreation;
    @OneToMany(mappedBy = "chaineRestauration", cascade = CascadeType.ALL)
    private List<Restaurant> restaurants;

}
