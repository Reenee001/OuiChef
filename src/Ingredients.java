
public class Ingredients {
    public boolean carrot; //these are public so i can use them in main code
    public boolean rice;
    boolean beef;

    public Ingredients(String holder, String holder2, String holder3 ) { //constructor depending on what user said, it knows which ingredients you have
        if (holder.equals("yes")) {
            carrot = true;
        }
        else if (holder.equals("no")) {
            carrot = false;
        }
        if (holder2.equals("yes")) {
            rice = true;
        }
        else if (holder2.equals("no")) {
            rice = false;
        }
        if (holder3.equals("yes")) {
            beef = true;
        }
        else if (holder3.equals("no")) {
            beef = false;
        }
    }
//    public carrot();
//    static boolean carrot;
//
//    public boolean carrot(String holder) {
//        if (holder.equals("yes")) {
//            carrot = true;
//        }
//        else if (holder.equals("no")) {
//            carrot = false;
//        }
//        else {
//            System.out.println("Please answer \"yes\" or \"no\".");
//            holder = user.nextLine();
//            if (holder.equals("yes")) {
//                carrot = true;
//            }
//            else if (holder.equals("no")) {
//                carrot = false;
//            }
//        }
//    }
}



