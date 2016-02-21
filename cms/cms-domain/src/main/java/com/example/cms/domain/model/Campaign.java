package com.example.cms.domain.model;

import java.io.Serializable;
import java.util.Date;

public class Campaign implements Serializable {
    private static final long serialVersionUID = 1L;

    private String contentsId;
    private String title;
    private Date campaignStart;
    private Date campaignEnd;
    private String introductionText;
    private String mainImageUrl;
    private String entryUrl;
    private String caution;
    private String createUser;
    private Date createDate;
    private String updateUser;
    private Date updateDate;
	public String getContentsId() {
		return contentsId;
	}
	public void setContentsId(String contentsId) {
		this.contentsId = contentsId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Date getCampaignStart() {
		return campaignStart;
	}
	public void setCampaignStart(Date campaignStart) {
		this.campaignStart = campaignStart;
	}
	public Date getCampaignEnd() {
		return campaignEnd;
	}
	public void setCampaignEnd(Date campaignEnd) {
		this.campaignEnd = campaignEnd;
	}
	public String getIntroductionText() {
		return introductionText;
	}
	public void setIntroductionText(String introductionText) {
		this.introductionText = introductionText;
	}
	public String getMainImageUrl() {
		return mainImageUrl;
	}
	public void setMainImageUrl(String mainImageUrl) {
		this.mainImageUrl = mainImageUrl;
	}
	public String getEntryUrl() {
		return entryUrl;
	}
	public void setEntryUrl(String entryUrl) {
		this.entryUrl = entryUrl;
	}
	public String getCaution() {
		return caution;
	}
	public void setCaution(String caution) {
		this.caution = caution;
	}
	public String getCreateUser() {
		return createUser;
	}
	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public String getUpdateUser() {
		return updateUser;
	}
	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
    
}
