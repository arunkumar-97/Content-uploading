package com.jesperapps.schoolmanagement.message;

import java.util.List;

import com.jesperapps.schoolmanagement.modelmessage.QuestionJson;

public class QuestionResponse extends BaseResponse {
	
		
	private List<QuestionJson> question;
	
	
	
	public QuestionResponse() {
		
	}
	

	public QuestionResponse(Integer statusCode, String description) {
		super(statusCode, description);
	}


	public List<QuestionJson> getQuestion() {
		return question;
	}


	public void setQuestion(List<QuestionJson> question) {
		this.question = question;
	}
	
	

}
