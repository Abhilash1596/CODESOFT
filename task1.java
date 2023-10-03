//Number Game
import java.util.Scanner;
import java.lang.Math;
public class task1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Number Game");
        System.out.println("* * * * * * * * * * *");
        System.out.println();
        System.out.print("Guess an number between 1-100 : ");
        int num=sc.nextInt();
        System.out.println();
        int range=100;
        int rand=(int)(Math.random()*range);
        int i;
        int atp=3;
        for(i=1;i<=3;i++){
            System.out.println(atp+" more attempt");
            atp=atp-1;
            System.out.println();
        if(rand>num){
            System.out.println("You are too low");
            System.out.print("guess another number :");
            num=sc.nextInt();
        }else if(rand<num){
            System.out.println("You are too high");
            System.out.print("guess another number :");
            num=sc.nextInt();
        }else if(rand==num){
            System.out.println("Congratulations, You guess the correct number");
            break;
        }
    System.out.println();
    }
        if(i==1){
            System.out.println("Score = 3");
        }else if(i==2){
            System.out.println("Score = 2");
        }
        else if(i==3){
            System.out.println("Score = 1");
        }
        else{
            System.out.println("Score = 0");
        }
    }
}
