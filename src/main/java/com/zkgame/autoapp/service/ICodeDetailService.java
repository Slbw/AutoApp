package com.zkgame.autoapp.service;

import java.util.List;

import com.zkgame.autoapp.model.CodeDetailBean;

public interface ICodeDetailService {
	public List<CodeDetailBean> getCodeValueBySql(String querySql);
}