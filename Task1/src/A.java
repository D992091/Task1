import java.util.Scanner;

public class A {
	
	public static String checkNumber(String arr){
		String result = "";
		if(arr.isEmpty()){
			return "Строка пустая";
		} else {
			String[] arr1 = arr.trim().split(" ");
			for (int i = 0; i < arr1.length; i++) {
				try {
					int a = Integer.valueOf(arr1[i]);
					boolean chet = true;
					while (a / 10 > 0) {
						if (a % 10 % 2 == 0) {
							a = a / 10;
						} else {
							chet = false;
						}
					}
					
					if (a % 2 != 0) {
						chet = false;
					}
					if (chet) {
						result += arr1[i];
						result += " ";
					}
					
				} catch (Exception e) {
					result = "Введено неверное число";
				}
			}
		}
			result.trim();
			
			return result.toString();
		}
	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print ("Enter number of strings: n = ");
		int stringCount = Integer.parseInt(in.next());
		in.nextLine();
		String[] stringArray = new String[stringCount];
			for (int i = 0; i < stringArray.length; i++) {
			    System.out.println("Enter " + (i + 1) + ". string: ");
				stringArray[i] = in.nextLine();
				System.out.println(checkNumber(stringArray[i]));
			}
		in.close();
	}
}
