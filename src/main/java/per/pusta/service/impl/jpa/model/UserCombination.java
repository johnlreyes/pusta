package per.pusta.service.impl.jpa.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "user_combination")
public class UserCombination implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "user_combination_generator", sequenceName = "seq_user_combination", allocationSize = 1, initialValue = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_combination_generator")
	private Integer id;
	@OneToOne
	@JoinColumn(name = "user_draw_id")
	private UserDraw userDraw;
	@OneToOne
	@JoinColumn(name = "game_combination_id")
	private GameCombination gameCombination;

}