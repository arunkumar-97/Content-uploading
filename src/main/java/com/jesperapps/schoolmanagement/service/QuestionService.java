package com.jesperapps.schoolmanagement.service;

import java.util.List;

import com.jesperapps.schoolmanagement.modelmessage.QuestionJson;

public interface QuestionService {
	public void saveQuestion(QuestionJson newQuestion);
	
	public void saveAllQuestions(List<QuestionJson> newQuestionsList);
}
