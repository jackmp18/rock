import java.util.Scanner;
public class rock
{ public static void main (String[] args)
    {   Scanner input = new Scanner(System.in);
        System.out.println("hey lets play rock paper scissors");
        System.out.println("type rock, paper, or scissors");
        int test =(int)(Math.random()*3);
           //rock is zero. paper is 1. scissors is 2
        String user = input.nextLine();
        if(user.contains("rock")||user.contains("paper")||user.contains("scissors")){
       
        if (user.equals("rock")&&test == 0){
        System.out.println("you tied computer chose rock");}
        else if (user.equals("rock")&&test == 1){
        System.out.println("you lost chose paper");} 
        else if (user.equals("rock")&&test == 2){
        System.out.println("you won computer chose scossors");} 
        else if (user.equals("scissors")&&test == 0){
        System.out.println("you lost chose rock");}
        else if (user.equals("scissors")&&test == 1){
        System.out.println("you win chose paper");}
        else if (user.equals("scissors")&&test == 2){
        System.out.println("you tied  chose scossors");}
        else if (user.equals("paper")&&test == 0){
        System.out.println("you win chose rock");}
        else if (user.equals("paper")&&test == 1){
        System.out.println("you tied chose paper"); }
        else if (user.equals("paper")&&test == 2){
        System.out.println("you lost  chose scossors");}
    }else{System.out.println("Invalid input!");}
    }// end of main method

}// end of my class