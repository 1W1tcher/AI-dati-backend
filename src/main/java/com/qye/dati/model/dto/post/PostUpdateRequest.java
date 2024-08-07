package com.qye.dati.model.dto.post;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 更新请求
 *
 * @author qye丶枯寂
 * 
 */
@Data
public class PostUpdateRequest implements Serializable {

    /**
     * id
     */
    private Long id;

    /**
     * 标题
     */
    private String title;

    /**
     * 内容
     */
    private String content;

    /**
     * 标签列表
     */
    private List<String> tags;

    private static final long serialVersionUID = 1L;
}