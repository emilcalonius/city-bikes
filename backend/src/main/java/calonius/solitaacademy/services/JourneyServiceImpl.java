package calonius.solitaacademy.services;

import calonius.solitaacademy.models.Journey;
import calonius.solitaacademy.repositories.JourneyRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class JourneyServiceImpl implements JourneyService {
    private final Logger logger = LoggerFactory.getLogger(JourneyServiceImpl.class);
    private final JourneyRepository journeyRepository;

    public JourneyServiceImpl(JourneyRepository journeyRepository) {
        this.journeyRepository = journeyRepository;
    }

    @Override
    public Set<Journey> getPageOfJourneys(int limit, int offset) {
        return journeyRepository.getPageOfJourneys(limit, offset);
    }

    @Override
    public Journey findById(Integer id) {
        return journeyRepository.findById(id).get();
    }

    @Override
    public List<Journey> findAll() {
        return journeyRepository.findAll();
    }

    @Override
    public Journey add(Journey journey) {
        return journeyRepository.save(journey);
    }

    @Override
    public Journey update(Journey journey) {
        return journeyRepository.save(journey);
    }

    @Override
    public void deleteById(Integer id) {
        if(!journeyRepository.existsById(id)) {
            logger.warn("No journey exists with ID: " + id);
            return;
        }
        journeyRepository.deleteById(id);
    }

    @Override
    public void delete(Journey journey) {
        journeyRepository.delete(journey);
    }
}
