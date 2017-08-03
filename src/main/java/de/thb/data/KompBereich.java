package de.thb.data;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;
import javax.validation.constraints.Size;


@Entity
public class KompBereich  {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	//@NotNull(message = "Bitte mindestens ein Zeichen eingeben !")
	@Column(unique = true)
	@Size(min = 1, message = "Bitte mindestens ein Zeichen eingeben !")
	private String name;

	private String kommentar;

	/*
	 * entweder Set -> Set
	 * oder @LazyColletion(LazyCollectionOption.FALSE) (	 * nicht im pom enthalten
	 */
	@OneToMany( cascade = { CascadeType.ALL }, fetch = FetchType.EAGER)
	private Set<Kompetenz> kompetenzen;

	@ManyToMany(mappedBy = "kompBereiche", fetch = FetchType.EAGER, cascade = { CascadeType.ALL }) // schluesselKompetenzen
	private Set<SchluesselKomp> schluesselKompetenzen;

	public Set<Kompetenz> getKompetenzen() {
		return kompetenzen;
	}

	public void setKompetenzen(Set<Kompetenz> kompetenzen) {
		this.kompetenzen = kompetenzen;
	}

	public Set<SchluesselKomp> getSchluesselKopetenzen() {
		//todo: chech for hashset vs options
		return new HashSet<>(schluesselKompetenzen);
	}

	public void setSchluesselKopetenzen(Set<SchluesselKomp> schluesselKopetenzen) {
		this.schluesselKompetenzen.addAll(schluesselKopetenzen);
	}

}
