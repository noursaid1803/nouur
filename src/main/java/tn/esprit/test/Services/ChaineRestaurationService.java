package tn.esprit.test.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.test.Repository.ChaineRestaurationRepository;
import tn.esprit.test.entity.ChaineRestauration;
import java.util.List;

@Service
public class ChaineRestaurationService {
    @Autowired
    private ChaineRestaurationRepository chaineRestaurationRepository;

    public List<ChaineRestauration> getAllChaines() {
        return chaineRestaurationRepository.findAll();
    }

    public ChaineRestauration getChaineById(Long id) {
        return chaineRestaurationRepository.findById(id).orElse(null);
    }

    public ChaineRestauration saveChaine(ChaineRestauration chaine) {
        return chaineRestaurationRepository.save(chaine);
    }

    public void deleteChaine(Long id) {
        chaineRestaurationRepository.deleteById(id);
    }
}
