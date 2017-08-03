package de.thb.data;


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


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
	private List<Stunde> stunden;

	private int ordnung;

	public int getOrdnung() {
		return ordnung;
	}

	public void setOrdnung(int ordnung) {
		this.ordnung = ordnung;
	}

	public List<Stunde> getStunden() {
		return stunden;
	}

	public void setStunden(List<Stunde> stunden) {
		this.stunden = stunden;
	}

	public KlasseFachId getKlfaID() {
		return klfaID;
	}

	public void setKlfaID(KlasseFachId klfaID) {
		this.klfaID = klfaID;
	}

}
