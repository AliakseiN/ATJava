package page;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.TreeSet;

import home14.Button;
import home14.CustomExceptions;
import home14.DropDown;
import home14.Field;
import home14.InvalidCommandCallException;
import home14.Page;

public class TestPage {

	@Test
	public void testButton() {
		Button button = new Button("X", "Push");
		ArrayList<Button> buttons = new ArrayList<Button>();
		buttons.add(button);
		AssertJUnit.assertTrue(buttons.contains(button));
	}

	@Test(expectedExceptions = CustomExceptions.class)
	public void testException1() throws CustomExceptions {
		List<String> options = new ArrayList();
		options.add("Hello");
		DropDown dropdown1 = new DropDown(options, true, "Hi there");
		ArrayList<DropDown> dropdowns1 = new ArrayList();
		dropdowns1.add(dropdown1);
		Page page = new Page();
		page.printThirdElement().stream().forEach(drop -> System.out.println(drop.compareTo(dropdown1)));
	}

	@Test(expectedExceptions=NoSuchElementException.class)
	public void testFieldFirst() throws CustomExceptions {
		Field field1 = new Field(1,"22");
		Field field2 = new Field(2,"23");
		Field field3 = new Field(3,"24");
		
		LinkedList<Field> fields = new LinkedList<Field>();
		
		fields.add(field1);
		fields.add(field2);
		fields.add(field3);
		Page page = new Page();
		Assert.assertEquals(field1, page.getFirstField());
	}

	@Test(expectedExceptions=NoSuchElementException.class)
	public void testFieldLast() throws InvalidCommandCallException {
		Field field1 = new Field(1, "22");
		Field field2 = new Field(2, "33");
		Field field3 = new Field(3, "44");
		LinkedList<Field> fields = new LinkedList<Field>();
		fields.add(field1);
		fields.add(field2);
		fields.add(field3);
		Page page = new Page();
		Assert.assertEquals(field3, page.getLastField());
	}

	@Test(enabled = false)
	public void test() {

	}

}
