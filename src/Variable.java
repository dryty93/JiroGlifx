import com.sun.org.apache.xpath.internal.operations.Bool;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Variable {

    String name;
    String value;
    Boolean num;
    Boolean string;
    Boolean bool;


    public void init()
    {
        this.name = name;
        this.value = value;
        this.string = false;
        this.num = false;
        this.bool = false;

        findType(this.value);
    }

    public String findType(String value)
    {
         int[] intSet = new int[9];

        for(int i = 1; i < 10; i ++) {

            intSet[i - 1] = i;
            int numAmt = Integer.parseInt(this.value);
            if(numAmt == i) {
                this.num = true;

            }

            }
          //  System.out.println(java.util.Arrays.toString(intSet));
            System.out.println(this.num);





        return "Ok";
    // if(value == )

    }

}
