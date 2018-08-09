package com.mis.service;

import java.util.List;

import com.mis.domain.BoardVO;
import com.mis.domain.Criteria;
import com.mis.domain.SearchCriteria;

public interface BoardService {

	public void regist(BoardVO board) throws Exception;
	
	public BoardVO read(int bno) throws Exception;
	
	public void modify(BoardVO board) throws Exception;
	
	public void remove(int bno) throws Exception;
	
	public List<BoardVO> listAll() throws Exception;

	public void updateViewCnt(int bno) throws Exception;
	
	public List<BoardVO> listCriteria(Criteria cri)throws Exception;
	
	public int listCountCriteria(Criteria cri)throws Exception;
	
	public List<BoardVO> listSearchCriteria(SearchCriteria cri) throws Exception;
	
	public int listSearchCount(SearchCriteria cri)throws Exception;
}