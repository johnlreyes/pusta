package per.pusta.service.impl.jpa.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "user_draw")
public class UserDraw implements Serializable {
    @Id
    @SequenceGenerator(name = "user_draw_generator", sequenceName = "seq_user_draw", allocationSize = 1, initialValue = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_draw_generator")
	private Integer id;
    @OneToOne
    @JoinColumn (name = "game_type_id")
	private User user;
    private GameType gameType;
    @Temporal(value = TemporalType.DATE)
    @Column (name = "draw_date")
    private Date drawDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public GameType getGameType() {
        return gameType;
    }

    public void setGameType(GameType gameType) {
        this.gameType = gameType;
    }

    public Date getDrawDate() {
        return drawDate;
    }

    public void setDrawDate(Date drawDate) {
        this.drawDate = drawDate;
    }
}
