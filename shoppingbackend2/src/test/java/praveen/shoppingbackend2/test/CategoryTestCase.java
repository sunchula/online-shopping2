package praveen.shoppingbackend2.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import praveen.shoppingbackend2.dao.CategoryDAO;
import praveen.shoppingbackend2.dto.Category;

@ComponentScan(basePackages = "praveen.shoppingbackend2,praveen.onlineShoppingSpring2") 
public class CategoryTestCase {

	private static AnnotationConfigApplicationContext context;
	
	private static CategoryDAO categoryDAO;
	
	private Category category;
	
	
	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("praveen.shoppingbackend2");
		context.refresh();
		categoryDAO = (CategoryDAO) context.getBean("categoryDAO");
	}
	
	@Test
	public void testAddCategory() {
		
		category = new Category();
		
		category.setName("Television");
		category.setDescription("This is Some Description of Television");
		category.setImageURL("CAT_1.png");
		
		assertEquals("Successfully added a Category inside the Table", true,categoryDAO.add(category));
		
	}
}
