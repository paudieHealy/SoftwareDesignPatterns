/**
 * Created by paudie on 10/10/2017.
 */
public class Duck {

    public String fly(String ducktype){
        if(ducktype.equals("decoyduck")){
            System.out.println("I can't fly");
        }else if(ducktype.equals("mallarduck")){
            System.out.println("I'm flying!!");
        }else if(ducktype.equals("redheadduck")){
            System.out.println("I'm flying!!");
        }else if(ducktype.equals("rubberduck")){
            System.out.println("I can't fly!!");
        }else if(ducktype.equals("modelduck")){
            System.out.println("I can't fly");
        }

        return "I'm flying";
    }

    public String swim(String ducktype){
        return "All ducks float, even decoys!";
    }

    public String display(String ducktype) {
        if (ducktype.equals("decoyduck")) {
            System.out.println("I'm a duck Decoy");
        } else if (ducktype.equals("mallardduck")) {
            System.out.println("I'm a real Mallard duck");
        } else if (ducktype.equals("redheadduck")) {
            System.out.println("I'm a real Redhead duck");
        } else if (ducktype.equals("rubberduck")) {
            System.out.println("I'm a rubber duckie");
        } else if (ducktype.equals("modelduck")) {
            System.out.println("I'm a model duck");
        }

        return "I'm a duck Decoy";
    }

}
