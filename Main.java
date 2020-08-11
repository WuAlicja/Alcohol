package com.company;

public class Main {

    public static void main(String[] args) {

        Drinker drinker1=new Drinker("man", 80);
        Alcohol beer=new Alcohol("Beer",0.0325);
        Alcohol vodka=new Alcohol("Vodka",0.40);
        Alcohol wine=new Alcohol("Wine",0.103);
        Alcohol hooch=new Alcohol("Hooch",0.60);
        System.out.println("no alcohol accumulation");
       print(2,beer,drinker1);
       print(1,vodka,drinker1);
       print(1,wine,drinker1);
       print(1,hooch,drinker1);
        System.out.println("---------------------------------------");
        System.out.println("");
        System.out.println("with alcohol accumulation");

        drinker1.drink2(1,vodka);
        drinker1.drink2(2,wine);
        drinker1.drink2(4,beer);
        drinker1.drink2(1,vodka);
        drinker1.drink2(1,beer);
        System.out.println(drinker1.getGender()+" drunk "+drinker1.getMyQuantity()+
                " drinks and his current BAC is "+ (Math.round(drinker1.drink2(1,vodka)*10000))/100.0);

    }
    static void print (int quantity, Alcohol alcohol, Drinker drinker){

        System.out.println(drinker.getGender()+"("+drinker.getMass()+")kg will have "+
                (Math.round((drinker.drink(quantity,alcohol)*10000)))/100.0+" BAC blood alcohol content after drinking "
                +quantity*100+"ml of "+alcohol.getAlcoholName());
    }

}
