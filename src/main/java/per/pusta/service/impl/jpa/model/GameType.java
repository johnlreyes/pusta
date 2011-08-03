package per.pusta.service.impl.jpa.model;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "game_type")
public class GameType implements Serializable {

	@Id
    @SequenceGenerator(name = "game_type_generator", sequenceName = "seq_game_type", allocationSize = 1, initialValue = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "game_type_generator")
	private Integer id;
	private String game;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getGame() {
		return game;
	}
	public void setGame(String game) {
		this.game = game;
	}
}