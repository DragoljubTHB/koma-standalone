package de.thb.data;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.Set;

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
	private Set<KompBereich> kompBereiche;

	public Set<KompBereich> getKompBereiche() {
		return kompBereiche;
	}

	public void setKompBereiche(Set<KompBereich> kompBereiche) {
		this.kompBereiche = kompBereiche;
	}

}