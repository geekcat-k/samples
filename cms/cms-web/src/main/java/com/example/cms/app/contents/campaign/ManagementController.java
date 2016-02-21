package com.example.cms.app.contents.campaign;

import javax.inject.Inject;

import org.dozer.Mapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.cms.domain.service.contents.CampaignService;

@Controller
@RequestMapping("management")
public class ManagementController {

    private static final Logger logger = LoggerFactory
            .getLogger(CampaignController.class);
    
    @Inject // (1)
    CampaignService campaignService;

    // (1)
    @Inject
    Mapper beanMapper;

    @RequestMapping(value = "", method = {RequestMethod.GET})
    public String list(Model model) {
        return "management/index"; // (5)
    }
}
