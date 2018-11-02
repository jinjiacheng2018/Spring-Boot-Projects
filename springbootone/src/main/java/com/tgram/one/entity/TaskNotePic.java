package com.tgram.one.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 *<p> Description: 描述信息 </p>
 *<p> Copyright: Copyright(c) 2018/11/1 </p>
 *<p> Company: 7qb </p>
 *
 *@author JinJiacheng
 *@Version 1.0 2018/11/1 17:21
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TaskNotePic implements Serializable {

    private static final long serialVersionUID = 6490400418211014932L;

    private Long id;

    private Long noteId;

    private String savePath;

    private String picName;
}
