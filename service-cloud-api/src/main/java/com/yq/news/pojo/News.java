package com.yq.news.pojo;

import java.util.Date;


public class News {
    public News() {
	}

	public News(Integer id, Integer categoryid, String title, String summary, String author, Date createdate) {
		super();
		this.id = id;
		this.categoryid = categoryid;
		this.title = title;
		this.summary = summary;
		this.author = author;
		this.createdate = createdate;
	}

	private Integer id;

    private Integer categoryid;

    private String title;

    private String summary;

    private String author;

    private Date createdate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCategoryid() {
        return categoryid;
    }

    public void setCategoryid(Integer categoryid) {
        this.categoryid = categoryid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary == null ? null : summary.trim();
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author == null ? null : author.trim();
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }
}