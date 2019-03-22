package com.entcord.shoppingbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import javax.management.Query;

import org.springframework.stereotype.Repository;

import com.entcord.shoppingbackend.dao.CategoryDAO;
import com.entcord.shoppingbackend.dto.Category;


@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {
	
	private static List<Category> categories = new ArrayList<>();
	
	static {
		
		Category category = new Category();
		
		//adding first category
		
		category.setId(1);
		category.setName("Shoes");
		category.setDescription("Shoes category");
		category.setImageURL("CAT_1.png");
		
		categories.add(category);
		
		
        category = new Category();
		
		//adding second category
		
		category.setId(2);
		category.setName("Clothing");
		category.setDescription("Clothing category");
		category.setImageURL("CAT_2.png");
		
		categories.add(category);
		
		
        category = new Category();
		
		//adding third category
		
		category.setId(3);
		category.setName("Accessories");
		category.setDescription("Accessories category");
		category.setImageURL("CAT_3.png");
		
		categories.add(category);
		
	}
	
	public List<Category> list() {
	
	return categories;
	
	}

	@Override
	public Category get(int id) {
		
		for(Category category: categories) {
			
			if(category.getId() == id) {
				
				return category;
				
			}
		}
		
		return null;
		
	}
}
