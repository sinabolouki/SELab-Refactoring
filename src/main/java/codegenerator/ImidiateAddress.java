package codegenerator;

public class ImidiateAddress extends Address{

    public ImidiateAddress(int num, codegenerator.varType varType) {
        super(num, varType);
    }

    public String toString() {
        return "#"+num;
    }
}
