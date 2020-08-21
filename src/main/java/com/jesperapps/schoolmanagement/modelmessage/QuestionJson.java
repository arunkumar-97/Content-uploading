package com.jesperapps.schoolmanagement.modelmessage;

import java.util.List;

public class QuestionJson {
	
	private Integer questionId;
	private String question;
	
	private List<AnswerJson> answer;

	public Integer getQuestionId() {
		return questionId;
	}

	public void setQuestionId(Integer questionId) {
		this.questionId = questionId;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public List<AnswerJson> getAnswer() {
		return answer;
	}

	public void setAnswer(List<AnswerJson> answer) {
		this.answer = answer;
	}

	
	
	

}
