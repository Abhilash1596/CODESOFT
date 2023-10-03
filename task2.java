//Student Grade Calculator
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Mark Entry");
        System.out.println("----------");
        System.out.println();

        System.out.print("English = ");
        float eng=sc.nextInt();
        System.out.print("Math = ");
        float mth=sc.nextInt();
        System.out.print("Science = ");
        float snc=sc.nextInt();
        System.out.print("Hindi = ");
        float hin=sc.nextInt();
        System.out.print("Sanskrit = ");
        float sans=sc.nextInt();

        float total= eng + mth + snc + hin + sans;
        
        System.out.println();
        System.out.println("Total mark obtained = "+total+"/500");
        System.out.println();
        float prcnt=total/5;
        System.out.println("Total percentage obtained = "+prcnt+"%");
        System.out.println();
        if(prcnt>=80){
            System.out.println("Grade = O");
        }else if(prcnt>=70 && prcnt<80){
            System.out.println("Grade = A*");
        }else if(prcnt>=60 && prcnt<70){
            System.out.println("Grade = A");
        }else if(prcnt>=50 && prcnt<60){
            System.out.println("Grade = B");
        }
        else if(prcnt>=40 && prcnt<50){
            System.out.println("Grade = C");
        }
        else if(prcnt>=30 && prcnt<40){
            System.out.println("Grade = D");
        }
        else if(prcnt<30){
            System.out.println("Grade = Fail");
        }

    }
}
