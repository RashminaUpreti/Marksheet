/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rashmina.hseb2darray;

import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author Rashu
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(true){
            String result="";
            String[] rankedStudents={""};
            String[] students={"John","Paul","George","Ringo","Kurt"};
            String[] subjects={"Physics","Biology","Chemistry","English","Nepali"};
            double[] sum=new double[students.length];
            double[] total=new double[students.length]; 
            double[][] marks=new double[students.length][subjects.length];
            for(int i=0;i<students.length;i++){
                sum[i]=0;
                for(int j=0;j<subjects.length;j++){
                    System.out.println("Enter marks of" + " " +students[i]+ " in "+subjects[j]);
                    marks[i][j] = input.nextDouble();
                    if(marks[i][j]<32){ 
                        result="fail";}
                    sum[i] = sum[i] + marks[i][j];
                }    
                if(result.equals("fail")){
                    System.out.println("Fail");
                }
                else{
                 total[i]=sum[i]/5;
                 System.out.println("Percentage of " +students[i]+ " is:"+total[i]);
                    if(total[i]>=60 && total[i]<80) {
                    System.out.println("First Div ");
                    }else if(total[i]>=80){
                    System.out.println("Distinction");
                    }else if(total[i]<=60 && total[i]>= 45){
                    System.out.println("Second Div ");
                    }else if(total[i]<=45 && total[i]>= 32){
                    System.out.println("Third Div ");   
                }
                
            }
            /*for(int k=students.length-1;k>0;k--)
            {
                double currentMax = total[0];
                int currentMaxIndex = 0;
                for (int l = 1; l <= k; l++){
                    if (currentMax < total[l]){
                        currentMax = total[l];
                        currentMaxIndex = l;
                    }
                }
                total[currentMaxIndex] = total[k];
                total[k] = currentMax;
                System.out.println("Ranking is:");
            }*/
            System.out.println("Do you want to continue[Y/N]?");
            String ch=input.next();
            if(ch.equalsIgnoreCase("n")){
                System.exit(0);
            }
        }    
    }  
        
            }
}
    