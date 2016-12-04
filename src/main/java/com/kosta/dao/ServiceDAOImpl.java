package com.kosta.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kosta.vo.ApplyBoardVO;

@Repository
public class ServiceDAOImpl implements ServiceDAO {

	@Autowired
	SqlSession sqlSession;
	
	@Override
	public List<ApplyBoardVO> cultureList(int page) {
		return sqlSession.selectList("ServiceMapper.cultureList", page);
	}

}
