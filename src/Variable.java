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

    }


    private String findType(String value) {
        int[] intSet = new int[9];

        for (int i = 1; i < 10; i++) {

            intSet[i - 1] = i;
            if (this.name.contains("#")) {
                int numAmt = Integer.parseInt(this.value);
                if (numAmt == i) {
                    this.num = true;

                }
            }
            else if (this.name.contains("$")) {
                this.string = true;
            }
            //  System.out.println(java.util.Arrays.toString(intSet));
            // System.out.println(this.num);

            // if(value == )

        }
        return "Ok";

    }
}
