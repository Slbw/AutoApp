package com.zkgame.autoapp.service.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zkgame.autoapp.dao.mapper.SQLMapper;
import com.zkgame.autoapp.model.CodeDetailBean;
import com.zkgame.autoapp.service.ICodeDetailService;


@Service("codeDetailService")
public class CodeDetailServiceImpl implements ICodeDetailService {
	
	@Autowired
	private SQLMapper sqlMapper;
	
	public List<CodeDetailBean> getCodeValueBySql(String querySql) {
		List<Map<String, Object>> results = sqlMapper.selectBySQL(querySql);
		if (results.size() == 0) {
			return null;
		}
		
		List<CodeDetailBean> codeValues = new ArrayList<CodeDetailBean>();
		CodeDetailBean codeDetail = null; 
		for(Map<String, Object> map : results) {
			codeDetail = new CodeDetailBean();
			codeDetail.setItemKey(map.get("code").toString());
			codeDetail.setItemValue(map.get("value").toString());
			
			codeValues.add(codeDetail);
		}
		
		return Collections.unmodifiableList(codeValues);
	}
	
}