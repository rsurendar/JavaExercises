package com.royal;

public class InstanceVariableFromStaticArea {


    int i = 10;


    public static void main(String[] args){

        InstanceVariableFromStaticArea t = new InstanceVariableFromStaticArea();
        System.out.println(t.i); //(valid)

    }

    public void methodOne() {
        System.out.println(i); // (valid)
    }
}
