package page;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import static org.testng.AssertJUnit.assertNotNull;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import home14.Field;
import home14.Label;
import home14.Page;

import static org.hamcrest.CoreMatchers.*;
import static org.testng.Assert.assertNull;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

import org.hamcrest.Matcher;

@Test
public class TestPage3 {
	
	@Test
	public void testTitle() {
		Page page = new Page();
		Assert.assertNotNull(page.title);
	}

	
	@Test
	public void testid() {
		Page page = new Page();
		AssertJUnit.assertNotNull(page.field);
	}

	
	@Test
	public void testFields() {
		Page page = new Page();
		
		Assert.assertEquals(new LinkedList<Field>(), page.field);
	}

	
	@Test
	public void testLabel() {
		HashSet<Label> label = new HashSet<Label>();
		Label label1 = new Label("Hello");
		Label label2 = new Label("Hello");
		Page page = new Page();
		Assert.assertNotEquals(label2,label1 );
	}

	
	@Test
	public void testSame() {
		Label label1 = new Label("Hi there");
		Label label2 = new Label("Good morning");
		Label[] labels = { label1, label2 };
		ArrayList<Label> labels1 = new ArrayList<Label>();
		labels1.add(label1);
		labels1.add(label2);
		Assert.assertNotSame(labels, labels1);
	}
}
