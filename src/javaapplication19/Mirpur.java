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
public class Mirpur extends Dhaka_North {
     String phone1="01111111001";
      String phone2="01222211002";
      String phone3="01799999099";
      String phone4="01766666098";
      String phone5="01111222233";
      String phone6="02222333344";
      String phone7="03333444455";
      String phone8="01523344555";
      String phone9="013987455666";
      String phone10="014985566777";
      String phone11="0299099111";
      
    
    Mirpur(){
        
    }
    Mirpur(String phone1,String phone2,String phone3,String phone4,String phone5, String phone6,String phone7,String phone8,String phone9,String phone10,String phone11){
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
        return"WELCOME TO  MIRPUR RAB SERVICE";
    }
    public String Show2()
    {
        return "Rab Control Room="+this.phone1;
    }
    public String Show3(){
        return "Officer in Charge="+this.phone2;
    }
    
    
    public String Show4(){
        return"WELCOME TO MIRPUR POLICE STATION";
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
        return"WELCOME TO MIRPUR AMBULANCE SERVICE";
    }
    public String Show12(){
        return"1.DESI Ambulance Service:"+this.phone8;
    }
    public String Show13(){
        return "2.Al AMIN  Ambulance Service:"+this.phone9;
    }
    public String Show14(){
        return"3.Anjuman Mofidul Islam Ambulance Service:"+this.phone10;
    }
    public String Show15(){
        return "WELCOME TO FIRE SERVICE";
    }
    public String Show16(){
        return "MIRPUR-10 Heat Quater:"+this.phone11;
    }


    
}
