package calonius.solitaacademy.repositories;

import calonius.solitaacademy.models.Journey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface JourneyRepository extends JpaRepository<Journey, Integer> {
    @Query(value = "SELECT j FROM Journey j LIMIT :limit OFFSET :offset", nativeQuery = true)
    Set<Journey> getPageOfJourneys(int limit, int offset);
}
