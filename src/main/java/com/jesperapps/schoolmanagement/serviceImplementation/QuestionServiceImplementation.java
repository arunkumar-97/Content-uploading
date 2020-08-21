package com.jesperapps.schoolmanagement.serviceImplementation;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jesperapps.schoolmanagement.model.Answers;
import com.jesperapps.schoolmanagement.model.Question;
import com.jesperapps.schoolmanagement.modelmessage.AnswerJson;
import com.jesperapps.schoolmanagement.modelmessage.QuestionJson;
import com.jesperapps.schoolmanagement.repository.QuestionRepository;
import com.jesperapps.schoolmanagement.service.QuestionService;

@Service
public class QuestionServiceImplementation implements QuestionService{
	
	@Autowired
	private QuestionRepository questionRepository;

	@Override
	public void saveQuestion(QuestionJson newQuestion) {
		Question newQuestionSaveToDB = new Question(newQuestion);
		List<Answers> answersListSaveToDB = new ArrayList<>(); 
		for(AnswerJson eachRequestAnswer : newQuestion.getAnswer()) {
			Answers newAnswerSaveToDB = new Answers(eachRequestAnswer);
			newAnswerSaveToDB.setQuestion(newQuestionSaveToDB);
			answersListSaveToDB.add(newAnswerSaveToDB);
		}
		newQuestionSaveToDB.setAnswers(answersListSaveToDB);	
		questionRepository.save(newQuestionSaveToDB);
	}

	@Override
	public void saveAllQuestions(List<QuestionJson> newQuestionsList) {
		// TODO Auto-generated method stub
		for(QuestionJson requestQuestion: newQuestionsList) {
			this.saveQuestion(requestQuestion);
		}
		
	}

}
