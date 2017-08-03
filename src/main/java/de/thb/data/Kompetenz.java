package de.thb.data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
public class Kompetenz {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	//@NotNull(message = "Bitte mindestens ein Zeichen eingeben !")
	@Column(unique = true)
	@Size(min = 1, message = "Bitte mindestens ein Zeichen eingeben !")
	private String name;

	private String kommentar;


	@ManyToOne(cascade = { CascadeType.ALL })
	private KompBereich kompBereich;

	public KompBereich getKompBereich() {
		return kompBereich;
	}

	public void setKompBereich(KompBereich kompBereich) {
		this.kompBereich = kompBereich;
	}

}
