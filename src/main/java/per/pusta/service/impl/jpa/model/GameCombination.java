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
@Table(name = "game_combination")
public class GameCombination implements Serializable {

    private static final long serialVersionUID = 1L;
	
    @Id
    @SequenceGenerator(name = "game_combination_generator", sequenceName = "seq_game_combination", allocationSize = 1, initialValue = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "game_combination_generator")
    private Integer id;
    @OneToOne
    @JoinColumn(name = "game_type_id")
    private GameType gameType;
    private Integer Number;

}