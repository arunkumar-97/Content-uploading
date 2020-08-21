package com.jesperapps.schoolmanagement.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.jesperapps.schoolmanagement.modelmessage.QuestionJson;

@Entity
public class Question {
	
	@Id
	private Integer questionId;
	private String question;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "question")
	private List<Answers> answers;
	
	//Constructor
	public Question() {
		super();
	}
	
	public Question(QuestionJson question) {
		this.questionId= question.getQuestionId();
		this.question = question.getQuestion();
	}

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

	public List<Answers> getAnswers() {
		return answers;
	}

	public void setAnswers(List<Answers> answers) {
		this.answers = answers;
	}

}
