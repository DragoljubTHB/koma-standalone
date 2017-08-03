package de.thb.data;


import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.Set;


@Entity
public class Sequenz  {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	//@NotNull(message = "Bitte mindestens ein Zeichen eingeben !")
	@Column(unique = true)
	@Size(min = 1, message = "Bitte mindestens ein Zeichen eingeben !")
	private String name;

	private String kommentar;

	private KlasseFachId klfaID;

	@OneToMany(cascade = { CascadeType.ALL }, mappedBy = "sequenz")
	@OrderBy("odnung")
	private Set<Stunde> stunden;

	private int ordnung;

	public int getOrdnung() {
		return ordnung;
	}

	public void setOrdnung(int ordnung) {
		this.ordnung = ordnung;
	}

	public Set<Stunde> getStunden() {
		return stunden;
	}

	public void setStunden(Set<Stunde> stunden) {
		this.stunden = stunden;
	}

	public KlasseFachId getKlfaID() {
		return klfaID;
	}

	public void setKlfaID(KlasseFachId klfaID) {
		this.klfaID = klfaID;
	}

}
