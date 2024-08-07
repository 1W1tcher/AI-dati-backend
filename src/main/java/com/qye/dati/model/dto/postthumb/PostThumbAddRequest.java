package com.qye.dati.model.dto.postthumb;

import lombok.Data;

import java.io.Serializable;

/**
 * 帖子点赞请求
 *
 * @author qye丶枯寂
 * 
 */
@Data
public class PostThumbAddRequest implements Serializable {

    /**
     * 帖子 id
     */
    private Long postId;

    private static final long serialVersionUID = 1L;
}