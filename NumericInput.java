package com.haybankz;

/**
 * Created by LENOVO on 3/24/2018.
 */
public class NumericInput extends TextInput {


    @Override
    public void add(char c) {

        /*check if char c is a digit/number
        * if true, c is added to current value
        * else c will be ignored*/
        if (Character.isDigit(c)) {
            super.add(c);
        }

    }


    //main method to test NumericInput class
    public static void main(String[] args) {
        TextInput textInput = new NumericInput();
        textInput.add('1');
        textInput.add('b');
        textInput.add('0');
        textInput.add('2');

        System.out.println("value = " + textInput.getValue());


    }

}