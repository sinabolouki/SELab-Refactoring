package codegenerator;

public class DirectAddress extends Address{

    public DirectAddress(int num, codegenerator.varType varType) {
        super(num, varType);
    }

    public String toString() {
        return num+"";
    }
}
