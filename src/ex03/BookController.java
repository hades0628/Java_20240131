package ex03;

import java.util.Scanner;

public class BookController {
	
	public static void main(String[] args) {
		
		details(new Novel("자바", "저자", 2024));
		details(new Magazine("자바", "저자", 2024));
		details(new Textbook("자바", "저자", 2024));
		
		
		
		
		
	}
	
	public static void details(Book book) {
		String msg = book.getDetails();
		System.out.println(msg);
		
		
		
		
		
		
				
	}

}
