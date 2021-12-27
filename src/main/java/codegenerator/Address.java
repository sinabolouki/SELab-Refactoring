package codegenerator;

/**
 * Created by mohammad hosein on 6/28/2015.
 */
public abstract class Address {
    public int num;
    public VarType varType;

    public Address(int num, VarType varType) {
        this.num = num;
        this.varType = varType;
    }
    public abstract String toString();

}
