package pl.filewicz.actorapi.rest;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.filewicz.actorapi.model.Actor;
import pl.filewicz.actorapi.service.ActorService;

import java.util.List;

@RestController
@RequestMapping("/api/actor/")
@RequiredArgsConstructor
public class ActorController {

    private final ActorService actorService;

    @GetMapping("/{title}")
    public List<Actor> getAllActors(@PathVariable("title") String title) {
        return actorService.getActors(title);
    }


}
