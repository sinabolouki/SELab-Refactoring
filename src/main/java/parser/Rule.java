package parser;

import scanner.token.Token;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mohammad hosein on 6/25/2015.
 */
public class Rule {
    public NonTerminal lHS;
    public List<GrammarSymbol> rHS;
    public int semanticAction;

    public Rule(String stringRule) {
        int index = stringRule.indexOf("#");
        if (index != -1) {
            try {
            semanticAction = Integer.parseInt(stringRule.substring(index + 1));
            }catch (NumberFormatException ex){
                semanticAction = 0;
            }
            stringRule = stringRule.substring(0, index);
        } else {
            semanticAction = 0;
        }
        String[] splited = stringRule.split("->");
        lHS = NonTerminal.valueOf(splited[0]);
        rHS = new ArrayList<>();
        if (splited.length > 1) {
            String[] rHSs = splited[1].split(" ");
            for (String s : rHSs){
                try {
                    rHS.add(new GrammarSymbol(NonTerminal.valueOf(s)));
                } catch (Exception e) {
                        rHS.add(new GrammarSymbol(new Token(Token.getTyepFormString(s), s)));
                }
            }
        }
    }

}

class GrammarSymbol{
    public boolean isTerminal;
    public NonTerminal nonTerminal;
    public Token terminal;
    public GrammarSymbol(NonTerminal nonTerminal)
    {
        this.nonTerminal = nonTerminal;
        isTerminal = false;
    }
    public GrammarSymbol(Token terminal)
    {
        this.terminal = terminal;
        isTerminal = true;
    }
}