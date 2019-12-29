package com.yq.news.service;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.yq.news.pojo.News;

@FeignClient(value = "SC-PROVIDER",fallbackFactory=NewsClientServiceFallbackFactory.class)
public interface  NewsClientService {
	
	@RequestMapping(value="/news/list",method = RequestMethod.GET)
    public List<News> list();
	
	@RequestMapping(value="/news/{id}",method = RequestMethod.GET)
	public News getNew(@PathVariable("id") Integer id);
}
