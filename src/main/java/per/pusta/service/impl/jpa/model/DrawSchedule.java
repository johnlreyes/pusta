package per.pusta.service.impl.jpa.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "draw_schedule")
public class DrawSchedule implements Serializable {

	@Id
    @SequenceGenerator(name = "draw_schedule_generator", sequenceName = "seq_draw_schedule", allocationSize = 1, initialValue = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "draw_schedule_generator")
	private Integer id;
	private GameType gameType;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}

}