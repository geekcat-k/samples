package com.example.cms.domain.service.contents;

import java.util.Collection;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.cms.domain.model.Campaign;
import com.example.cms.domain.repository.contents.CampaignRepository;

@Service// (1)
@Transactional // (2)
public class CampaignServiceImpl implements CampaignService {

    @Inject// (3)
    CampaignRepository campaignRepository;

	@Override
	public Collection<Campaign> findAll() {
		return campaignRepository.findAll();
	}

	@Override
	public Campaign findOne(String CampaignId) {
		return campaignRepository.findOne(CampaignId);
	}
}
