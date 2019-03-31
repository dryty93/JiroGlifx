import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        //Instantiate Jiro Virtual Machine to read scroll

        Reader Jiro_VM = new Reader();
        //Jiro_VM.scroll_info;

        char statementEnd = ';';
        //System.out.print(Jiro_VM.scroll_info);
        String aLine = Jiro_VM.scroll_info;

        //split each line based on ; statement end
        String[] lines =  aLine.split(";");

        // this finds out if a variable is being declared based on an equal sign
        for(int x = 0; x< lines.length; x++) {
            if (lines[x].contains("=")) {
                String[] n = lines[x].split("=");
                String varName = n[0];
                String varVal = n[1].replaceAll(" ", "");

                // when a variables name contains a # it is a num
                if (varName.contains("#"))
                {
                    Variable intVar = new Variable(varName, varVal, false, true, false);
                    Map varDict = new HashMap();
                    varDict.put(intVar.name,intVar.value);
                  // System.out.print(newNum.val);
                   // if(intVar.value.contains("+")){
                    int newInteger =Integer.parseInt(intVar.value);
                    Num newNum = new Num(intVar.name, newInteger,false);
                    newNum.val = newInteger;
                    System.out.println(newNum.val);

                }

                // this finds out if we are dealing with a string
                else if (varName.contains("$"))

                {
                    Variable stringVar = new Variable(varName, varVal, true, false, false);
                    System.out.print(stringVar.value  + "string");
                }

                else{
                    ;
                }
            }
        }

    }

    }

