package exception;

public class App {

    public static void main(String[] args) {
        try{
            Entier entierNatural=new Entier(500);
            entierNatural.decrementer();
            System.out.println(entierNatural.getVal());
        }catch (NbrNegatif e){
            System.out.println(e.getMessage());

        }
    }
}
