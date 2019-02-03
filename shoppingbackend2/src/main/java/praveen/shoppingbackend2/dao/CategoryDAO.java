package praveen.shoppingbackend2.dao;

import java.util.List;

import praveen.shoppingbackend2.dto.Category;

public interface CategoryDAO {

	boolean add(Category category);
	
	List<Category> list();
	Category get(int id);
}
