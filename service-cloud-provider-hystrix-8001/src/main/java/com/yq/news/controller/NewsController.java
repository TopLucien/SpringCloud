package com.yq.news.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.yq.news.pojo.News;
import com.yq.news.service.NewsQueryService;

@RestController
public class NewsController {

	@Autowired
	private NewsQueryService newsQueryService;
	
	@RequestMapping(value="/news/list",method=RequestMethod.GET)
	public List<News> getNewsList()
	{
		  return this.newsQueryService.getNewsList();
	}
	
	@RequestMapping(value="/news/{id}",method=RequestMethod.GET)
	@HystrixCommand(fallbackMethod = "processHystrix_Get")
	public News getNew(@PathVariable("id") Integer id) {
		News news =  this.newsQueryService.getNew(id);
		if(news==null) {	
		throw new RuntimeException("该id没有对应信息");
	}
		return news;
}	
	public News processHystrix_Get(@PathVariable("id") Integer id) {
		News news = new News();
		news.setId(id);
		news.setTitle("该ID：\"+id+\"没有没有对应的信息,null--@HystrixCommand");
		news.setSummary("no this database in MySQL");
		return news;
	}
	
	
}
