package com.example.cms.domain.repository.contents;

import java.util.Collection;

import com.example.cms.domain.model.Campaign;

public interface CampaignRepository {
	Campaign findOne(String contentsId);

    Collection<Campaign> findAll();

    void create(Campaign campaign);

}
