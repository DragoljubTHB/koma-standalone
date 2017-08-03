package de.thb.service.impl;

import de.thb.fbi.project.generic.service.impl.NamedEntityServiceImpl;
import de.thb.fbi.project.koma.data.KompBereich;
import de.thb.fbi.project.koma.data.Kompetenz;
import de.thb.fbi.project.koma.repository.api.KompetenzRepository;
import de.thb.fbi.project.koma.service.api.KompetenzService;

import javax.inject.Inject;
import java.util.List;

public class KompetenzServiceImpl 
	extends NamedEntityServiceImpl<Kompetenz, KompetenzRepository>
	implements KompetenzService
{

	@Inject private KompetenzRepository kri;

	@Override
	protected KompetenzRepository getRepositoryType() {
		return kri;
		
	}

	@Override
	public List<KompBereich> findKompetenzBereicheByKompetenzId(int aId) {
		return kri.findKompetenzBereicheByKompetenzId(aId);
	}



}
