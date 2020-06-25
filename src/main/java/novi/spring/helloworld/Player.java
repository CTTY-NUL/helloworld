package novi.spring.helloworld;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Player {

    @Id
    @GeneratedValue
    private int id;
    private String name;
    private int score;

    //Dennis zegt lege constructor nodig want entity
    public Player() {
    }

    public Player(int id, String name, int score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

}