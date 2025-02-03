package tn.esprit.test.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.test.Services.ComposantService;
import tn.esprit.test.entity.Composant;

import java.util.List;

@RestController
@RequestMapping("/composants")
public class ComposantController {
    @Autowired
    private ComposantService composantService;

    @GetMapping
    public List<Composant> getAllComposants() {
        return composantService.getAllComposants();
    }

    @GetMapping("/{id}")
    public Composant getComposantById(@PathVariable Long id) {
        return composantService.getComposantById(id);
    }

    @PostMapping
    public Composant createComposant(@RequestBody Composant composant) {
        return composantService.saveComposant(composant);
    }

    @DeleteMapping("/{id}")
    public void deleteComposant(@PathVariable Long id) {
        composantService.deleteComposant(id);
    }
}
