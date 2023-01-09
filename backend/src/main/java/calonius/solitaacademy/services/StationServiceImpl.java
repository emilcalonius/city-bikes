package calonius.solitaacademy.services;

import calonius.solitaacademy.models.Station;
import calonius.solitaacademy.repositories.StationRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class StationServiceImpl implements StationService {
    private final Logger logger = LoggerFactory.getLogger(StationServiceImpl.class);
    private final StationRepository stationRepository;

    public StationServiceImpl(StationRepository stationRepository) {
        this.stationRepository = stationRepository;
    }

    @Override
    public Set<Station> getPageOfStations(int limit, int offset) {
        return stationRepository.getPageOfStations(limit, offset);
    }

    @Override
    public Station findById(Integer id) {
        return stationRepository.findById(id).get();
    }

    @Override
    public List<Station> findAll() {
        return stationRepository.findAll();
    }

    @Override
    public Station add(Station station) {
        return stationRepository.save(station);
    }

    @Override
    public Station update(Station station) {
        return stationRepository.save(station);
    }

    @Override
    public void deleteById(Integer id) {
        if(!stationRepository.existsById(id)) {
            logger.warn("No station exists with ID: " + id);
            return;
        }
        stationRepository.deleteById(id);
    }

    @Override
    public void delete(Station station) {
        stationRepository.delete(station);
    }
}
