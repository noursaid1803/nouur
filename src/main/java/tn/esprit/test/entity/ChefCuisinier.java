package tn.esprit.test.entity;
import lombok.*;
import jakarta.persistence.*;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ChefCuisinier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idChefCuisinier;

    private String nom;
    private String prenom;
    @ManyToMany(mappedBy ="chefCuisiniers")

    @Enumerated(EnumType.STRING)
    private TypeChef typeChef;
}

enum TypeChef {
    UNE_ETOILE, DEUX_ETOILES, TROIS_ETOILES
}
