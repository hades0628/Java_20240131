package ex02;

public class AnimalController {
	
	public static void main(String[] args) {
		Animal dog = new Dog();
		Animal cat = new Cat();
		Animal bird = new Bird();
		
		dog.makeSound();
		cat.makeSound();
		bird.makeSound();
		
		
		sound(new Dog());
		sound(new Cat());
		sound(new Bird());
		
	}
	
	static void sound(Animal animal) {
		animal.makeSound();
	}
	
	public void makeSound() {
		System.out.println("동물 소리");
	}

	
}
