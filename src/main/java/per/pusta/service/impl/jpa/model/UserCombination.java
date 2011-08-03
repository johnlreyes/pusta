package per.pusta.service.impl.jpa.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "user_combination")
public class UserCombination implements Serializable {
    @Id
    @SequenceGenerator(name = "user_combination_generator", sequenceName = "seq_user_combination", allocationSize = 1, initialValue = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_combination_generator")
	private Integer id;
    @OneToOne
    @JoinColumn (name = "user_draw_id")
	private UserDraw userDraw;
    @OneToOne
    @JoinColumn (name = "game_combination_id")
	private GameCombination gameCombination;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public UserDraw getUserDraw() {
        return userDraw;
    }

    public void setUserDraw(UserDraw userDraw) {
        this.userDraw = userDraw;
    }

    public GameCombination getGameCombination() {
        return gameCombination;
    }

    public void setGameCombination(GameCombination gameCombination) {
        this.gameCombination = gameCombination;
    }
}
