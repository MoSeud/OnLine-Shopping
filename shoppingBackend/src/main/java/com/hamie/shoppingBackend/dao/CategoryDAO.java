package com.hamie.shoppingBackend.dao;

import java.util.List;

import com.hamie.shoppingBackend.dto.Category;
public interface CategoryDAO {

	List<Category> list();
	Category get(int id);
}
