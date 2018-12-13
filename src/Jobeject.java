public class Jobeject {
    Variable variable = new Variable();
    Num num = new Num();
    String jiroVar;



    public String getData(String jiroVar){
        if(variable.num){
            num.numInit("x", 4);
            jiroVar = variable.name +" " + variable.value;
            System.out.println(jiroVar);

        }
        return jiroVar;

    }}
