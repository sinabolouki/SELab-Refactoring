package codegenerator;

public class DirectAddress extends Address{

    public DirectAddress(int num, VarType varType) {
        super(num, varType);
    }

    public String toString() {
        return num+"";
    }
}
