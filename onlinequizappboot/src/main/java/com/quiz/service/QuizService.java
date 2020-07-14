package com.quiz.service;

import java.util.List;

import com.quiz.exception.BusinessException;
import com.quiz.model.Quiz;

public interface QuizService {

	public List<Quiz> getAllQuestions() throws BusinessException;
	
	
	
}
