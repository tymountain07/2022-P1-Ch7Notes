package ReturnMultiParam;
public class Example {
    public static void main(String args[]){
        System.out.println("You are traveling from Tatooine to Mutsafar, a far distance");
        System.out.println("This is a  53,000 lightyear trip");
        // 2 minutes per lightyear on our estimate/
        System.out.println("It will take you " + StarWars.r2Estimate(53000.0) + " hours.");

    }
}
