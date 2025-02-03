package tn.esprit.test.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.test.Services.ChaineRestaurationService;
import tn.esprit.test.entity.ChaineRestauration;

import java.util.List;

@RestController
@RequestMapping("/chaines")
public class ChaineRestaurationController {
    @Autowired
    private ChaineRestaurationService chaineRestaurationService;

    @GetMapping
    public List<ChaineRestauration> getAllChaines() {
        return chaineRestaurationService.getAllChaines();
    }

    @GetMapping("/{id}")
    public ChaineRestauration getChaineById(@PathVariable Long id) {
        return chaineRestaurationService.getChaineById(id);
    }

    @PostMapping
    public ChaineRestauration createChaine(@RequestBody ChaineRestauration chaine) {
        return chaineRestaurationService.saveChaine(chaine);
    }

    @DeleteMapping("/{id}")
    public void deleteChaine(@PathVariable Long id) {
        chaineRestaurationService.deleteChaine(id);
    }
}
