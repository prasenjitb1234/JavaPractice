package com.OOP.abstraction;

// abstract class animal 

abstract class animal {
	
//	animal(){
//		System.out.println("All animals... !");
//	}
	
	public abstract void sound();
}

class Dog extends animal{
//	Dog(){
//		super();
//	}
	public void sound() {
		System.out.println("Dog is Barking");
	}
}
class Lion extends animal{
	
	public void sound() {
		System.out.println("Lion is Roaring");
	}
}

class Demo{
	public static void main(String[] args) {
		
		Dog d = new Dog();
		Lion l = new Lion();
		d.sound();
		l.sound();
		
	}
	
}