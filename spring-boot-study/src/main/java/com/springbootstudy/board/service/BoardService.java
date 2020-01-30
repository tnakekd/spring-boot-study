package com.springbootstudy.board.service;

import com.springbootstudy.board.mapper.BoardMapper;
import com.springbootstudy.board.vo.BoardVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardService {

    @Autowired
    private BoardMapper boardMapper;

    public List<BoardVO> selectBoardList() throws Exception {
        return boardMapper.selectBoardList();
    }
}
