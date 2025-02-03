package tn.esprit.test.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.test.Repository.ChefCuisinierRepository;
import tn.esprit.test.entity.ChefCuisinier;

import java.util.List;

@Service
public class ChefCuisinierService {
    @Autowired
    private ChefCuisinierRepository chefCuisinierRepository;

    public List<ChefCuisinier> getAllChefs() {
        return chefCuisinierRepository.findAll();
    }

    public ChefCuisinier getChefById(Long id) {
        return chefCuisinierRepository.findById(id).orElse(null);
    }

    public ChefCuisinier saveChef(ChefCuisinier chef) {
        return chefCuisinierRepository.save(chef);
    }

    public void deleteChef(Long id) {
        chefCuisinierRepository.deleteById(id);
    }
}
