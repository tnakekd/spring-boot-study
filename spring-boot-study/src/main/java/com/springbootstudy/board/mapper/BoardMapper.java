package com.springbootstudy.board.mapper;

import com.springbootstudy.board.vo.BoardVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {
    List<BoardVO> selectBoardList() throws Exception;
}
