import com.sun.org.apache.xpath.internal.operations.Bool;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Map;
import java.util.function.BooleanSupplier;

public class Variable {

    String name = "";
    String value = "";
    Boolean num = false;
    Boolean string = false;
    Boolean bool = false;

    public Variable(String name, String value, Boolean string, Boolean num, Boolean bool) {
        this.name = name;
        this.value = value;
        this.num = num;
        this.string = string;
        this.bool = bool;
        findType(this.value);

    }


    private String findType(String value) {

           if (this.name.contains("#")&& (! this.value.contains("\\+")))
           {
               int numAmt = Integer.parseInt(this.value);
               //System.out.println("mi,,");
           }

                else if(this.name.contains("#") && (this.value.contains("\\+"))){
                    String first_digit = value.split("\\+")[0];
                    String sec_digit = value.split("\\+")[1];
                    int first_dig_converted = Integer.parseInt(first_digit);
                    int sec_dig_converted = Integer.parseInt(sec_digit);
                    Integer an = operate(first_dig_converted,sec_dig_converted);
                    System.out.println(an+"P");
                }

            if (this.name.contains("$")) {
                this.string = true;
            }
            //  System.out.println(java.util.Arrays.toString(intSet));
            // System.out.println(this.num);

            // if(value == )

        return "OK";
        }



    public Integer operate(Integer first_dig, Integer second_dig)
    {
        Integer answer = first_dig + second_dig;
        return answer;
    }
}
