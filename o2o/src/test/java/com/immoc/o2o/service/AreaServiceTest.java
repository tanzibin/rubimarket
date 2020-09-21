package com.immoc.o2o.service;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.immoc.o2o.BaseTest;
import com.imooc.o2o.entity.Area;
import com.imooc.o2o.service.AreaService;
import com.imooc.o2o.service.CacheService;

public class AreaServiceTest extends BaseTest{
	@Autowired
	private AreaService areaService;
	@Autowired
	private CacheService cacheService;
	
	@Test
	public void testGetAreaList() {
		
		List<Area>areaList=areaService.getAreaList();
		assertEquals("西苑", areaList.get(2).getAreaName());
/*		cacheService.removeFromCache(areaService.AREALISTKEY);
		areaList=areaService.getAreaList();*/
	}
	

}
