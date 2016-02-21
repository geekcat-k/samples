package com.example.cms.domain.service.contents;

import java.util.Collection;

import com.example.cms.domain.model.Campaign;

public interface CampaignService {
    Collection<Campaign> findAll();
    Campaign findOne(String CampaignId);
}
