package com.royal;

public class StatVariables {

    int x = 10;
    static final int y = 20;

    public static  void main(String[] arggs)
    {
        StatVariables sv = new StatVariables();
        sv.x = 888;
       // sv.y= 999; /** java: cannot assign a value to final variable y*/
        StatVariables sv2 = new StatVariables();
        System.out.println(sv2.x+ "______________"+ sv2.y);
    }

}
