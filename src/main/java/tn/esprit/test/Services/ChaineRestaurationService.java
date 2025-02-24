package tn.esprit.test.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.test.Repositories.ChaineRestaurationRepository;
import tn.esprit.test.entity.ChaineRestauration;

import java.util.List;

@AllArgsConstructor
@Service
public class ChaineRestaurationService implements IChaineRestaurationService {

    private final ChaineRestaurationRepository chaineRestaurationRepository;



    @Override
    public ChaineRestauration saveChaineRestauration(ChaineRestauration chaineRestauration) {
        return chaineRestaurationRepository.save(chaineRestauration);
    }

    @Override
    public ChaineRestauration getChaineRestaurationById(Long id) {
        return chaineRestaurationRepository.findById(id).orElse(null);
    }

    @Override
    public List<ChaineRestauration> getAllChaineRestaurations() {
        return chaineRestaurationRepository.findAll();
    }

    @Override
    public ChaineRestauration updateChaineRestauration(Long id, ChaineRestauration chaineRestauration) {
        return chaineRestaurationRepository.save(chaineRestauration);
    }

    @Override
    public void deleteChaineRestauration(Long id) {
        chaineRestaurationRepository.deleteById(id);
    }

    @Override
    public List<ChaineRestauration> addChaineRestaurations(List<ChaineRestauration> chaineRestaurations) {
        return chaineRestaurationRepository.saveAll(chaineRestaurations);
    }
}
