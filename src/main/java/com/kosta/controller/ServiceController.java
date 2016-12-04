package com.kosta.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.kosta.service.ServiceService;
import com.kosta.vo.Paging;

@Controller
@RequestMapping(value="userLibrary/service/*")
public class ServiceController {
	
	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
	
	@Autowired
	ServiceService serviceService;
	
	/*@Autowired
	Paging paging;*/
	
	@RequestMapping(value="culture/list", method=RequestMethod.GET)
	public String cultureListGET(Paging paging, Model model) throws Exception {
		
		logger.info("문화행사 목록 페이지");
		logger.info(paging.toString());
		//페이지 번호를 기반으로 목록을 불러옴
		model.addAttribute("list", serviceService.cultureList(paging));
		//페이지 번호를 설정
		//paging.setPage(paging);
		//페이지 번호를 기반으로 데이터를 카운트
		//paging.setTotalCount();
		
		return "userLibrary/service/culture/list";
	}
}
