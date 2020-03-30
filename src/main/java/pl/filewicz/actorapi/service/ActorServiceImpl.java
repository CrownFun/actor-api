package pl.filewicz.actorapi.service;

import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;
import pl.filewicz.actorapi.model.Actor;
import pl.filewicz.actorapi.repository.ActorRepository;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ActorServiceImpl implements ActorService {

    private final ActorRepository actorRepository;

    public List<Actor> getActors(String title) {
        return actorRepository.findByLastname(title);
    }

    @EventListener(ApplicationReadyEvent.class)
    public void init(){
        actorRepository.save(new Actor("Arnold","Schwarzenegger",45));
        actorRepository.save(new Actor("Keeanu","Reeves",41));
        actorRepository.save(new Actor("Russel","Crowe",39));
    }

}
