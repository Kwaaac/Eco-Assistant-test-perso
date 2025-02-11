package com.ecoassitant.back.service.impl;

import com.ecoassitant.back.dto.QuestionDto;
import com.ecoassitant.back.repository.QuestionRepository;
import com.ecoassitant.back.service.QuestionService;
import org.springframework.stereotype.Service;

/**
 * implementation of questionService
 */
@Service
public class QuestionServiceImpl implements QuestionService {
    private final QuestionRepository questionRepository;

    public QuestionServiceImpl(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }

    /**
     * Set 1st question of questionary, all the questionnary is accessible with responses.questionSuiv
     * @return 1st question of questionary
     */
    @Override
    public QuestionDto getQuestionnaire() {
        var questionEntity = questionRepository.findAll().stream().findFirst();
        return questionEntity.map(QuestionDto::new).orElse(null);
    }
}
