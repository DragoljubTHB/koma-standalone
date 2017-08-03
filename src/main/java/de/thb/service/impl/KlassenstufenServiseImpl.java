package de.thb.service.impl;

import de.thb.fbi.project.generic.service.impl.NamedEntityServiceImpl;
import de.thb.fbi.project.koma.data.Klassenstufe;
import de.thb.fbi.project.koma.repository.impl.JPAKlasseRepository;
import de.thb.fbi.project.koma.service.api.KlassenstufenService;

import javax.inject.Inject;

public class KlassenstufenServiseImpl extends NamedEntityServiceImpl<Klassenstufe, JPAKlasseRepository>
		implements KlassenstufenService {

	@Inject
	private JPAKlasseRepository jpaKlasseRepository;

	@Override
	protected JPAKlasseRepository getRepositoryType() {
		return jpaKlasseRepository;
	}

}
