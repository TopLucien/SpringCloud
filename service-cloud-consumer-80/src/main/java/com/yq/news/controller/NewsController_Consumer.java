package com.yq.news.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.yq.news.pojo.News;

@RestController
public class NewsController_Consumer {	
	
	//private static final String REST_URL_PREFIX = "http://localhost:8001";
	
	private static final String REST_URL_PREFIX = "http://SC-PROVIDER";
	
	@Autowired
    private RestTemplate restTemplate;
	
	@RequestMapping("/newList")
	public String getNewList(Model model) {
		return null;
	}
	
	@RequestMapping(value="/consumer/news/list")
    public List<News> list()
    {
         return restTemplate.getForObject(REST_URL_PREFIX+"/news/list", List.class);
    }
}
