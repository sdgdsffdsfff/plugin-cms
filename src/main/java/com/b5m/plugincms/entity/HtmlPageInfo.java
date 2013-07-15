package com.b5m.plugincms.entity;

import java.util.Date;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;

import com.b5m.dao.annotation.Column;
import com.b5m.dao.annotation.Id;
import com.b5m.dao.annotation.Table;
import com.b5m.dao.domain.ColType;
/**
 * @Company B5M.com
 * @description
 * 
 * @author echo
 * @since 2013-7-12
 * @email echo.weng@b5m.com
 */
@Table("t_html_page_info")
public class HtmlPageInfo{
	@Id
	protected Long id;
	
	@Column(name = "albums_content", type = ColType.TEXT)
	private String albumsContent;
	
	@Column(name = "photos_content", type = ColType.TEXT)
	private String photosContent;
	
	@Column(name = "ad_a_content", type = ColType.TEXT)
	private String adAContent;
	
	@Column(name = "ad_b_content", type = ColType.TEXT)
	private String adBContent;
	
	@Column(name = "ad_c_content", type = ColType.TEXT)
	private String adCContent;
	
	@Column(name = "text_a_content", type = ColType.TEXT)
	private String textAContent;
	
	@Column(name = "text_b_content", type = ColType.TEXT)
	private String textBContent;
	
	@Column(name = "text_c_content", type = ColType.TEXT)
	private String textCContent;
	
	@Column
	private String version;
	
	@Column(name = "effective_start_date", type = ColType.TIMESTAMP)
	private Date effectiveStartDate;
	
	@Column(name = "effective_end_date", type = ColType.TIMESTAMP)
	private Date effectiveEndDate;
	
	@Column(name = "create_date", type = ColType.TIMESTAMP)
	private Date createDate;
	
	@Column(name = "last_modify_date", type = ColType.TIMESTAMP)
	private Date lastModifyDate;
	
	//备用字段
	@Column(name = "bak_photos_content1", type = ColType.TEXT)
	private String bakPhotosContent1;
	
	@Column(name = "bak_ad_content_1", type = ColType.TEXT)
	private String bakAdContent1;
	
	@Column(name = "bak_ad_content_2", type = ColType.TEXT)
	private String bakAdContent2;
	
	@Column(name = "bak_text_content_1", type = ColType.TEXT)
	private String bakTextContent1;
	
	@Column(name = "bak_text_content_2", type = ColType.TEXT)
	private String bakTextContent2;
	
	@Column(name = "bak_content_1", type = ColType.TEXT)
	private String bakContent1;
	
	@Column(name = "bak_content_2", type = ColType.TEXT)
	private String bakContent2;

	public String getAlbumsContent() {
		return albumsContent;
	}

	public void setAlbumsContent(String albumsContent) {
		this.albumsContent = albumsContent;
	}

	public String getPhotosContent() {
		return photosContent;
	}

	public void setPhotosContent(String photosContent) {
		this.photosContent = photosContent;
	}

	public String getAdAContent() {
		return adAContent;
	}

	public void setAdAContent(String adAContent) {
		this.adAContent = adAContent;
	}

	public String getAdBContent() {
		return adBContent;
	}

	public void setAdBContent(String adBContent) {
		this.adBContent = adBContent;
	}

	public String getAdCContent() {
		return adCContent;
	}

	public void setAdCContent(String adCContent) {
		this.adCContent = adCContent;
	}

	public String getTextAContent() {
		return textAContent;
	}

	public void setTextAContent(String textAContent) {
		this.textAContent = textAContent;
	}

	public String getTextBContent() {
		return textBContent;
	}

	public void setTextBContent(String textBContent) {
		this.textBContent = textBContent;
	}

	public String getTextCContent() {
		return textCContent;
	}

	public void setTextCContent(String textCContent) {
		this.textCContent = textCContent;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public Date getEffectiveStartDate() {
		return effectiveStartDate;
	}

	public void setEffectiveStartDate(Date effectiveStartDate) {
		this.effectiveStartDate = effectiveStartDate;
	}

	public Date getEffectiveEndDate() {
		return effectiveEndDate;
	}

	public void setEffectiveEndDate(Date effectiveEndDate) {
		this.effectiveEndDate = effectiveEndDate;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getLastModifyDate() {
		return lastModifyDate;
	}

	public void setLastModifyDate(Date lastModifyDate) {
		this.lastModifyDate = lastModifyDate;
	}

	public String getBakPhotosContent1() {
		return bakPhotosContent1;
	}

	public void setBakPhotosContent1(String bakPhotosContent1) {
		this.bakPhotosContent1 = bakPhotosContent1;
	}

	public String getBakAdContent1() {
		return bakAdContent1;
	}

	public void setBakAdContent1(String bakAdContent1) {
		this.bakAdContent1 = bakAdContent1;
	}

	public String getBakAdContent2() {
		return bakAdContent2;
	}

	public void setBakAdContent2(String bakAdContent2) {
		this.bakAdContent2 = bakAdContent2;
	}

	public String getBakTextContent1() {
		return bakTextContent1;
	}

	public void setBakTextContent1(String bakTextContent1) {
		this.bakTextContent1 = bakTextContent1;
	}

	public String getBakTextContent2() {
		return bakTextContent2;
	}

	public void setBakTextContent2(String bakTextContent2) {
		this.bakTextContent2 = bakTextContent2;
	}

	public String getBakContent1() {
		return bakContent1;
	}

	public void setBakContent1(String bakContent1) {
		this.bakContent1 = bakContent1;
	}

	public String getBakContent2() {
		return bakContent2;
	}

	public void setBakContent2(String bakContent2) {
		this.bakContent2 = bakContent2;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this);
	}
	
}
