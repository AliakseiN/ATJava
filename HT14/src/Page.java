import java.util.*;

public class Page {

	private ArrayList<Button> button;
	private LinkedList<Field> field;
	private HashSet<Label> label;
	private TreeSet<DropDown> dropdown;
	private float id;
	private String title;

	// 3 Класс Page содержит пустой конструктор, в котором полям класса
	// присваиваются пустые значение
	

	public Page() {


		this.button = new ArrayList<Button>();
		this.field = new LinkedList<Field>();
		this.label = new HashSet<Label>();
		this.dropdown = new TreeSet<DropDown>();
		this.id = 0;
		this.title = "";
	}

	/*
	 * 4 Инициализация полей класса Page значениями происходит либо через
	 * перегруженный конструктор, либо через set - одно на выбор
	 */

	public Page(ArrayList<Button> button, LinkedList<Field> field, HashSet<Label> label, TreeSet<DropDown> dropdown,
			float id, String title) {

		this.button = button;
		this.field = field;
		this.label = label;
		this.dropdown = dropdown;
		this.id = id;
		this.title = title;

	}

	// проверку, содержится ли кнопка в списке. возвращает boolean

	

	

	public boolean buttonExistence() {
		return this.button.contains(button);

	}

}
