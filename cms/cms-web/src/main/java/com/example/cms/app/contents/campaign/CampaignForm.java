package com.example.cms.app.contents.campaign;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

public class CampaignForm implements Serializable {
    // (1)
    public static interface CampaignDetail {
    };

    private static final long serialVersionUID = 1L;

    @NotNull(groups = { CampaignDetail.class})
    private String contentsId;

	public String getContentsId() {
		return contentsId;
	}

	public void setContentsId(String contentsId) {
		this.contentsId = contentsId;
	}

}
