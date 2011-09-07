package per.pusta.service.impl.jpa.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Data
@Entity
@Table(name = "user_draw")
public class UserDraw implements Serializable {
    
	private static final long serialVersionUID = 1L;
	
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

}