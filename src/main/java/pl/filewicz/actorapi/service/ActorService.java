package pl.filewicz.actorapi.service;

import pl.filewicz.actorapi.model.Actor;

import java.util.List;

public interface ActorService {
    List<Actor> getActors(String title);
}
