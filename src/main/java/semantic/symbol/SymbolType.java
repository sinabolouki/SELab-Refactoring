package semantic.symbol;

import codegenerator.VarType;

/**
 * Created by mohammad hosein on 6/28/2015.
 */
public enum SymbolType{
    Int {
        @Override
        public VarType getVarType() {
            return VarType.Int;
        }
    },
    Bool{
        @Override
        public VarType getVarType() {
            return VarType.Bool;
        }
    };

    public abstract VarType getVarType();
}
