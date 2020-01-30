package com.springbootstudy.board.controller;

import com.springbootstudy.board.service.BoardService;
import com.springbootstudy.board.vo.BoardVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class BoardController {

    @Autowired
    private BoardService boardService;

    @RequestMapping("/board/openBoardList")
    public ModelAndView openBoardList() throws Exception {
        ModelAndView mv = new ModelAndView("/board/boardList");

        List<BoardVO> list = boardService.selectBoardList();
        mv.addObject("list", list);

        return mv;
    }
}
