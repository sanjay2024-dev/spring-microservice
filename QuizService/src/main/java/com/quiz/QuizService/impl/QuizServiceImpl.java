package com.quiz.QuizService.impl;

import com.quiz.QuizService.entity.Quiz;
import com.quiz.QuizService.repository.QuizRepository;
import com.quiz.QuizService.service.QuestionClient;
import com.quiz.QuizService.service.QuizService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuizServiceImpl implements QuizService {

    private QuizRepository quizRepository;
    private QuestionClient questionClient;

    public QuizServiceImpl(QuizRepository quizRepository, QuestionClient questionClient) {
        this.quizRepository = quizRepository;
        this.questionClient = questionClient;
    }

    @Override
    public Quiz add(Quiz quiz) {
        return quizRepository.save(quiz);
    }

    @Override
    public List<Quiz> get() {
        List<Quiz>  quizes= quizRepository.findAll();

      return null;
    }

    @Override
    public Quiz get(Long id) {
        return quizRepository.findById(id).orElseThrow(EntityNotFoundException::new);
    }
}
