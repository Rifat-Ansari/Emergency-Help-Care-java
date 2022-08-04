/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication19;

/**
 *
 * @author Dell
 */
public class Mohammadpur extends Dhaka_North{
     String phone1="01734722001";
      String phone2="01907311002";
      String phone3="01798008099";
      String phone4="01788848098";
      String phone5="01111442233";
      String phone6="02222443344";
      String phone7="03333664455";
      String phone8="01245454555";
      String phone9="01311665666";
      String phone10="01404466777";
      String phone11="029999111";
      
    
    Mohammadpur(){
        
    }
    Mohammadpur(String phone1,String phone2,String phone3,String phone4,String phone5, String phone6,String phone7,String phone8,String phone9,String phone10,String phone11){
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
        this.phone11=phone11;
    }
    public String Show1(){
        return"WELCOME TO RAB SERVICE";
    }
    public String Show2()
    {
        return "Rab Control Room="+this.phone1;
    }
    public String Show3(){
        return "Officer in Charge="+this.phone2;
    }
    
    
    public String Show4(){
        return"WELCOME TO GULSHAN POLICE STATION";
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
        return"WELCOME TO  GULSHAN AMBULANCE SERVICE";
    }
    public String Show12(){
        return"1.Alif Hoapital Ambulance Service:"+this.phone8;
    }
    public String Show13(){
        return "2.Gulshan National  Hospital Ambulance Service:"+this.phone9;
    }
    public String Show14(){
        return"3.Anjuman Mofidul Islam Ambulance Service:"+this.phone10;
    }
    public String Show15(){
        return "WELCOME TO  GULSHAN FIRE SERVICE";
    }
    public String Show16(){
        return "Gulshans Heat Quater:"+this.phone11;
    }
}

    

