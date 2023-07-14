package com.tistory.pentode.service;

import com.tistory.pentode.vo.BoardVO;

import java.util.List;

public interface BoardService {
  List<BoardVO> selectBoardList() throws Exception;

  void insertBoard(BoardVO boardVO);
}
