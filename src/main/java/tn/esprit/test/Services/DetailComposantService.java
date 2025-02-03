package tn.esprit.test.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.test.Repository.DetailComposantRepository;
import tn.esprit.test.entity.DetailComposant;

import java.util.List;

@Service
public class DetailComposantService {
    @Autowired
    private DetailComposantRepository detailComposantRepository;

    public List<DetailComposant> getAllDetailComposants() {
        return detailComposantRepository.findAll();
    }

    public DetailComposant getDetailComposantById(Long id) {
        return detailComposantRepository.findById(id).orElse(null);
    }

    public DetailComposant saveDetailComposant(DetailComposant detailComposant) {
        return detailComposantRepository.save(detailComposant);
    }

    public void deleteDetailComposant(Long id) {
        detailComposantRepository.deleteById(id);
    }
}
