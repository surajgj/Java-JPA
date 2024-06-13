package com.demo.tv.repo;

import java.util.List;

import com.demo.tv.dto.TvDto;

public interface TvRepo {

	public boolean save(TvDto... dto);

	public List<TvDto> readAll();

	public List<TvDto> readById(int ... id);

	public boolean upadatePriceByName(int price, String name);

	public boolean deleteBySize(int size);
	
}
