package novi.spring.helloworld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Controller;

@Controller
public class DatabaseLoader implements CommandLineRunner {

    @Autowired
    private PlayerRepository playerRepository;

    //constructor die door Autowired aangemaakt wordt
    public DatabaseLoader(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }


    @Override
    public void run(String... args) throws Exception {

        Player player = new Player(1,"Dennis",0);
        playerRepository.save(player);
    }
}
