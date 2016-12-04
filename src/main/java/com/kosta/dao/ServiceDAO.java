package com.kosta.dao;

import java.util.List;

import com.kosta.vo.ApplyBoardVO;

public interface ServiceDAO {
	public List<ApplyBoardVO> cultureList(int page);
}
