package bookshelf;

import java.util.ArrayList;

public class Shelf {
	//멤버 변수
	protected ArrayList<String> shelf;
	public Shelf() {
		shelf = new ArrayList<String>();
	}
	
	public ArrayList<String>getShelf(){
		return shelf;
	}
	
	public int getCount() {
		return shelf.size();
	}
}
