
public class Welcome {
    public static String message() { //concats the whole welcome message into a return type so it doesnt have to be in the main code
        double dishcoveryCost = 2.99;
        double chefdecuisineCost = 7.99;
        double savantchefCost = 79.99;
        String line1 = "Don't know what to eat? Oui gotchu!"; //all the lines have their own variable so its more organized rather than using \n
        String line2 = "Welcome to Oui Chef! Where we curate you recipes based on ingredients you already have.";
        String line3 = "We offer 3 subscriptions to enhance your cooking experience";
        String line4 = "DishCovery: get unlimited recipes and tutorials";
        String line5 = "Cost: $" + dishcoveryCost + "/month";
        String line6 = "Chef De Cuisine: includes DishCovery & perosnilzed meal plans to help you reach your dieting goals";
        String line7 = "Cost: $" + chefdecuisineCost + "/month";
        String line8 = "Savant Chef: includes Chef De Cuisine";
        String line9 = "Cost: $" + savantchefCost + "/year";
        String[] lines = new String[]{line1, line2, line3, line4, line5, line6, line7, line8, line9}; //puts all the lines of text into an array
        StringBuilder paragraph = new StringBuilder();
        for(int i = 0; i < 9; i++) { //connects all the lines into one string
            paragraph.append(lines[i]).append("\n");
        }
        return(paragraph.toString()); //returns the paragrph of string when called in the runner code
    }
}



