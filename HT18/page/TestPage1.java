package page;



import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;

import java.util.LinkedList;
import java.util.NoSuchElementException;

import org.testng.Assert;

import home14.CustomExceptions;
import home14.Field;
import home14.Label;
import home14.Page;

public class TestPage1 {

	@Test
	public void testHashSet() {
		Label label1 = new Label("Yy");
		Label label2 = new Label("Ss");
		Label[] labels = { label1, label2 };
		Page page=new Page();
		AssertJUnit.assertNotSame(labels,page.compareLabels(label1, label2));		
	}
	@Test
	public void testLabel() {
		Label label1 = new Label("Yy");
		Label label2 = new Label("Ss");
		Page page = new Page();
		AssertJUnit.assertNotSame(label1, label2);
	}
		
	
	@Test(expectedExceptions=NoSuchElementException.class)
	public void testFieldFirstException() throws CustomExceptions {
		Page page = new Page();
		LinkedList<Field> fields = new LinkedList<Field>();
		page.getFirstField();
	}
	
	@Test(expectedExceptions=NoSuchElementException.class)
	public void testFieldLastException() throws CustomExceptions {
		Page page = new Page();
		LinkedList<Field> fields = new LinkedList<Field>();
		page.getLastField();
	}
	@Test(enabled = false)
	
	public void test() {
		
	}

}
