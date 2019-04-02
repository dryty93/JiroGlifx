import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        //Instantiate Jiro Virtual Machine to read scroll
        Reader Jiro_VM = new Reader();
        char statementEnd = ';';
        String aLine = Jiro_VM.scroll_info;

        //split each line based on ; statement end
        String[] lines =  aLine.split(";");
        Map varDict = new HashMap();

        // this finds out if a variable is being declared based on an equal sign
        for(int x = 0; x< lines.length; x++) {
            if (lines[x].contains("=")) {
                String[] n = lines[x].split("=");
                String varName = n[0];
                String varVal = n[1].replaceAll(" ", "");

                // when a variables name contains a # it is a num
                if (varName.contains("#") && ! varVal.contains("+"))
                {
                    Variable intVar = new Variable(varName, varVal, false, true, false);
                    varDict.put(intVar.name,intVar.value);
                    //System.out.print(newNum.val);
                   // if(intVar.value.contains("+")){
                    int newInteger =Integer.parseInt(intVar.value);
                    Num newNum = new Num(intVar.name, newInteger,false);
                    newNum.val = newInteger;
                    System.out.println(varDict.get(newNum.name));

                }

                if(varName.contains("#") && varVal.contains("+"))
                {

                    String first_digit = varVal.split("\\+")[0];
                    String sec_digit = varVal.split("\\+")[1];
                    int conv_first_dig =Integer.parseInt(first_digit);
                    int conv_sec_dig =Integer.parseInt(sec_digit);
                    Integer newInteger = conv_first_dig + conv_sec_dig;
                    Num newNum = new Num(varName, newInteger,false);
                    varDict.put(newNum.name,newNum.val);
                    System.out.println(varDict.get(newNum.name));

                    //     System.out.println(newNum.name+" = " +newNum.val);



                }

                // this finds out if we are dealing with a string and creates a new string object
                else if (varName.contains("$"))

                {
                    Variable stringVar = new Variable(varName, varVal, true, false, false);
                    varDict.put("hello","for");
                    System.out.println(varDict.get("hello"));
                }

                else{
                    ;
                }
            }
        }
    }
    }

