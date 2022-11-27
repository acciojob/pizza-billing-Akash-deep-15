package com.driver;

public class Pizza {

    private int price=0;

    private int basePrice = 0;
    private Boolean isVeg;
    private String bill = "";
    private Boolean deluxe = false;
    private Boolean extraCheese = false;
    private Boolean extraToppings = false;
    private Boolean takeAway = false;
    private Boolean billGenerated = false;


    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        if(isVeg == true) {
            price += 300;
            basePrice = price;
        }
        else {
            price += 400;
            basePrice = price;
        }
    }
    public void ifDeluxe(Boolean del) {
        deluxe = del;
        if(isVeg) {
            price += 80 + 70;
        }
        else
            price += 80 + 120;

        extraCheese = true;
        extraToppings= true;
    }
    public int getPrice(){
        return this.price;
    }


    public void addExtraCheese(){
        if(extraCheese == false) {
                price += 80;
        }
        extraCheese = true;
    }

    public void addExtraToppings(){
        if(extraToppings == false) {
            if(isVeg == true)
                price += 70;
            else
                price += 120;
        }
        extraToppings = true;
    }

    public void addTakeaway(){
        if(takeAway == false) {
            price += 20;
        }
        takeAway = true;
    }

    public String getBill(){

        if(billGenerated == false) {
            if (isVeg == true)
                bill += "Base Price Of The Pizza: " + basePrice + "\n";
            else
                bill += "Base Price Of The Pizza: " + basePrice + "\n";


            if (deluxe == true || extraCheese == true)
                bill += "Extra Cheese Added: 80 \n";

            if (deluxe == true || extraToppings == true) {
                if (isVeg == true)
                    bill += "Extra Toppings Added: 70 \n";
                else
                    bill += "Extra Toppings Added: 120 \n";
            }

            if (takeAway == true) {
                bill += "Paperbag Added: 20 \n";
            }
            bill += "Total Price: " + String.valueOf(price) + "\n";


        }
        billGenerated = true;
        return this.bill;
    }
}
