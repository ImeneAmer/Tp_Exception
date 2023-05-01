package exception;

public class Entier {

    private int val;

    public int getVal() {
        return val;
    }
    public void setVal(int val) throws NbrNegatif {
        if (val<0) throw new  NbrNegatif("valide");
        this.val = val;
    }

    public Entier(int val) throws NbrNegatif  {
        if (val<0) throw new  NbrNegatif("valeur negatif");
        this.val = val;
    }

    public void decrementer()  throws NbrNegatif{
        if(val<=0) throw new NbrNegatif("Attention decrementation");
        val--;
    }
}
