package com.zkgame.autoapp.dao.mapper;

import java.util.List;
import java.util.Map;

public interface SQLMapper {
	public List<Map<String, Object>> selectBySQL(String sql);
}