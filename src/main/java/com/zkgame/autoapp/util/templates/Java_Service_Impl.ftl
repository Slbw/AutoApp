package com.zkgame.autoapp.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zkgame.autoapp.dao.mapper.${modelName}Mapper;
import com.zkgame.autoapp.model.${modelName};
import com.zkgame.autoapp.service.I${modelName}Service;

@Service("${serviceName}Service")
public class ${modelName}ServiceImpl extends ServiceImpl<${modelName}, Integer> implements I${modelName}Service {

	@Autowired
	protected ${modelName}Mapper ${serviceName}Mapper;
}