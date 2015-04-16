package ua.lviv.lgs.dao;

import java.io.Serializable;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.PagingAndSortingRepository;

public class DepartmentDao implements PagingAndSortingRepository {

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delete(Serializable arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Object arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Iterable arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean exists(Serializable arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable findAll(Iterable arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object findOne(Serializable arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object save(Object arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable save(Iterable arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable findAll(Sort arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page findAll(Pageable arg0) {
		// TODO Auto-generated method stub
		return null;
	}

}
