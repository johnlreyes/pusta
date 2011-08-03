package per.pusta.service.impl.jpa.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "game_combination")
public class GameCombination implements Serializable {

    @Id
    @SequenceGenerator(name = "game_combination_generator", sequenceName = "seq_game_combination", allocationSize = 1, initialValue = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "game_combination_generator")
    private Integer id;
    @OneToOne
    @JoinColumn(name = "game_type_id")
    private GameType gameType;
    private Integer Number;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public GameType getGameType() {
        return gameType;
    }

    public void setGameType(GameType gameType) {
        this.gameType = gameType;
    }

    public Integer getNumber() {
        return Number;
    }

    public void setNumber(Integer number) {
        Number = number;
    }
}
