package com.sangeng.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sangeng.domain.ResponseResult;
import com.sangeng.domain.entity.Article;
import com.sangeng.service.ArticleService;

@RestController
@RequestMapping("/article")
public class ArticleController {

	@Autowired
	private ArticleService articleService;

	@GetMapping("/list")
	public List<Article> list() {
		return articleService.list();
	}

	@GetMapping("/hotArticleList")
	public ResponseResult hotArticleList() {

		ResponseResult result = articleService.hotArticleList();
		return result;
	}

}
