package com.quiz.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quiz.dao.QuizDAO;
import com.quiz.exception.BusinessException;
import com.quiz.model.Quiz;
import com.quiz.service.QuizService;

@Service
public class QuizServiceImpl implements QuizService{

	@Autowired
	public QuizDAO dao;

	@Override
	public List<Quiz> getAllQuestions() throws BusinessException {
		// TODO Auto-generated method stub
				return dao.findAll();
		}

	
	
	

}
