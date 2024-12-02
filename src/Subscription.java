
public class Subscription {
    String subscriptionBought;
    private double dishcoveryCost = 2.99; //these are private variables as theyre only used in this class
    private double chefdecuisineCost = 7.99;
    private double savantchefCost = 79.99;
    double cost;

    public Subscription(String type) { //constructor to make object of subscription they bought
        if(type.equals("DishCovery")) {
            subscriptionBought = "DishCovery";
            cost = dishcoveryCost;
        }
        if(type.equals("Chef De Cuisine")) {
            subscriptionBought = "Chef De Cuisine";
            cost = chefdecuisineCost;
        }
        if(type.equals("Savant Chef")) {
            subscriptionBought = "Savant Chef";
            cost = savantchefCost;
        }
    }

    public String subscriptionPrint() { //return type to return the subscription they bought and price
        String message = "You have been charged " + cost + "\nYou have bought " + subscriptionBought;
        return(message);
    }
}



