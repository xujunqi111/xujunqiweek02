package com.xujunqi.maven.service;

import java.util.List;

import com.xujunqi.maven.entity.Office;

public interface OfficeService {

	List<Office> list(String mohu, String miaoshu, Integer startmonty, Integer endmonty);

}
