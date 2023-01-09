package calonius.solitaacademy.reposoitories;

import calonius.solitaacademy.models.Station;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface StationRepository extends JpaRepository<Station, Integer> {
    @Query("SELECT s FROM Station s LIMIT :limit OFFSET :offset")
    Set<Station> getPageOfStations(int limit, int offset);
}
