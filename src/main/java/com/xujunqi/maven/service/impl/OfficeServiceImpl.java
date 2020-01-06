package com.xujunqi.maven.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xujunqi.maven.dao.OfficeMapper;
import com.xujunqi.maven.entity.Office;
import com.xujunqi.maven.service.OfficeService;

@Service
public class OfficeServiceImpl implements OfficeService {

	@Autowired
	private OfficeMapper officeMapper;

	@Override
	public List<Office> list(String mohu, String miaoshu, Integer startmonty, Integer endmonty) {
		// TODO Auto-generated method stub
		return officeMapper.list(mohu, miaoshu, startmonty, endmonty);
	}

}
