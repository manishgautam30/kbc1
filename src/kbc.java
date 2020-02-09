/*     GAME syntax #KBC(kon banega codepati) version 1.0.1
       @Author : Manish Gautam
       username: manish_gautam_30
* */

import java.util.*;
import java.util.concurrent.*;

public class kbc {
    public static void main(String[] args){
        int a1=1,a2=2,a3=3,a4=4,a5=5;
        long limit1 = 180000000000L;
        Scanner sc=new Scanner(System.in);
        System.out.println("WELCOME TO #KBC (kon banega codepati).....\n Here are some rules :\n 1:you will be provided with 5 questions that must be answered in 3 minutes only.\n 2:Each time you answer a right question you will be redirected to another question \n 3:In case you answer wrong or takes more time than given th game will be ended. \n ");
        System.out.println(" Here is Question 1");
        long starttime1=System.nanoTime();
        int ans1=sc.nextInt();
        long endtime1=System.nanoTime();
        long time1=endtime1-starttime1;
        if(ans1==a1 && time1<=limit1){
            System.out.println("GREAT WORK...! \n Here is Question 2");
            long starttime2=System.nanoTime();
            int ans2=sc.nextInt();
            long endtime2=System.nanoTime();
            long time2=endtime2-starttime2;
            long limit2=limit1-time1;
            if(ans2==a2 && time2<=limit2){
                System.out.println("GREAT WORK...! \n Here is Question 3");
                long starttime3=System.nanoTime();
                int ans3=sc.nextInt();
                long endtime3=System.nanoTime();
                long time3=endtime3-starttime3;
                long limit3=limit2-time2;
                if(ans3==a3 && time3<=limit3){
                    System.out.println("GREAT WORK...! \n Here is Question 4");
                    long starttime4=System.nanoTime();
                    int ans4=sc.nextInt();
                    long endtime4=System.nanoTime();
                    long time4=endtime4-starttime4;
                    long limit4=limit3-time3;
                    if(ans4==a4 && time4<=limit4 ){
                        System.out.println("GREAT WORK...! \n Here is Question 5");
                        long starttime5=System.nanoTime();
                        int ans5=sc.nextInt();
                        long endtime5=System.nanoTime();
                        long time5=endtime5-starttime5;
                        long limit5=limit4-time4;
                        if(ans5==a5 && time5<=limit5){
                            System.out.println("You Win ------ CONGRATULATIONS \n Thanks for your support...... ");
                        }
                        else{
                            System.out.println(" Sorry Try Again....! ");
                        }
                    }
                    else{
                        System.out.println(" Sorry Try Again....! ");
                    }
                }
                else{
                    System.out.println(" Sorry Try Again....! ");
                }
            }
            else{
                System.out.println(" Sorry Try Again....! ");
            }

        }
        else{
            System.out.println(" Sorry Try Again....! ");
        }

    }
}