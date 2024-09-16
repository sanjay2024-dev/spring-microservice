package com.quiz.QuizService.controller;

import com.quiz.QuizService.entity.Quiz;
import com.quiz.QuizService.service.QuizService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/quiz")
public class QuizController {
    private QuizService quizService;

    public QuizController(QuizService quizService) {
        this.quizService = quizService;
    }
    @PostMapping("/create")
    public Quiz create(@RequestBody Quiz quiz){
    return quizService.add(quiz);
    }

    @GetMapping("/get/{id}")
    public Quiz get(@PathVariable Long id){
        return quizService.get(id);
    }

    @GetMapping("/getAll")
    public List<Quiz> getAll(){
        return quizService.get();
    }
}
