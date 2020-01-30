package com.springbootstudy.board.vo;

import lombok.Data;

@Data
public class BoardVO {
    private int boardSeq;
    private String title;
    private String contents;
    private int hitCount;
    private String createdDatetime;
    private String creatorId;
    private String updatedDatetime;
    private String updateId;
}
