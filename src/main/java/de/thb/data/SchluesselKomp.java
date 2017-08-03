package de.thb.data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class SchluesselKomp {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	//@NotNull(message = "Bitte mindestens ein Zeichen eingeben !")
	@Column(unique = true)
	@Size(min = 1, message = "Bitte mindestens ein Zeichen eingeben !")
	private String name;

	private String kommentar;

	@ManyToMany(fetch = FetchType.EAGER, cascade = { CascadeType.ALL })
	private List<de.thb.fbi.project.koma.data.KompBereich> kompBereiche;

	public List<KompBereich> getKompBereiche() {
		return kompBereiche;
	}

	public void setKompBereiche(List<KompBereich> kompBereiche) {
		this.kompBereiche = kompBereiche;
	}

}