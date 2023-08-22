import java.util.Scanner;

class area {
    int length;
    int breath;
    int result;

    public void run1() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of rectangle");
        length = sc.nextInt();

        System.out.println("Enter the breadth of rectangle");
        breath = sc.nextInt();

        result = length * breath; // Calculate the area after getting values

        System.out.println("The area of the rectangle is: " + result);
    }

    public void run2() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of rectangle");
        length = sc.nextInt();

        System.out.println("Enter the breadth of rectangle");
        breath = sc.nextInt();

        result = length + breath; // Calculate the area after getting values

        System.out.println("The parameter of the rectangle is: " + result);

    }
}

class Area {
    public static void main(String[] args) {
        area a = new area();
        Scanner s1 = new Scanner(System.in);
        System.out.println("1.to calculate area");
        System.out.println("2.to calculate parameters");
        int choice = s1.nextInt();

        switch (choice) {
            case 1:
                a.run1();
                break;
            case 2:
                a.run2();
                break;
        }

    }

}