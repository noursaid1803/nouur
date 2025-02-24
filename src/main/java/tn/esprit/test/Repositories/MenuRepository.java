package tn.esprit.test.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import tn.esprit.test.entity.Menu;
import tn.esprit.test.entity.TypeMenu;

import java.util.List;

public interface MenuRepository extends JpaRepository<Menu, Long> {
    List<Menu> findByTypeMenuAndPrixTotalGreaterThan(TypeMenu typeMenu, double montant);
    @Query("SELECT m FROM Menu m ORDER BY m.typeMenu, m.prixTotal")
    List<Menu> findByTypeMenuOrderByPrixTotal();

    @Query("SELECT DISTINCT m FROM m " +
            "join m.composant c" +
            "WHERE c.typeComposant = :typeComposant")
    List<Menu> findMenuByComposantType(@Param("TypeComposant") String typeComposant);






}
