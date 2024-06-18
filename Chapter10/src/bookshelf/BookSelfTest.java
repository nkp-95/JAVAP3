package bookshelf;

public class BookSelfTest {

	public static void main(String[] args) {
		// BookSelf 테스트
		Queue shelfQueue = new BookShelf();
		shelfQueue.enQueue("소년이 온다.");
		shelfQueue.enQueue("채식주의자.");
		shelfQueue.enQueue("데미안.");
		
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.deQueue());
		
		System.out.println(shelfQueue.getSize() + "권");

	}

}
