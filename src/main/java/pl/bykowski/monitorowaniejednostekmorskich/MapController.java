package pl.bykowski.monitorowaniejednostekmorskich;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pl.bykowski.monitorowaniejednostekmorskich.model.TrackService;

@Controller
public class MapController {

    private final TrackService trackService;

    public MapController(TrackService trackService) {
        this.trackService = trackService;
    }

    @GetMapping
    public String getMap(Model model) {
        model.addAttribute("tracks", trackService.getTracks());
        return "map";
    }

}
