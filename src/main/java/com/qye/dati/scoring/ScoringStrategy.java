package com.qye.dati.scoring;

import com.qye.dati.model.entity.App;
import com.qye.dati.model.entity.UserAnswer;

import java.util.List;

/**
 * 评分策略
 *
 * @author qye丶枯寂
 * 
 */
public interface ScoringStrategy {

    /**
     * 执行评分
     *
     * @param choices
     * @param app
     * @return
     * @throws Exception
     */
    UserAnswer doScore(List<String> choices, App app) throws Exception;
}