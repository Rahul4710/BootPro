package com.app.service.impl;

import java.util.Collections;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.model.Uom;
import com.app.repo.UomRepository;
import com.app.service.IUomService;
@Service
public class UomServiceImpl implements IUomService {
	@Autowired
	private UomRepository repo;

	@Override
	public long save(Uom uom) {
		uom.setCreatedDate(new Date());
		repo.save(uom);
		return uom.getUomId();
	}

	@Override
	public void update(Uom uom) {
		uom.setLastModifiedDate(new Date());
		repo.save(uom);
	}

	@Override
	public void deleteById(long uomId) {
		repo.delete(uomId);
	}

	@Override
	public Uom getOneById(long uomId) {
		Uom uomObj=repo.getOne(uomId);
		return uomObj;
	}

	@Override
	public List<Uom> getAll() {
		List<Uom> uomList=repo.findAll();
		Collections.sort(uomList);
		return uomList;
	}

}
