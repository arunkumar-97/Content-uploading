package com.jesperapps.schoolmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jesperapps.schoolmanagement.message.QuestionResponse;
import com.jesperapps.schoolmanagement.modelmessage.QuestionJson;
import com.jesperapps.schoolmanagement.service.QuestionService;

@RestController
@RequestMapping("/questions")
public class QuestionController {
	
	@Autowired
	private QuestionService questionService;
	
	@PostMapping("/add")
	public QuestionResponse addQuestions(@RequestBody List<QuestionJson> requestQuestionsList) {
		QuestionResponse response = new QuestionResponse(200, "Success");
		questionService.saveAllQuestions(requestQuestionsList);
		response.setQuestion(requestQuestionsList);
		return response;
	}
}
