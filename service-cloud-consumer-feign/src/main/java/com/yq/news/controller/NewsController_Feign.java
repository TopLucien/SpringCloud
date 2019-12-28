package com.yq.news.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.yq.news.pojo.News;
import com.yq.news.service.NewsClientService;

@RestController
public class NewsController_Feign {	
	@Autowired
	private NewsClientService newsClientService;
	
	@RequestMapping(value = "/consumer/news/list")
	public List<News> list()
	{
		return this.newsClientService.list();
	}
	
	@RequestMapping(value = "/consumer/news/{id}")
	public News getNew(@PathVariable("id")Integer id) {
		return this.newsClientService.getNew(id);
	}
}
