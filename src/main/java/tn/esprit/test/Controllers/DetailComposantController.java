package tn.esprit.test.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.test.Services.DetailComposantService;
import tn.esprit.test.entity.DetailComposant;

import java.util.List;

@RestController
@RequestMapping("/detail-composants")
public class DetailComposantController {
    @Autowired
    private DetailComposantService detailComposantService;

    @GetMapping
    public List<DetailComposant> getAllDetailComposants() {
        return detailComposantService.getAllDetailComposants();
    }

    @GetMapping("/{id}")
    public DetailComposant getDetailComposantById(@PathVariable Long id) {
        return detailComposantService.getDetailComposantById(id);
    }

    @PostMapping
    public DetailComposant createDetailComposant(@RequestBody DetailComposant detailComposant) {
        return detailComposantService.saveDetailComposant(detailComposant);
    }

    @DeleteMapping("/{id}")
    public void deleteDetailComposant(@PathVariable Long id) {
        detailComposantService.deleteDetailComposant(id);
    }
}
