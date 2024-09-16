package com.question.controller;

import com.question.entity.Question;
import com.question.service.QuestionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/quiz")
public class QuestionController {
    private QuestionService questionService;

    public QuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }

    @PostMapping("/create")
    public Question create(@RequestBody Question question) {
        return questionService.add(question);
    }

    @GetMapping("/get/{id}")
    public Question get(@PathVariable Long id) {
        return questionService.get(id);
    }

    @GetMapping("/getAll")
    public List<Question> getAll() {
        return questionService.get();
    }

    @GetMapping("/quiz/{id}")
    public List<Question> getQuestionsOfQuiz(@PathVariable Long id) {
        return questionService.getQuestionOfQuiz(id);
    }
}
