package com.yq.news.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

import com.yq.news.pojo.News;

import feign.hystrix.FallbackFactory;

/**
 * 实现了FallbackFactory来通一管理接口中的所有方法，
 * 当一个方法发生了错误，会调用FallbackFactory里的方法，实现降级，不会一直等待
 * @author Lucien
 *
 */
@Component//别忘了添加Component注解
public class NewsClientServiceFallbackFactory implements FallbackFactory<NewsClientService>{

	@Override
	public NewsClientService create(Throwable arg0) {
		// TODO Auto-generated method stub
		return  new NewsClientService() {
			
			@Override
			public List<News> list() {
				// TODO Auto-generated method stub
				return Arrays.asList(new News());
			}
			
			@Override
			public News getNew(Integer id) {
				News news = new News();
				news.setId(id);
				news.setTitle("没有没有对应的信息,Consumer客户端提供的降级信息,此刻服务Provider已经关闭");
				news.setSummary("no this database in MySQL");
				return news;
			}
		};
	}
	

}
