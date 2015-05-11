package com.zkgame.autoapp.model;

import java.util.Date;

public class Project extends BaseBean {
	/**
	 * 
	 */
	private Integer id;
	
	/**
	 * 项目名字
	 */
	private String name;
	
	/**
	 * 
	 */
	private String img;
	
	/**
	 * 项目描述
	 */
	private String desc;
	
	/**
	 * 用户id
	 */
	private Integer userId;
	
	/**
	 * 更新时间
	 */
	private Date updateTime;
	
	/**
	 * 发布时间
	 */
	private Integer publishTime;
	
	/**
	 * 
	 */
	private String content;
	
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public Integer getId () {
		return id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName () {
		return name;
	}
	
	public void setImg(String img) {
		this.img = img;
	}
	
	public String getImg () {
		return img;
	}
	
	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	public String getDesc () {
		return desc;
	}
	
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	
	public Integer getUserId () {
		return userId;
	}
	
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	
	public Date getUpdateTime () {
		return updateTime;
	}
	
	public void setPublishTime(Integer publishTime) {
		this.publishTime = publishTime;
	}
	
	public Integer getPublishTime () {
		return publishTime;
	}
	
	public void setContent(String content) {
		this.content = content;
	}
	
	public String getContent () {
		return content;
	}
	
}