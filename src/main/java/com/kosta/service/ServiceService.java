package com.kosta.service;

import java.util.List;

import com.kosta.vo.ApplyBoardVO;
import com.kosta.vo.Paging;

public interface ServiceService {
	public List<ApplyBoardVO> cultureList(Paging paging) throws Exception;
}
