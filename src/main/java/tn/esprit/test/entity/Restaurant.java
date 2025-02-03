package tn.esprit.test.entity;

import lombok.*;
import jakarta.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Restaurant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRestaurant;

    private String nom;
    private Long nbPlacesMax;

    @ManyToOne
    @JoinColumn(name = "chaineRestauration_id")
    private ChaineRestauration chaineRestauration;

    @OneToMany(mappedBy = "restaurant", cascade = CascadeType.ALL)
    private List<Menu> menus;
}

