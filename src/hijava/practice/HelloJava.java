package hijava.practice;

public class HelloJava {

	public static void main(String[] args) {

//		 HelloJava에게 say라는 명령을 내림!
		HelloJava.say("Hi~");

//		JVM이 스스로 출력 
		System.out.println("Hello Java !!");
	}

	public static void say(String msg) {
		System.out.println(msg);
	}

}
