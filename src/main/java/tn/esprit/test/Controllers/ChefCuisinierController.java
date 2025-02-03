package tn.esprit.test.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.test.Services.ChefCuisinierService;
import tn.esprit.test.entity.ChefCuisinier;

import java.util.List;

@RestController
@RequestMapping("/chefs")
public class ChefCuisinierController {
    @Autowired
    private ChefCuisinierService chefCuisinierService;

    @GetMapping
    public List<ChefCuisinier> getAllChefs() {
        return chefCuisinierService.getAllChefs();
    }

    @GetMapping("/{id}")
    public ChefCuisinier getChefById(@PathVariable Long id) {
        return chefCuisinierService.getChefById(id);
    }

    @PostMapping
    public ChefCuisinier createChef(@RequestBody ChefCuisinier chef) {
        return chefCuisinierService.saveChef(chef);
    }

    @DeleteMapping("/{id}")
    public void deleteChef(@PathVariable Long id) {
        chefCuisinierService.deleteChef(id);
    }
}
