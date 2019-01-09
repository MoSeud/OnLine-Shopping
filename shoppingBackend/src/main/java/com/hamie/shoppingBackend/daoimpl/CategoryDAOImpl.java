package com.hamie.shoppingBackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.hamie.shoppingBackend.dao.CategoryDAO;
import com.hamie.shoppingBackend.dto.Category;

@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {

	private static List<Category> categories=new ArrayList<>();
	 static {
		 
		 Category category=new Category();
		 //adding first category
		 category.setId(1);
		 category.setName("Television");
		 category.setDescription("this is tv description for different brands");
		 category.setImgURL("E:\\Facebook Photos.36376233_1161965724195334_4005904486466846720_n.JPG");
		
		 categories.add(category);
		 
		 category=new Category();
		 //adding second category
		 category.setId(2);
		 category.setName("Mobile");
		 category.setDescription("this is Mobile description for different brands");
		 category.setImgURL("E:\\Facebook Photos.48426602_2431788680227437_2876930903458709504_n.PNG");
		
		 categories.add(category);
		 
		 category=new Category();
		 //adding second category
		 category.setId(3);
		 category.setName("Computer");
		 category.setDescription("this is computer description for different brands");
		 category.setImgURL("E:\\Facebook Photos.48426602_2431788680227437_2876930903458709504_n.PNG");
		
		 categories.add(category);
		 
	 }
	
	@Override
	public List<Category> list() {
		return categories;
	}

	@Override
	public Category get(int id) {
		//we use for each loop
		for(Category category: categories) {
			if(category.getId()==id)
				return category;
		}
		return null;
	}

}
