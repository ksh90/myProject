package com.kosta.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kosta.dao.ServiceDAO;
import com.kosta.vo.ApplyBoardVO;
import com.kosta.vo.Paging;

@Service
public class ServiceServiceImpl implements ServiceService {
	
	@Autowired
	ServiceDAO servicedao;
	
	//문화행사 리스트 호출
	@Override
	public List<ApplyBoardVO> cultureList(Paging paging) throws Exception {
		//페이지값을 매개변수로 페이지를 출력시킨다
		System.out.println("프린트페이지:"+paging.getPrintPage());
		return servicedao.cultureList(paging.getPrintPage());
	}
}
