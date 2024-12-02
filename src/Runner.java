
//import java.util.ArrayList;
//import java.util.Objects;
import java.util.Scanner;//imports scanner util

public class Runner //main code where user interaction happens
{
    public static void main(String[] args)
    {
        System.out.println(Welcome.message()); //prints the welcome message in the Welcome class
        Scanner user = new Scanner(System.in);
        System.out.println("Which subscription would you like to buy?");
        String subscriptionBought = user.nextLine();
        Subscription subscription1 = new Subscription(subscriptionBought); //creates an object depending on what subscription they bought
        System.out.println(subscription1.subscriptionPrint()); //prints out the subscription and cost
        Recipes recipe0 = new Recipes(); //creates a recipe object with no parameters
        recipe0.printTime(); //prints the time required of a recipe with 0 ingredients since none have been added yet
        System.out.println("You have no ingredients, add some to get recipes."); //askes what ingredients the user has
        System.out.println("Do you have carrots?");
        String holder = user.nextLine();
        System.out.println("Do you have rice?");
        String holder2 = user.nextLine();
        System.out.println("Do you have beef?");
        String holder3 = user.nextLine();
        Ingredients carrot1 = new Ingredients(holder, holder2, holder3); //inputs that information into the ingredients class to create an object
        Recipes recipe1 = new Recipes(carrot1.carrot, carrot1.rice, carrot1.beef); //creates recipe with 3 parameters
        recipe1.printName(); //prints the recipe they can make
        recipe1.printTime(); //prints estmated print time of recipe
        System.out.println("How many servings do you want of " + recipe1.name + "?"); //alters recipe object depending on servings wanted
        holder = user.nextLine();
        recipe1.addServing(Integer.parseInt(holder));
        System.out.println("Your new cook time is " + recipe1.time);



//        System.out.println("List ")
//        recipe option1 = new recipe();
//        String ingredients = user.nextLine();
//        String[] ingredientsList = new String[]{};
//        while(!Objects.equals(ingredients, "done")) {
//            List<String> ingredientList = new ArrayList<>();




    }
}


//default constrcutor == idk normal pbj recipes
//not default can be like if they have this extra ingredient like eggs so now they can make French toast pbj
//how to use reference type, can do like recipe = recipe that they want and if that equals recipe they can make then good if not no
//what attributes wanted in recipe construction
//what do we want the methods to do? I guess like shorten cook time, meal size
//ask them if tey have x ungredient, y, z
//set those as bools
//in another method if true false true, can make blah
//put all ingredients into array so can use for loop to go through all ingredients


