package com.yq.news.service;

import java.util.List;

import com.yq.news.pojo.News;

public interface NewsQueryService {
	
	//  查询新闻列表
	public List<News> getNewsList();
	
	// 查询单个新闻
	public News getNew(Integer id);
	
}
