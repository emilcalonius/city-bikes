package calonius.solitaacademy.services;

import calonius.solitaacademy.models.Station;

import java.util.Set;

public interface StationService extends CrudService<Station, Integer> {
    Set<Station> getPageOfStations(int limit, int offset);
}
