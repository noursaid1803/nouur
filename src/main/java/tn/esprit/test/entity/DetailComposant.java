package tn.esprit.test.entity;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class DetailComposant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDetailComposant;

    private Float imc;
    @OneToOne
    @JoinColumn(name = "composant_id") // Clé étrangère dans la table DetailComposant
    private Composant composant;

    @Enumerated(EnumType.STRING)
    private TypeComposant typeComposant;

}