package com.spring.service;

import com.spring.repository.JpaDao;

public class MyServiceImp {
	private JpaDao repository;
	public JpaDao getRepository() {
		return repository;
	}
	
	public void setRepository(JpaDao repository) {
		this.repository = repository;
	}

}
