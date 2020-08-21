package com.jesperapps.schoolmanagement.repository;

import org.springframework.data.repository.CrudRepository;

import com.jesperapps.schoolmanagement.model.Question;

public interface QuestionRepository extends CrudRepository<Question, Integer> {

}
