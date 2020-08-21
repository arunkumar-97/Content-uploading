package com.jesperapps.schoolmanagement.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.jesperapps.schoolmanagement.constants.AnswerLableTypes;
import com.jesperapps.schoolmanagement.modelmessage.AnswerJson;

@Entity
public class Answers {
	
	@Id
	private Integer answerId;
	private String label;
	private String answer;
	
	
	@ManyToOne
	@JoinColumn(name="question_Id",referencedColumnName = "questionId")
	private Question question;
	
	//Constructor
	public Answers() {
		super();
	}
	
	public Answers(AnswerJson answer) {
		this.answerId = answer.getAnswerId();
		this.answer = answer.getAnswer();
		this.label = AnswerLableTypes.findAnswerLableType(answer.getLabel());
	}


	public Integer getAnswerId() {
		return answerId;
	}


	public void setAnswerId(Integer answerId) {
		this.answerId = answerId;
	}


	public String getLabel() {
		return label;
	}


	public void setLabel(String label) {
		this.label = label;
	}


	public String getAnswer() {
		return answer;
	}


	public void setAnswer(String answer) {
		this.answer = answer;
	}


	public Question getQuestion() {
		return question;
	}


	public void setQuestion(Question question) {
		this.question = question;
	}
	

}
