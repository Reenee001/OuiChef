
import static java.lang.Math.abs;

public class Recipes {
    int time;
    String name;

    //    public recipe(String ingredientOne, String ingredientTwo, String ingredientThree) {
//        if() {
//        }
//    }
    public Recipes() { //constructor for a 0 parameter constructor
        time = 0;
    }
    public Recipes(boolean carrot, boolean rice, boolean beef){ //constrcutor for 3 parameters
        //depending on which of those 3 ingredients u have, it tells you what recipe u can make and the cook time
        if ((carrot == true) && (rice == true) && (beef == true) ) {
            time = 15;
            name = "Stir fry carrots and beef over rice";
        }
        if ((carrot == false) && (rice == true) && (beef == true)) {
            time = 10;
            name = "beef over rice";
        }
        if ((carrot == false) && (rice == false) && (beef == true)) {
            time = 5;
            name = "seasoned beef";
        }
        if ((carrot == false) && (rice == false) && (beef == false)) {
            time = 0;
            name = "You have no ingredients, add some to get recipes.";
        }
        if ((carrot == true) && (rice == false) && (beef == true)) {
            time = 10;
            name = "beef with sauted carrots";
        }
        if ((carrot == true) && (rice == false) && (beef == false)) {
            time = 5;
            name = "boiled carrot soup";
        }
        if ((carrot == true) && (rice == true) && (beef == false)) {
            time = 10;
            name = "peppered carrots over rice";
        }
        if ((carrot == false) && (rice == true) && (beef == false)) {
            time = 5;
            name = "plain rice";
        }
    }

    public void printTime() {//method to print cook time of recipe
        System.out.println("This recipe will take " + abs(time) + " minutes.");
    }

    public void addServing(int servings) {//method to change time depending on number of servings
        time= time + (servings*10);
    }

    public void printName() {//method to print name of recipe you can make
        System.out.println("You can make " + name);
    }

//
//    public void recipe() {
//        time = 0;
//    }
//
//    public void recipe(String ingredientOne) {
//        time = 10;
//    }
//
//    public void recipe(String ingredientOne, String ingredientTwo) {
//
//        time = 20;
//    }
}




