package calonius.solitaacademy.services;

import calonius.solitaacademy.models.Journey;

import java.util.Set;

public interface JourneyService extends CrudService<Journey, Integer> {
    Set<Journey> getPageOfJourneys(int limit, int offset);
}
