package de.thb.repository.impl;

import de.thb.data.Fach;
import de.thb.data.Fertigkeit;
import de.thb.repository.api.FachRepository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Set;

public class JPAFachRepository implements FachRepository {
	@PersistenceContext
	private EntityManager em;


	@Override
	public Set<Fach> findByFertigkeit(Fertigkeit fertigkeit) {
		return null;
	}
}
