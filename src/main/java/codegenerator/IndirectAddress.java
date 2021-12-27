package codegenerator;

public class IndirectAddress extends Address {

    public IndirectAddress(int num, codegenerator.varType varType) {
        super(num, varType);
    }

    public String toString() {
        return "@"+num;
    }
}
