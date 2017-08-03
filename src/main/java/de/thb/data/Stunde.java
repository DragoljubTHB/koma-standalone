package de.thb.data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Set;

@Entity
public class Stunde {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	//@NotNull(message = "Bitte mindestens ein Zeichen eingeben !")
	@Column(unique = true)
	@Size(min = 1, message = "Bitte mindestens ein Zeichen eingeben !")
	private String name;

	private String kommentar;

	@NotNull
	@ManyToOne(cascade = { CascadeType.ALL })
	private Sequenz sequenz;

	@ManyToMany(cascade = { CascadeType.ALL })
	private Set<Fertigkeit> neueFertigkeiten;

	@ManyToMany(cascade = { CascadeType.ALL })
	private Set<Fertigkeit> zufestigendeFertigkeiten;

	private String inhalt;
	private int ordnung;

	public String getInhalt() {
		return inhalt;
	}

	public void setInhalt(String inhalt) {
		this.inhalt = inhalt;
	}

	public Sequenz getSequenz() {
		return sequenz;
	}

	public void setSequenz(Sequenz sequenz) {
		this.sequenz = sequenz;
	}

	public Set<Fertigkeit> getNeueFertigkeiten() {
		return neueFertigkeiten;
	}

	public void setNeueFertigkeiten(Set<Fertigkeit> neueFertigkeiten) {
		this.neueFertigkeiten = neueFertigkeiten;
	}

	public Set<Fertigkeit> getZufestigendeFertigkeiten() {
		return zufestigendeFertigkeiten;
	}

	public void setZufestigendeFertigkeiten(Set<Fertigkeit> zufestigendeFertigkeiten) {
		this.zufestigendeFertigkeiten = zufestigendeFertigkeiten;
	}

	public int getOrdnung() {
		return ordnung;
	}

	public void setOrdnung(int ordnung) {
		this.ordnung = ordnung;
	}

}
