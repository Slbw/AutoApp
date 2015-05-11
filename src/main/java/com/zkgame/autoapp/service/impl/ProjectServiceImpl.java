package com.zkgame.autoapp.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zkgame.autoapp.dao.mapper.ProjectMapper;
import com.zkgame.autoapp.model.Project;
import com.zkgame.autoapp.service.IProjectService;

@Service("ProjectService")
public class ProjectServiceImpl extends ServiceImpl<Project, Integer> implements IProjectService {

	@Autowired
	protected ProjectMapper ProjectMapper;
}