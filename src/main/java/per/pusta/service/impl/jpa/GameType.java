package per.pusta.service.impl.jpa;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "game_type")
public class GameType implements Serializable {

	@Id
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