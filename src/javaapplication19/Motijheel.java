/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication19;

/**
 *
 * @author User
 */
public class Motijheel extends Dhaka_South {
     String phone1="01777710399";
      String phone2="01777710310";
      String phone3="+8801199883726";
      String phone4="+8801713373152";
      String phone5="027911042";
      String phone6="0821714243";
      String phone7="312500900";
      String phone8="8113721";
      String phone9="9120288";
      String phone10="7218329";
     
      
    
    Motijheel(){
        
    }
    Motijheel(String phone1,String phone2,String phone3,String phone4,String phone5, String phone6,String phone7,String phone8,String phone9,String phone10,String phone11){
        this.phone1=phone1;
        this.phone2=phone2;
        this.phone3=phone3;
        this.phone4=phone4;
        this.phone5=phone5;
        this.phone6=phone6;
        this.phone7=phone7;
        this.phone8=phone8;
        this.phone9=phone9;
        this.phone10=phone10;
       
    }
    public String Show1(){
        return"WELCOME TO  Motijheel RAB SERVICE";
    }
    public String Show2()
    {
        return "Rab Control Room="+this.phone1;
    }
    public String Show3(){
        return "Officer in Charge="+this.phone2;
    }
    
    
    public String Show4(){
        return"WELCOME TO Motijheel POLICE STATION";
    }
    public String Show5(){
        return "Duty officer=" +this.phone3;
    }
    public String Show6(){
        return "Officer in charge=" +this.phone4;
    }
    public String Show7(){
        return"WELCOME TO AIRLINCE SERVICE";
    }
    public String Show8(){
        return"1.HAZRAT SHAH JALAL INTERNATIONAL AIRPORT(DHAKA):"+this.phone5;
    }
    public String Show9(){
        return"2.OSMANI INTERNATIONAL AIRPORT(SHYLET):"+this.phone6;
    }
    public String Show10(){
        return "3.HAZRAT AMANAT INTERNATIONAL AIRPORT(CHITTAGOAN)"+this.phone7;
        
    }
    public String Show11(){
        return"WELCOME TO Motijheel AMBULANCE SERVICE";
    }
    public String Show12(){
        return"1.Medinova Medical Service Ltd:"+this.phone8;
    }
    public String Show13(){
        return "2.Medinova Medical Service Ltd:"+this.phone9;
    }
    public String Show14(){
        return "WELCOME TO FIRE SERVICE";
    }
    public String Show15(){
        return "Head Quater:"+this.phone10;
    }
    


    
}


