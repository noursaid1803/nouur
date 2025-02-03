package tn.esprit.test.entity;

import lombok.*;
import jakarta.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Menu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMenu;

    private String libelleMenu;

    @Enumerated(EnumType.STRING)
    private TypeMenu typeMenu;

    private Float prixTotal;


    @ManyToMany
    private List<ChefCuisinier> chefCuisiniers;
    @ManyToOne
    @JoinColumn(name = "restaurant_id")
    private Restaurant restaurant;

    @OneToMany(mappedBy = "menu", cascade = CascadeType.ALL)
    private List<Composant> composants;
}

// Déclaration de l'Enum en dehors de la classe Menu
enum TypeMenu {
    PETIT_DEJEUNER, DEJEUNER, DINER;
}
