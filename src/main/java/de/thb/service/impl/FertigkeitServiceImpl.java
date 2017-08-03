package de.thb.service.impl;

import de.thb.fbi.project.generic.service.impl.NamedEntityServiceImpl;
import de.thb.fbi.project.koma.data.Fertigkeit;
import de.thb.fbi.project.koma.repository.impl.JPAFertigkeitRepository;
import de.thb.fbi.project.koma.service.api.FertigkeitService;

import javax.inject.Inject;

public class FertigkeitServiceImpl extends NamedEntityServiceImpl<Fertigkeit, JPAFertigkeitRepository>
		implements FertigkeitService {
	@Inject
	private JPAFertigkeitRepository jPAFertigkeitRepository;

	@Override
	protected JPAFertigkeitRepository getRepositoryType() {
		return jPAFertigkeitRepository;
	}

}
