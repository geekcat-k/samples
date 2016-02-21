package com.example.cms.app.contents.campaign;

import java.util.Collection;

import javax.inject.Inject;
import javax.validation.groups.Default;

import org.dozer.Mapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.terasoluna.gfw.common.exception.BusinessException;

import com.example.cms.app.contents.campaign.CampaignForm.CampaignDetail;
import com.example.cms.domain.model.Campaign;
import com.example.cms.domain.service.contents.CampaignService;

@Controller
@RequestMapping("campaign")
public class CampaignController {
	
    private static final Logger logger = LoggerFactory
            .getLogger(CampaignController.class);
    
    @Inject // (1)
    CampaignService campaignService;

    // (1)
    @Inject
    Mapper beanMapper;

    @RequestMapping(value = "list", method = {RequestMethod.GET})
    public String list(Model model) {
        Collection<Campaign> campaigns = campaignService.findAll();
        model.addAttribute("campaigns", campaigns); // (4)
        return "campaign/list"; // (5)
    }

    @RequestMapping(value = "detail", method = {RequestMethod.GET, RequestMethod.POST}) // (1)
    public String delete(
            @Validated({ Default.class, CampaignDetail.class }) CampaignForm form,
            BindingResult bindingResult, Model model,
            RedirectAttributes attributes) {

        if (bindingResult.hasErrors()) {
            return list(model);
        }

        try {
        	Campaign campaign = campaignService.findOne(form.getContentsId());
            model.addAttribute("campaign", campaign); // (4)
        } catch (BusinessException e) {
            model.addAttribute(e.getResultMessages());
            return list(model);
        }
        return "campaign/detail";
    }


}
