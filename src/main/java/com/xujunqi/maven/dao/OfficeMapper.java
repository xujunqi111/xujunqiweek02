package com.xujunqi.maven.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.xujunqi.maven.entity.Office;

public interface OfficeMapper {
	
	List<Office> list(@Param("mohu")String mohu, @Param("miaoshu")String miaoshu, @Param("startmonty")Integer startmonty, @Param("endmonty")Integer endmonty);

}
