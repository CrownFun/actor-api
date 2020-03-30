package pl.filewicz.actorapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.filewicz.actorapi.model.Actor;

import java.util.List;

public interface ActorRepository extends JpaRepository<Actor, Long> {

   List<Actor> findByLastname(String lastname);

}
