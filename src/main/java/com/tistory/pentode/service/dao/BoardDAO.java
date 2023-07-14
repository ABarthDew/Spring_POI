package com.tistory.pentode.service.dao;

import com.tistory.pentode.vo.BoardVO;

import java.util.List;

public interface BoardDAO {
  List<BoardVO> selectBoardList() throws Exception;

  void insertBoard(BoardVO boardVO);
}
