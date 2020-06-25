package novi.spring.helloworld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlayerController {

    @Autowired
    private PlayerRepository playerRepository;

    @GetMapping(value = "/api/player")
    public Player getPlayer() {
        Player player1 = playerRepository.findById(1).get();
        return player1;
    }

}
