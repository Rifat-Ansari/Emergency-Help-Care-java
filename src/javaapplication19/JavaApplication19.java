/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication19;

import java .util.Scanner;


/**
 *
 * @author Dell
 */
public class JavaApplication19  {  
    
    // System.out.println(g.drawString());


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           
        
    
  
        
        System.out.println("             WELCOME TO EMERGENCY HELPCARE SYSTEM     \n\n            ");
     
        System.out.println("                      FUTURE IS HERE                   \n                      ");
        
        system();
    }
    
    public static void system(){
        
        
        Scanner input=new Scanner(System.in);
        
        System.out.println("1.Dhaka North ");
        
        System.out.println("2.Dhaka South ");
        
        System.out.println("3.EXIT ");
        
        System.out.println("Enter Your Choice : ");
        
        Dhaka_North D1= new Dhaka_North();
        Dhaka_South D2=new Dhaka_South();
        Gulshan G1=new Gulshan();
        Khilgaon K1=new Khilgaon();
        Mirpur M1=new Mirpur();
        Pollobi P1=new Pollobi();
        Tejgaon T1=new Tejgaon();
        Uttara U1=new Uttara();
        Cantonement C1=new Cantonement();
        Shabujbagh S1=new Shabujbagh();
        Mohammadpur M2=new Mohammadpur();
        Mugda M3=new Mugda();
        Kotowaly K2=new Kotowaly();
        Sutrapur S2=new Sutrapur();
        Lalbagh L1=new Lalbagh();
        Demra D3=new Demra();
        Ramna R1=new Ramna();
        Motijheel M4=new Motijheel();
        Dhanmondi D4=new Dhanmondi();
        Bangshal B2=new Bangshal();
       
        int a=input.nextInt();//First user input
        switch(a){
            case 1:{
                System.out.println(D1.toString());
                System.out.println("1.Gulshan");
                System.out.println("2.Khilgoan");
                System.out.println("3.Mirpur");
                System.out.println("4.Pollobi");
                System.out.println("5.Tejgoan");
                System.out.println("6.Uttara");
                System.out.println("7.Cantonement");
                System.out.println("8.Shabujbagh");
                System.out.println("9.Mohammadpur");
                System.out.println("10.Main Menu");
                int b=input.nextInt();//Second user input
                switch(b){
                    case 1:{
                        System.out.println("1.Rab Service");
                        System.out.println("2.Police Service");
                        System.out.println("3.Air Service");
                        System.out.println("4.Ambulence");
                        System.out.println("5.Fire Service");
                        System.out.println("6.Exit");
                        int c=input.nextInt();
                        switch(c){
                            case 1:{
                                System.out.println(G1.Show1());
                                System.out.println(G1.Show2());
                                System.out.println(G1.Show3());
                                break;
                                
                            }
                            case 2:{
                                System.out.println(G1.Show4());
                                System.out.println(G1.Show5());
                                System.out.println(G1.Show6());
                                break;
                            }
                            case 3: {
                                System.out.println(G1.Show7());
                                System.out.println(G1.Show8());
                                System.out.println(G1.Show9());
                                System.out.println(G1.Show10());
                                break;
                            }
                            case 4:{
                                System.out.println(G1.Show11());
                                System.out.println(G1.Show12());
                                System.out.println(G1.Show13());
                                System.out.println(G1.Show14());
                                break;
                                
                            }
                            case 5:{
                                System.out.println(G1.Show15());
                                System.out.println(G1.Show16());
                                break;
                            }
                            case 6:{
                                system();
                            }
                           
                         
                            
                            default :{
                                System.out.println("Invalid input");
                                break ;
                            }
                          
                        }
                        break;
                    }
                    case 2:{
                            System.out.println("1.Rab Service");
                            System.out.println("2.Police Service");
                            System.out.println("3.Air Service");
                            System.out.println("4.Ambulence");
                            System.out.println("5.Fire Service");
                            System.out.println("6.Exit");
                            int d=input.nextInt();
                            switch(d){
                                
                            case 1:{
                                System.out.println(K1.Show1());
                                System.out.println(K1.Show2());
                                System.out.println(K1.Show3());
                                break;
                                
                            }
                            case 2:{
                                System.out.println(K1.Show4());
                                System.out.println(K1.Show5());
                                System.out.println(K1.Show6());
                                break;
                            }
                            case 3: {
                                System.out.println(K1.Show7());
                                System.out.println(K1.Show8());
                                System.out.println(K1.Show9());
                                System.out.println(K1.Show10());
                                break;
                            }
                            case 4:{
                                System.out.println(K1.Show11());
                                System.out.println(K1.Show12());
                                System.out.println(K1.Show13());
                                System.out.println(K1.Show14());
                                break;
                                
                            }
                            case 5:{
                                System.out.println(K1.Show15());
                                System.out.println(K1.Show16());
                                break;
                            }
                            case 6:{
                                system();
                            }
                            default:{
                                System.out.println("Invalid Input");
                                break;
                            }
                          
                        }
                        break;
                        
                    }
                    case 3:{
                        System.out.println("1.Rab Service");
                        System.out.println("2.Police Service");
                        System.out.println("3.Air Service");
                        System.out.println("4.Ambulence");
                        System.out.println("5.Fire Service");
                        System.out.println("6.Exit");
                        int e=input.nextInt();
                        switch(e){
                            case 1:{
                                System.out.println(M1.Show1());
                                System.out.println(M1.Show2());
                                System.out.println(M1.Show3());
                                break;
                                
                            }
                            case 2:{
                                System.out.println(M1.Show4());
                                System.out.println(M1.Show5());
                                System.out.println(M1.Show6());
                                break;
                            }
                            case 3: {
                                System.out.println(M1.Show7());
                                System.out.println(M1.Show8());
                                System.out.println(M1.Show9());
                                System.out.println(M1.Show10());
                                break;
                            }
                            case 4:{
                                System.out.println(M1.Show11());
                                System.out.println(M1.Show12());
                                System.out.println(M1.Show13());
                                System.out.println(M1.Show14());
                                break;
                                
                            }
                            case 5:{
                                System.out.println(M1.Show15());
                                System.out.println(M1.Show16());
                                break;
                            }
                            case 6:{
                                system();
                            }
                            default :{
                                System.out.println("Sorry.Try again:'");
                            }
                          
                        }
                        break;
                        
                        
                    }  
                    case 4:{
                        System.out.println("1.Rab Service");
                        System.out.println("2.Police Service");
                        System.out.println("3.Air Service");
                        System.out.println("4.Ambulence");
                        System.out.println("5.Fire Service");
                        System.out.println("6.Exit");
                        int f=input.nextInt();
                        switch(f){
                            case 1:{
                                System.out.println(P1.Show1());
                                System.out.println(P1.Show2());
                                System.out.println(P1.Show3());
                                break;
                                
                            }
                            case 2:{
                                System.out.println(P1.Show4());
                                System.out.println(P1.Show5());
                                System.out.println(P1.Show6());
                                break;
                            }
                            case 3: {
                                System.out.println(P1.Show7());
                                System.out.println(P1.Show8());
                                System.out.println(P1.Show9());
                                System.out.println(P1.Show10());
                                break;
                            }
                            case 4:{
                                System.out.println(P1.Show11());
                                System.out.println(P1.Show12());
                                System.out.println(P1.Show13());
                                System.out.println(P1.Show14());
                                break;
                                
                            }
                            case 5:{
                                System.out.println(P1.Show15());
                                System.out.println(P1.Show16());
                                break;
                            }
                            case 6:{
                                system();
                            }
                            default :{
                                System.out.println("Pressed wrong button");
                            }
                          
                        }
                        break;
                        
                        
                        
                    }
                    case 5:{
                        System.out.println("1.Rab Service");
                        System.out.println("2.Police Service");
                        System.out.println("3.Air Service");
                        System.out.println("4.Ambulence");
                        System.out.println("5.Fire Service");
                        System.out.println("6.Exit");
                        int g=input.nextInt();
                        switch(g){
                            case 1:{
                                System.out.println(T1.Show1());
                                System.out.println(T1.Show2());
                                System.out.println(T1.Show3());
                                break;
                                
                            }
                            case 2:{
                                System.out.println(T1.Show4());
                                System.out.println(T1.Show5());
                                System.out.println(T1.Show6());
                                break;
                            }
                            case 3: {
                                System.out.println(T1.Show7());
                                System.out.println(T1.Show8());
                                System.out.println(T1.Show9());
                                System.out.println(T1.Show10());
                                break;
                            }
                            case 4:{
                                System.out.println(T1.Show11());
                                System.out.println(T1.Show12());
                                System.out.println(T1.Show13());
                                System.out.println(T1.Show14());
                                break;
                                
                            }
                            case 5:{
                                System.out.println(T1.Show15());
                                System.out.println(T1.Show16());
                                break;
                            }
                            case 6:{
                                system();
                            }
                            default :{
                                System.out.println("Something went wrong.");
                                break;
                            } 
                        }
                        break;
                        
                        
                        
                        
                    } 
                    case 6:{
                        System.out.println("1.Rab Service");
                        System.out.println("2.Police Service");
                        System.out.println("3.Air Service");
                        System.out.println("4.Ambulence");
                        System.out.println("5.Fire Service");
                        System.out.println("6.Exit");
                        int g=input.nextInt();
                        switch(g){
                            case 1:{
                                System.out.println(U1.Show1());
                                System.out.println(U1.Show2());
                                System.out.println(U1.Show3());
                                break;
                                
                            }
                            case 2:{
                                System.out.println(U1.Show4());
                                System.out.println(U1.Show5());
                                System.out.println(U1.Show6());
                                break;
                            }
                            case 3: {
                                System.out.println(U1.Show7());
                                System.out.println(U1.Show8());
                                System.out.println(U1.Show9());
                                System.out.println(U1.Show10());
                                break;
                            }
                            case 4:{
                                System.out.println(U1.Show11());
                                System.out.println(U1.Show12());
                                System.out.println(U1.Show13());
                                System.out.println(U1.Show14());
                                break;
                                
                            }
                            case 5:{
                                System.out.println(U1.Show15());
                                System.out.println(U1.Show16());
                                break;
                            }
                            case 6:{
                                system();
                            }
                            default :{
                                System.out.println("Please press the valid one");
                            }
                          
                            }
                            break;

                        
                            }

                            default :{
                                System.out.println("Its wrong!!!!");
                                break;

                            } 
                    case 7:{
                        System.out.println("1.Rab Service");
                        System.out.println("2.Police Service");
                        System.out.println("3.Air Service");
                        System.out.println("4.Ambulence");
                        System.out.println("5.Fire Service");
                        System.out.println("6.Exit");
                        int g=input.nextInt();
                        switch(g){
                            case 1:{
                                System.out.println(C1.Show1());
                                System.out.println(C1.Show2());
                                System.out.println(C1.Show3());
                                break;
                                
                            }
                            case 2:{
                                System.out.println(C1.Show4());
                                System.out.println(C1.Show5());
                                System.out.println(C1.Show6());
                                break;
                            }
                            case 3: {
                                System.out.println(C1.Show7());
                                System.out.println(C1.Show8());
                                System.out.println(C1.Show9());
                                System.out.println(C1.Show10());
                                break;
                            }
                            case 4:{
                                System.out.println(C1.Show11());
                                System.out.println(C1.Show12());
                                System.out.println(C1.Show13());
                                System.out.println(C1.Show14());
                                break;
                                
                            }
                            case 5:{
                                System.out.println(C1.Show15());
                                System.out.println(C1.Show16());
                                break;
                            }
                            case 6:{
                                system();
                            }
                            default :{
                                System.out.println("Please press the valid one");
                                break;
                            }
                          
                            }
                    
                    
                   
                         }
                     case 8:{
                        System.out.println("1.Rab Service");
                        System.out.println("2.Police Service");
                        System.out.println("3.Air Service");
                        System.out.println("4.Ambulence");
                        System.out.println("5.Fire Service");
                        System.out.println("6.Exit");
                        int g=input.nextInt();
                        switch(g){
                            case 1:{
                                System.out.println(S1.Show1());
                                System.out.println(S1.Show2());
                                System.out.println(S1.Show3());
                                break;
                                
                            }
                            case 2:{
                                System.out.println(S1.Show4());
                                System.out.println(S1.Show5());
                                System.out.println(S1.Show6());
                                break;
                            }
                            case 3: {
                                System.out.println(S1.Show7());
                                System.out.println(S1.Show8());
                                System.out.println(S1.Show9());
                                System.out.println(S1.Show10());
                                break;
                            }
                            case 4:{
                                System.out.println(S1.Show11());
                                System.out.println(S1.Show12());
                                System.out.println(S1.Show13());
                                System.out.println(S1.Show14());
                                break;
                                
                            }
                            case 5:{
                                System.out.println(S1.Show15());
                                System.out.println(S1.Show16());
                                break;
                            }
                            case 6:{
                                system();
                            }
                            default :{
                                System.out.println("Please press the valid one");
                                break;
                            }
                          
                        }
                     }
                      case 9:{
                        System.out.println("1.Rab Service");
                        System.out.println("2.Police Service");
                        System.out.println("3.Air Service");
                        System.out.println("4.Ambulence");
                        System.out.println("5.Fire Service");
                        System.out.println("6.Exit");
                        int g=input.nextInt();
                        switch(g){
                            case 1:{
                                System.out.println(M2.Show1());
                                System.out.println(M2.Show2());
                                System.out.println(M2.Show3());
                                break;
                                
                            }
                            case 2:{
                                System.out.println(M2.Show4());
                                System.out.println(M2.Show5());
                                System.out.println(M2.Show6());
                                break;
                            }
                            case 3: {
                                System.out.println(M2.Show7());
                                System.out.println(M2.Show8());
                                System.out.println(M2.Show9());
                                System.out.println(M2.Show10());
                                break;
                            }
                            case 4:{
                                System.out.println(M2.Show11());
                                System.out.println(M2.Show12());
                                System.out.println(M2.Show13());
                                System.out.println(M2.Show14());
                                break;
                                
                            }
                            case 5:{
                                System.out.println(M2.Show15());
                                System.out.println(M2.Show16());
                                break;
                            }
                            case 6:{
                                system();
                            }
                            default :{
                                System.out.println("Please press the valid one");
                                break;
                            }
                          
                        }
                      }
                      case 10:{
                          system();
                          break;
                      }
                
                }
            
        }
            case 2:{                                                        ///Dhaka South
                System.out.println(D2.toString());
                System.out.println("1.Mugda");
                System.out.println("2.Kotowaly");
                System.out.println("3.Sutrapur");
                System.out.println("4.Lalbagh");
                System.out.println("5.Demra");
                System.out.println("6.Romna");
                System.out.println("7.Motijheel");
                System.out.println("8.Dhanmondi");
                System.out.println("9.Bangshal");
         
                System.out.println("10.Main Menu");
                int b=input.nextInt();//Second user input
                switch(b){
                    case 1:{
                        System.out.println("1.Rab Service");
                        System.out.println("2.Police Service");
                        System.out.println("3.Air Service");
                        System.out.println("4.Ambulence");
                        System.out.println("5.Fire Service");
                        System.out.println("6.Exit");
                        int c=input.nextInt();
                        switch(c){
                            case 1:{
                                System.out.println(M3.Show1());
                                System.out.println(M3.Show2());
                                System.out.println(M3.Show3());
                                break;
                                
                            }
                            case 2:{
                                System.out.println(M3.Show4());
                                System.out.println(M3.Show5());
                                System.out.println(M3.Show6());
                                break;
                            }
                            case 3: {
                                System.out.println(M3.Show7());
                                System.out.println(M3.Show8());
                                System.out.println(M3.Show9());
                                System.out.println(M3.Show10());
                                break;
                            }
                            case 4:{
                                System.out.println(M3.Show11());
                                System.out.println(M3.Show12());
                                System.out.println(M3.Show13());
                                System.out.println(M3.Show14());
                                break;
                                
                            }
                            case 5:{
                                System.out.println(M3.Show15());
                                System.out.println(M3.Show16());
                                break;
                            }
                            case 6:{
                                system();
                            }
                         
                            
                            default :{
                                System.out.println("Invalid input");
                                break ;
                            }
                          
                        }
                        break;
                    }
                 
                    case 2:{
                        System.out.println("1.Rab Service");
                        System.out.println("2.Police Service");
                        System.out.println("3.Air Service");
                        System.out.println("4.Ambulence");
                        System.out.println("5.Fire Service");
                        System.out.println("6.Exit");
                        int c=input.nextInt();
                        switch(c){
                            case 1:{
                                System.out.println(K2.Show1());
                                System.out.println(K2.Show2());
                                System.out.println(K2.Show3());
                                break;
                                
                            }
                            case 2:{
                                System.out.println(K2.Show4());
                                System.out.println(K2.Show5());
                                System.out.println(K2.Show6());
                                break;
                            }
                            case 3: {
                                System.out.println(K2.Show7());
                                System.out.println(K2.Show8());
                                System.out.println(K2.Show9());
                                System.out.println(K2.Show10());
                                break;
                            }
                            case 4:{
                                System.out.println(K2.Show11());
                                System.out.println(K2.Show12());
                                System.out.println(K2.Show13());
                                System.out.println(K2.Show14());
                                break;
                                
                            }
                            case 5:{
                                System.out.println(K2.Show15());
                                System.out.println(K2.Show16());
                                break;
                            }
                            case 6:{
                                system();
                            }
                           
                         
                            
                            default :{
                                System.out.println("Invalid input");
                                break ;
                            }
                          
                        }
                    }
                    case 3:{
                        System.out.println("1.Rab Service");
                        System.out.println("2.Police Service");
                        System.out.println("3.Air Service");
                        System.out.println("4.Ambulence");
                        System.out.println("5.Fire Service");
                        System.out.println("6.Exit");
                        int c=input.nextInt();
                        switch(c){
                            case 1:{
                                System.out.println(S2.Show1());
                                System.out.println(S2.Show2());
                                System.out.println(S2.Show3());
                                break;
                                
                            }
                            case 2:{
                                System.out.println(S2.Show4());
                                System.out.println(S2.Show5());
                                System.out.println(S2.Show6());
                                break;
                            }
                            case 3: {
                                System.out.println(S2.Show7());
                                System.out.println(S2.Show8());
                                System.out.println(S2.Show9());
                                System.out.println(S2.Show10());
                                break;
                            }
                            case 4:{
                                System.out.println(S2.Show11());
                                System.out.println(S2.Show12());
                                System.out.println(S2.Show13());
                                System.out.println(S2.Show14());
                                break;
                                
                            }
                            case 5:{
                                System.out.println(S2.Show15());
                                System.out.println(S2.Show16());
                                break;
                            }
                            case 6:{
                                system();
                            }
                           
                         
                            
                            default :{
                                System.out.println("Invalid input");
                                break ;
                            }
                        }
                    }
                        case 4:{
                        System.out.println("1.Rab Service");
                        System.out.println("2.Police Service");
                        System.out.println("3.Air Service");
                        System.out.println("4.Ambulence");
                        System.out.println("5.Fire Service");
                        System.out.println("6.Exit");
                        int c=input.nextInt();
                        switch(c){
                            case 1:{
                                System.out.println(L1.Show1());
                                System.out.println(L1.Show2());
                                System.out.println(L1.Show3());
                                break;
                                
                            }
                            case 2:{
                                System.out.println(L1.Show4());
                                System.out.println(L1.Show5());
                                System.out.println(L1.Show6());
                                break;
                            }
                            case 3: {
                                System.out.println(L1.Show7());
                                System.out.println(L1.Show8());
                                System.out.println(L1.Show9());
                                System.out.println(L1.Show10());
                                break;
                            }
                            case 4:{
                                System.out.println(L1.Show11());
                                System.out.println(L1.Show12());
                                System.out.println(L1.Show13());
                                System.out.println(L1.Show14());
                                break;
                                
                            }
                            case 5:{
                                System.out.println(L1.Show15());
                                System.out.println(L1.Show16());
                                break;
                            }
                            case 6:{
                                system();
                            }
                           
                         
                            
                            default :{
                                System.out.println("Invalid input");
                                break ;
                            }
                        }
                    }
                        case 5:{
                        System.out.println("1.Rab Service");
                        System.out.println("2.Police Service");
                        System.out.println("3.Air Service");
                        System.out.println("4.Ambulence");
                        System.out.println("5.Fire Service");
                        System.out.println("6.Exit");
                        int c=input.nextInt();
                        switch(c){
                            case 1:{
                                System.out.println(D3.Show1());
                                System.out.println(D3.Show2());
                                System.out.println(D3.Show3());
                                break;
                                
                            }
                            case 2:{
                                System.out.println(D3.Show4());
                                System.out.println(D3.Show5());
                                System.out.println(D3.Show6());
                                break;
                            }
                            case 3: {
                                System.out.println(D3.Show7());
                                System.out.println(D3.Show8());
                                System.out.println(D3.Show9());
                                System.out.println(D3.Show10());
                                break;
                            }
                            case 4:{
                                System.out.println(D3.Show11());
                                System.out.println(D3.Show12());
                                System.out.println(D3.Show13());
                                System.out.println(D3.Show14());
                                break;
                                
                            }
                            case 5:{
                                System.out.println(D3.Show15());
                                System.out.println(D3.Show16());
                                break;
                            }
                            case 6:{
                                system();
                            }
                           
                         
                            
                            default :{
                                System.out.println("Invalid input");
                                break ;
                            }
                        }
                        }
                        case 6:{
                        System.out.println("1.Rab Service");
                        System.out.println("2.Police Service");
                        System.out.println("3.Air Service");
                        System.out.println("4.Ambulence");
                        System.out.println("5.Fire Service");
                        System.out.println("6.Exit");
                        int c=input.nextInt();
                        switch(c){
                            case 1:{
                                System.out.println(S2.Show1());
                                System.out.println(S2.Show2());
                                System.out.println(S2.Show3());
                                break;
                                
                            }
                            case 2:{
                                System.out.println(R1.Show4());
                                System.out.println(R1.Show5());
                                System.out.println(R1.Show6());
                                break;
                            }
                            case 3: {
                                System.out.println(R1.Show7());
                                System.out.println(R1.Show8());
                                System.out.println(R1.Show9());
                                System.out.println(R1.Show10());
                                break;
                            }
                            case 4:{
                                System.out.println(R1.Show11());
                                System.out.println(R1.Show12());
                                System.out.println(R1.Show13());
                                System.out.println(R1.Show14());
                                break;
                                
                                
                            }
                            case 5:{
                                System.out.println(R1.Show15());
                                System.out.println(R1.Show16());
                                break;
                            }
                            case 6:{
                                system();
                            }
                           
                         
                            
                            default :{
                                System.out.println("Invalid input");
                                break ;
                            }
                        }
                      }
                        case 7:{
                        System.out.println("1.Rab Service");
                        System.out.println("2.Police Service");
                        System.out.println("3.Air Service");
                        System.out.println("4.Ambulence");
                        System.out.println("5.Fire Service");
                        System.out.println("6.Exit");
                        int c=input.nextInt();
                        switch(c){
                            case 1:{
                                System.out.println(M4.Show1());
                                System.out.println(M4.Show2());
                                System.out.println(M4.Show3());
                                break;
                                
                            }
                            case 2:{
                                System.out.println(M4.Show4());
                                System.out.println(M4.Show5());
                                System.out.println(M4.Show6());
                                break;
                            }
                            case 3: {
                                System.out.println(M4.Show7());
                                System.out.println(M4.Show8());
                                System.out.println(M4.Show9());
                                System.out.println(M4.Show10());
                                break;
                            }
                            case 4:{
                                System.out.println(M4.Show11());
                                System.out.println(M4.Show12());
                                System.out.println(M4.Show13());
                                System.out.println(M4.Show14());
                                break;
                                
                            }
                            case 5:{
                                System.out.println(M4.Show15());
                                
                                break;
                            }
                            case 6:{
                                system();
                            }
                           
                         
                            
                            default :{
                                System.out.println("Invalid input");
                                break ;
                            }
                        }
                     }
                         case 8:{
                        System.out.println("1.Rab Service");
                        System.out.println("2.Police Service");
                        System.out.println("3.Air Service");
                        System.out.println("4.Ambulence");
                        System.out.println("5.Fire Service");
                        System.out.println("6.Exit");
                        int c=input.nextInt();
                        switch(c){
                            case 1:{
                                System.out.println(D4.Show1());
                                System.out.println(D4.Show2());
                                System.out.println(D4.Show3());
                                break;
                                
                            }
                            case 2:{
                                System.out.println(D4.Show4());
                                System.out.println(D4.Show5());
                                System.out.println(D4.Show6());
                                break;
                            }
                            case 3: {
                                System.out.println(D4.Show7());
                                System.out.println(D4.Show8());
                                System.out.println(D4.Show9());
                                System.out.println(D4.Show10());
                                break;
                            }
                            case 4:{
                                System.out.println(D4.Show11());
                                System.out.println(D4.Show12());
                                System.out.println(D4.Show13());
                                System.out.println(D4.Show14());
                                break;
                                
                            }
                            case 5:{
                                System.out.println(D4.Show15());
                                System.out.println(D4.Show16());
                                break;
                            }
                            case 6:{
                                system();
                            }
                           
                         
                            
                            default :{
                                System.out.println("Invalid input");
                                break ;
                            }
                        }
                      }
                        case 9:{
                        System.out.println("1.Rab Service");
                        System.out.println("2.Police Service");
                        System.out.println("3.Air Service");
                        System.out.println("4.Ambulence");
                        System.out.println("5.Fire Service");
                        System.out.println("6.Exit");
                        int c=input.nextInt();
                        switch(c){
                            case 1:{
                                System.out.println(B2.Show1());
                                System.out.println(B2.Show2());
                                System.out.println(B2.Show3());
                                break;
                                
                            }
                            case 2:{
                                System.out.println(B2.Show4());
                                System.out.println(B2.Show5());
                                System.out.println(B2.Show6());
                                break;
                            }
                            case 3: {
                                System.out.println(B2.Show7());
                                System.out.println(B2.Show8());
                                System.out.println(B2.Show9());
                                System.out.println(B2.Show10());
                                break;
                            }
                            case 4:{
                                System.out.println(B2.Show11());
                                System.out.println(B2.Show12());
                                System.out.println(B2.Show13());
                                System.out.println(B2.Show14());
                                break;
                                
                            }
                            case 5:{
                                System.out.println(B2.Show15());
                                System.out.println(B2.Show16());
                                break;
                            }
                            case 6:{
                                system();
                            }
                           
                         
                            
                            default :{
                                System.out.println("Invalid input");
                                break ;
                            }
                        }
                    
                        break;
                    }
                      
                 }   
                
            } 
            case 3:{
                    System.out.println("**** THANK YOU FOR USING OUR SERVICE ****    ");
                    System.exit(0);
                    break;
                            
                        }
                
            
            }
                  
         }       
      
    }
            
        
       
    


